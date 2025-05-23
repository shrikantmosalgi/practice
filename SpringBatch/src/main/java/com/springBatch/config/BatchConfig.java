package com.springBatch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.springBatch.model.CustomItemProcessor;
import com.springBatch.model.Product;

@Configuration
public class BatchConfig {
	
	@Value("${input.file.path}")
	private String filePath;


	@Bean
	public Job jobBean(JobRepository jobRepository,JobExecutionListenerImpl listener,Step steps) {
		// for job we have to provide jobRepository,listener,steps as shown below
		System.out.println();
		return new JobBuilder("csvToDbJobName",jobRepository)
				.listener(listener)
				.start(steps)
				.build();		
	}
	
	@Bean
	public Step steps(JobRepository jobRepository,DataSourceTransactionManager transactionManager,
			ItemReader<Product> reader,ItemProcessor<Product,Product> processor,ItemWriter<Product> writer) {
		//for step builder we have to provide all below
		return new StepBuilder("jobStepName", jobRepository)
				.allowStartIfComplete(true)
				.<Product,Product>chunk(5,transactionManager)
				.reader(reader)
				.processor(processor)
				.writer(writer)
				.build();		
	}
	
	//reader
	@Bean
	public FlatFileItemReader<Product> reader(){
		
		return new FlatFileItemReaderBuilder<Product>()
				.name("itemReader")
				//.resource(new ClassPathResource("D:\\testFolder\\test\\product.csv"))  /*in this case file present in resource so */
				.resource(new FileSystemResource(filePath))
				.delimited()
				.delimiter(",")
				.names("productId","productName","description","price","discount")
				.targetType(Product.class)
				.strict(false) //this will not give error if i/p is not present
				.linesToSkip(1)
				.build();				
	}
	
	//processer
	@Bean
	public ItemProcessor<Product,Product> itemProcessor(){
		
		return new CustomItemProcessor();  //create this class because this is our need/requirement
	}
	
	//writer
	@Bean
	public ItemWriter<Product> itemWriter(DataSource dataSource){
		
		return new JdbcBatchItemWriterBuilder<Product>()
			.sql("insert into products (product_id,product_name,description,price,discount,discounted_price)"
					+ " values (:productId,:productName,:description,:price,:discount,:discountedPrice)")
			.dataSource(dataSource)
			.beanMapped()
			.build();
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
	    return new DataSourceTransactionManager(dataSource);
	}
}
