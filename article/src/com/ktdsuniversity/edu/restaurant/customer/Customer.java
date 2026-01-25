package com.ktdsuniversity.edu.restaurant.customer;

public class Customer {
	
	private String customerName;
	private double customerDrunk;
	private int customerFull;
	private int coustomerMoney;
	

	
	public Customer(String customerName, double customerDrunk, int customerFull, int coustomerMoney) {
		this.customerName = customerName;
		this.customerDrunk = customerDrunk;
		this.customerFull = customerFull;
		this.coustomerMoney = coustomerMoney;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerDrunk() {
		return customerDrunk;
	}
	public void setCustomerDrunk(double customerDrunk) {
		this.customerDrunk = customerDrunk;
	}
	public int getCustomerFull() {
		return customerFull;
	}
	public void setCustomerFull(int customerFull) {
		this.customerFull = customerFull;
	}
	public int getCoustomerMoney() {
		return coustomerMoney;
	}
	public void setCoustomerMoney(int coustomerMoney) {
		this.coustomerMoney = coustomerMoney;
	}
	
	

}
