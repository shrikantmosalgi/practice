package com.springBatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.springBatch.model.Product;

@Configuration
public class BatchConfig {

	@Bean
	public Job jobBean(JobRepository jobRepository,JobExecutionListenerImpl listener,Step steps) {
		// for job we have to provide jobRepository,listener,steps as shown below
		return new JobBuilder("csvToDbJobName",jobRepository)
				.listener(listener)
				.start(steps)
				.build();		
	}
	
	@Bean
	public Step steps(JobRepository jobRepository,DataSourceTransactionManager transactionManager) {
		//for step builder we have to provide all below
		return new StepBuilder("jobStepName", jobRepository)
				.chunk(5,transactionManager)
				.reader()
				.processor()
				.writer()
				.build();		
	}
	
	//reader
	public FlatFileItemReader<Product> flatFileItemReader(){
		
	}
}
