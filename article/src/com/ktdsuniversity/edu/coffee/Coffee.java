package com.ktdsuniversity.edu.coffee;

/**
 * 커피 메뉴를 나타내는 데이터 클래스.
 */
public class Coffee {
	
	/**
	 * 커피 메뉴의 이름.
	 */
	private String name;
	
	/**
	 * 커피 메뉴의 가격
	 */
	private int price;
	/**
	 * 하루동안 판매할 수 있는 커피의 양
	 */
	private int stock;
	
	/**
	 * 생성자 생성
	 * @param name 커피의 이름
	 * @param price 커피의 가격
	 */
	public Coffee(String name, int price, int stock) {
		this.name = name;	//this. 자체는 생성자가 만들어준 인스턴스 자체. 멤버변수 가르키고 있는 것도 맞음
		this.price = price;
		this.stock = stock;
	}
	
	// 클래스 멤버라 필드에 있는 멤버변수 사용 불가능 멤버변수에 영향을 받는게 아닌 파라미터의 영향만 받는게 스테틱 메소드다
	public static boolean isPositiveNumber(int number) {
		//System.out.println(this.stock);
		return number > 0;
	}
	
	
	//getter : Coffee 클래스 외부로 멤버변수의 값을 노출시키는 코드.
	//setter : 외부에서 Coffee 클래스 내부로 멤버변수 값을 변경시키는 코드.
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
