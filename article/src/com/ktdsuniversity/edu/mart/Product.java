package com.ktdsuniversity.edu.mart;
/**
 * 상품 관리 클래스
 */
public class Product {
	
	//멤버변수
	private String productName;
	private int price;
	
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

}
