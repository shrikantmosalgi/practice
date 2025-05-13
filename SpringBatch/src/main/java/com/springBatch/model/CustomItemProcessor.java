package com.springBatch.model;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product item) throws Exception {
		// write process logic here
		int discountPercent = Integer.parseInt(item.getDiscount());
		Double originalPrice = Double.parseDouble(item.getPrice());
		double discount = (discountPercent/100)* originalPrice;
		double finalPrice =originalPrice - discount;
		item.setDiscountedPrice(String.valueOf(finalPrice));
		
		return item;
	}

}
