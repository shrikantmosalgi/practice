package com.springBatch.rhs.model;


public class Product {

	private int productId;
	private String productName;
	private String description;
	private double price;            // Changed
    private double discount;         // Changed
    private double discountedPrice;
    
    
	public Product() {
		
	}



	public Product(int productId, String productName, String description, double price, double discount,
			double discountedPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.discountedPrice = discountedPrice;
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


	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getDiscountedPrice() {
		return discountedPrice;
	}


	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	
}
