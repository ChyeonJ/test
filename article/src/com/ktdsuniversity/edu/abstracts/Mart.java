package com.ktdsuniversity.edu.abstracts;
/**
 * 상속한 클래스가 추상 클래스 이면서 추상 메소드가 존재할 경우
 * 추상 메소드를 구현하지 않으면 에러가 발생한다.
 * 
 * 해결방법
 * 	1. 추상 메소드를 서브 클래스에서 구현한다.--> 추상 메소드를 Override한다.
 * 2. 서브 클래스를 추상 클래스로 변환한다. --> abstract 붙이면 되는데 => 인스턴스로 생성할 수 없음.
 */
public class Mart extends AbstractMart {
	
	public Mart(int productPrice) {
		super(productPrice);
	}
	
	@Override
	public int usePoint(Guest guest) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int discoiunt(Guest guest, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void givePoint(Guest guest, int amount) {
		// TODO Auto-generated method stub
		
	}
	
}
