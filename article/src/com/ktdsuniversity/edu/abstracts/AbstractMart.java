package com.ktdsuniversity.edu.abstracts;
//class 생성 후 class 앞에 abstract 기재
/**
 * public class name : 인스턴스로 생성할 수 있는 일반 클래스 정의
 * public abstract class Name : 인스턴스로 생성할 수 없는 추상 클래스 정의.
 */
public abstract class AbstractMart {
	
	private int safe;
	private int productPrice;
	/**
	 * 고객에게 거슬러 줄 돈
	 */
	private int remainMoney;
	
	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public void sell(Guest guest, int sellCount, int money) {
		this.remainMoney = money;
		
		int guestPoint = this.usePoint(guest);
		
		//판매가격
		int amount = sellCount * this.productPrice;
		
		//할인
		amount -= this.discoiunt(guest, amount);
		
		if (money + guestPoint < amount) {
			System.out.println("돈이 모자랍니다. 구매가격 : " + amount + ", 손님이 낸 돈 : " + money);
			return;
		}
		
		//손님이 마트에 돈을 지불.
		guest.pay(money);
		
		this.givePoint(guest, amount);

		if(amount > guestPoint) {
			this.remainMoney -= amount  - guestPoint;
		}
		
		this.safe += money + guestPoint - this.remainMoney;
		System.out.println("매출액 : " + this.safe);
		System.out.println("거스름돈 : " + this.remainMoney);
		
		//마트가 손님에게 거슬러 준다.
		guest.giveMoney(this.remainMoney);
		this.remainMoney = 0;
		
	}
	
	public abstract int usePoint(Guest guest);
	
	public abstract void givePoint(Guest guest, int amount);
	
	public abstract int discoiunt(Guest guest, int amount);
	
}
