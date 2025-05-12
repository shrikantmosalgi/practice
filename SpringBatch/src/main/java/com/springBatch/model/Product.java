package com.springBatch.model;


public class Product {

	private int productId;
	private String productName;
	private String description;
	private String price;
	private String discount;
	
	public Product() {
		
	}

	public Product(int productId, String productName, String description, String price, String discount) {
		
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.discount = discount;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	
}
