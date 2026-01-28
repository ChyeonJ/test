package com.ktdsuniversity.edu.mart;
/**
 * 구매자 클래스
 * 소지금, 누적 포인트, 등급 관리
 */
public class Customer {
	

	private int money;
	private double point;
	private String grade;
	
	public Customer(int money, double point, String grade) {
		this.money = money;
		this.point = point;
		this.grade = grade;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public double getPoint() {
		return point;
	}
	
	public void setPoint(double point) {
		this.point = point;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
