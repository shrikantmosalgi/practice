package com.springBatch.rhs.config;


import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.springBatch.rhs.model.Product;


@Configuration
public class BatchConfig {

    @Value("${output.file.path}")
    private String outputFilePath;

    @Bean
    public Job jobBean(JobRepository jobRepository, JobExecutionListenerImpl listener, Step steps) {
        return new JobBuilder("dbToCsvJob", jobRepository)
                .listener(listener)
                .start(steps)
                .build();
    }

    @Bean
    public Step steps(JobRepository jobRepository,
                      PlatformTransactionManager transactionManager,
                      JdbcCursorItemReader<Product> reader,                      
                      FlatFileItemWriter<Product> writer) {
        return new StepBuilder("dbToFileStep", jobRepository)
                .<Product, Product>chunk(5, transactionManager)
                .reader(reader)  //if want processor then you can add here
                .writer(writer)
                .build();
    }

    // Reader: from database
    @Bean
    public JdbcCursorItemReader<Product> reader(DataSource dataSource) {
        return new JdbcCursorItemReaderBuilder<Product>()
                .name("productJdbcReader")
                .dataSource(dataSource)
                .sql("SELECT product_id AS productId, product_name AS productName, description, price, discount, discounted_price AS discountedPrice FROM products")
                .beanRowMapper(Product.class)
                .build();
    }

    // Processor (optional)
	
	  

    // Write to CSV file
 

    @Bean
    public FlatFileItemWriter<Product> writer() {
        BeanWrapperFieldExtractor<Product> fieldExtractor = new BeanWrapperFieldExtractor<>();
        fieldExtractor.setNames(new String[]{
            "productId", "productName", "description", "price", "discount", "discountedPrice"
        });

        DelimitedLineAggregator<Product> lineAggregator = new DelimitedLineAggregator<>();
        lineAggregator.setDelimiter(",");
        lineAggregator.setFieldExtractor(fieldExtractor);

        return new FlatFileItemWriterBuilder<Product>()
                .name("productCsvWriter")
                .resource(new FileSystemResource(outputFilePath))
                .lineAggregator(lineAggregator)
                .headerCallback(writer -> writer.write("productId,productName,description,price,discount,discountedPrice"))
                .build();
    }

    
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}

