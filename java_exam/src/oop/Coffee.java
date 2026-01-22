package oop;

/**
 * 커피 메뉴를 나타내는 데이터 클래스.
 */
public class Coffee {
	
	/**
	 * 커피 메뉴의 이름.
	 */
	String name;
	
	/**
	 * 커피 메뉴의 가격
	 */
	int price;
	
	/**
	 * 생성자 생성
	 * @param name 커피의 이름
	 * @param price 커피의 가격
	 */
	public Coffee(String name, int price) {
		this.name = name;	//this. 자체는 생성자가 만들어준 인스턴스 자체. 멤버변수 가르키고 있는 것도 맞음
		this.price = price;
	}
	
}
