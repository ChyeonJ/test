package com.ktdsuniversity.edu.coffee;

public class CoffeeShopTest {
	
	public static void main(String [] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노 (Hot)", 4500,100);
		Coffee iceCoffee = new Coffee("아이스 티", 4000,60);
		
		//CoffeeShopArray starbuck = new CoffeeShopArray(hotCoffee, iceCoffee); => Array 인스턴스 생성
		CoffeeShop starbuck = new CoffeeShop(hotCoffee, iceCoffee);

		 starbuck.orderCoffee("아메리카노 (Hot)", 103); //생성자가 아닌 곳에서 this가 있으면 
		 starbuck.orderCoffee("아이스 티", 14);
		 starbuck.orderCoffee("아이스 티", 14);
		 starbuck.orderCoffee("아이스 티", 14);
		 starbuck.orderCoffee("아이스 티", 14);
		 starbuck.orderCoffee("아이스 티", 14);
		 
		
	}
	
}
