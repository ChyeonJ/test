package com.ktdsuniversity.edu.vendinmachine2.machine;

import com.ktdsuniversity.edu.vendinmachine2.item.Drink;

public class DrinkVendingMachine {

	/* 2026-01-28 : 환불 기능 추가를 위한 수정 시작 */
	private int safe;
	private int inputMoney;	//쌓이거나 쌓이지 않거나 때문에 변수 두개 추가
	/* 2026-01-28 : 환불 기능 추가를 위한 수정 끝 */
	
	private Drink[] drinks;
	
	public DrinkVendingMachine( Drink drink1, Drink drink2, Drink drink3, Drink drink4 ) {
		this.drinks = new Drink[4];
		this.drinks[0] = drink1;
		this.drinks[1] = drink2;
		this.drinks[2] = drink3;
		this.drinks[3] = drink4;
	}
	
	/* 2026-01-28 : 환불 기능 추가를 위한 수정 시작 */
	public int getInputMoney() {
		return this.inputMoney;
	}
	/* 2026-01-28 : 환불 기능 추가를 위한 수정 끝 */
	
	public Drink[] getDrinks() {
		return this.drinks;
	}
	
	public int pressDrinkButton(int drinkNumber, int pressCount, int inputMoney) {
		/* 2026-01-28 : 환불 기능 추가를 위한 수정 시작 */
		this.inputMoney = inputMoney;	//사용자가 넣은 돈을 넣어줌
		/* 2026-01-28 : 환불 기능 추가를 위한 수정 끝 */
		
		if (drinkNumber < 0 || drinkNumber >= this.drinks.length) { //그 제품이 없다 return 0 돌려준다 넣은 돈을 그대로
			return 0;
		}
		
		// 0 1 2 3
		Drink pressedDrink = this.drinks[drinkNumber];
		
		if (pressedDrink.getStock() == 0) {
			System.out.println("품절 되었습니다!");
			return 0;	// input머니가 5000원이면 돌려줌 5000원
		}
		else if (pressedDrink.getStock() < pressCount) {
			pressCount = pressedDrink.getStock();
		}
		
		int stock = pressedDrink.getStock();
		stock -= pressCount;
		
		/* 2026-01-28 : 환불 기능 추가를 위한 수정 시작 */
		this.safe += pressCount * pressedDrink.getPrice();	//돈통에 주문한 금액만큼 넣어줌
		this.inputMoney -= pressCount * pressedDrink.getPrice(); //사용자가 주문한 금액만큼 빼줌 inputMoney가 사용자가 넣은 돈이자 거스름돈이 됨
		/* 2026-01-28 : 환불 기능 추가를 위한 수정 끝 */
		
		pressedDrink.setStock(stock);
//		pressedDrink.stock -= pressCount;
		return pressedDrink.getPrice() * pressCount;
	}
	
	public void fillDrink(int drinkNumber, int quantity) {
		if (drinkNumber < 0 || drinkNumber >= this.drinks.length) {
			return;
		}
		
		// 0 1 2 3
		Drink pressedDrink = this.drinks[drinkNumber];
		
		int stock = pressedDrink.getStock();
		stock += quantity;
		pressedDrink.setStock(stock);
	}
	
	public void printAllDrinkInfo() {
		for (int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].getName() + " " + this.drinks[i].getStock() + "개 남았습니다.");
		}
	}
	
	
}