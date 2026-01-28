package com.ktdsuniversity.edu.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.DrinkMachine;
import com.ktdsuniversity.edu.vendingmachine.machine.DrinkMachineArray;
import com.ktdsuniversity.edu.vendingmachine.restore.RestoreMoney;

/**
 * 제발 되라잇!
 */
public class DrinkMachineTest {
	
	public static void main(String [] args) {
		
		DrinkMachine bak = new DrinkMachine("박카스", 900, 15);
		DrinkMachine mon = new DrinkMachine("몬스터", 1_500, 20);
		DrinkMachine hot = new DrinkMachine("핫식스", 1_300, 10);
		DrinkMachine mil = new DrinkMachine("밀키스", 1_400, 5);
		
		DrinkMachineArray da = new RestoreMoney(bak, mon, hot, mil);
		
		//주문기능
		int result = da.orderDrinK(14, 3, 10000);
		System.out.println("첫번째 결과 : "  + result);
		System.out.println("주문금액 : " + result);
		
		if (da instanceof RestoreMoney rfMachine) {
			rfMachine.refund();
		}
		
		result = da.orderDrinK(0, 15, 4000);
		System.out.println("두번째 결과 : "  + result);
		
		result = da.orderDrinK(1, 17,100);
		System.out.println("세번째 결과 : "  + result);
		
		//입고 기능
		da.addProduct(2, 1);
		da.addProduct(5, 1);
		da.addProduct(1, 20);
		da.addProduct(0, 10);
		
		//출력기능
		da.printAllDrink();
		
	}

}
