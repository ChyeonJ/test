package com.ktdsuniversity.edu.vendingmachine.restore;
//상속 변경
import com.ktdsuniversity.edu.vendingmachine.item.DrinkMachine;
import com.ktdsuniversity.edu.vendingmachine.machine.DrinkMachineArray;

public class RestoreMoney extends DrinkMachineArray{
	
	public RestoreMoney(DrinkMachine index1,DrinkMachine index2,DrinkMachine index3,DrinkMachine index4) {
		super(index1, index2, index3, index4);
	}
	
	/**
	 * 사용자가 돈을 넣은 후 존재하지 않는 음료를 골랐을 때, 사용자에게 돈을 돌려준다.
	 * DrinkMachine의 멤버변수와 orderDrink 기능의 수정 필요
	 */
	public void refund() {
		int reMoney = super.getInputMoney();
		if(reMoney > 0) {
			System.out.println(reMoney + "원 환불 되었습니다.");
		}
				
	}
	
}
