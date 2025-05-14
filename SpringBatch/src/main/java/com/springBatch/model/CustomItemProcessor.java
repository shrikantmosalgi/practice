package com.springBatch.model;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {

//	@Override
//	public Product process(Product item) throws Exception {
//		// write process logic here
//		int discountPercent = Integer.parseInt(item.getDiscount().trim());
//		Double originalPrice = Double.parseDouble(item.getPrice());
//		double discount = (discountPercent/100)* originalPrice;
//		double finalPrice =originalPrice - discount;
//		item.setDiscountedPrice(String.valueOf(finalPrice));
//		
//		return item;
//	}
	
	@Override
    public Product process(Product item) throws Exception {
        double discountedPrice = item.getPrice() - (item.getPrice() * item.getDiscount() / 100.0);
        item.setDiscountedPrice(discountedPrice);
        return item;
    }

}
