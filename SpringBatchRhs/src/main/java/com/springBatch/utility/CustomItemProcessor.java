package com.springBatch.utility;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.springBatch.rhs.model.Product;

@Component
public class CustomItemProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}



}
