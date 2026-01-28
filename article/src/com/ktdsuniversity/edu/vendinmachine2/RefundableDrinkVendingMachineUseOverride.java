package com.ktdsuniversity.edu.vendinmachine2;

import com.ktdsuniversity.edu.vendinmachine2.item.Drink;
import com.ktdsuniversity.edu.vendinmachine2.machine.DrinkVendingMachine;


//오버라이딩 예제
public class RefundableDrinkVendingMachineUseOverride extends DrinkVendingMachine {

	public RefundableDrinkVendingMachineUseOverride(Drink drink1, Drink drink2, Drink drink3, Drink drink4) {
		super(drink1, drink2, drink3, drink4);
	}
	
	@Override
	public int pressDrinkButton(int drinkNumber, int pressCount, int inputMoney) {		//오버라이딩을 통해 애는 환불까지 알아서 싹 진행해주는 코드이다.
		int orderPrice = super.pressDrinkButton(drinkNumber, pressCount, inputMoney);
		
		if (super.getInputMoney() > 0) {
			this.refund();
		}
		return orderPrice;
	}

	/**
	 * 사용자가 돈을 넣은 후 존재하지 않는 음료를 골랐을 때, 사용자에게 돈을 돌려준다. 
	 * DrinkVendingMachine의 멤버변수와 order 기능의 수정이 필요.
	 */
	public void refund() {
		int remainMoney = super.getInputMoney();	//inputMoney 변수안에 넣어두면 결국 돈이 나옴
		System.out.println(remainMoney + "원 환불 되었습니다.");
	}

}