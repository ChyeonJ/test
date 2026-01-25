package com.ktdsuniversity.edu.restaurant.menu;

public class RestaurantMenu {
	private String productName;
	private int productPrice;
	private double alcohol;
	private int productWeight;
	private int stock;
	
	public RestaurantMenu(String productName, int productPrice, double alcohol, int productWeight, int stock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.alcohol = alcohol;
		this.productWeight = productWeight;
		this.stock = stock;
		
	}
	
	public int getProductWeight() {
		return productWeight;
	}
	
	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public double getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	

}
