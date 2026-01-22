package oop;
/**
 * <pre>
 * 상품[ ] – Data class
	맴버변수 상품명 가격 재고
	박카스 (상품명: 박카스, 가격: 900원, 재고 15개)
	몬스터 (상품명: 몬스터, 가격: 1500원, 재고 20개)
	핫식스 (상품명: 핫식스, 가격 1300원, 재고 10개)
	밀키스 (상품명: 밀키스, 가격 1400원, 재고 5개)
	
	기능이 없는 메소드

 * </pre>
 */
public class DrinkMachine {
	/**
	 * 음료수 이름
	 */
	String drinkName;
	/**
	 * 음료수 가격
	 */
	int price;
	/**
	 * 음료수 재고
	 */
	int stock;
		
	public DrinkMachine(String name, int price, int stock) { //기본 생성자
		// 초기값 설정
		this.drinkName = name;	//this. => 멤버 변수에 drinkName 가르킴
		this.price = price;
		this.stock = stock;
		
	}

}
