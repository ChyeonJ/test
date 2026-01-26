package com.ktdsuniversity.edu.coffee;

public class CoffeeShopTest {
	
	public static void main(String [] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노 (Hot)", 4500,100);
		Coffee iceCoffee = new Coffee("아이스 티", 4000,60);
		
		//CoffeeShopArray starbuck = new CoffeeShopArray(hotCoffee, iceCoffee); => Array 인스턴스 생성
		CoffeeShop starbuck = new CoffeeShop(hotCoffee, iceCoffee);
		// 셍성자 오버로딩 이름은 똑같은데 파라미터만 다른 경우
		//CoffeeShop starbuck = new CoffeeShop(); //=> 파라미터가 없어서 오류남 결과가

		 starbuck.orderCoffee("아메리카노 (Hot)", 103); //생성자가 아닌 곳에서 this가 있으면 
		 starbuck.orderCoffee("아이스 티", 14);
		 starbuck.orderCoffee("아이스 티", 14);
		 starbuck.orderCoffee("아이스 티", 14);
		 starbuck.orderCoffee("아이스 티", 14);
		 starbuck.orderCoffee("아이스 티", 14);
		 
		 //메소드 오버로딩 사용
		 // price = starbuks.orderCoffee(); => 2를 입력하면 아이스 커피를 1개 주문하겠다가 된다
		 //starbuk.orderCoffee("아메리카노 (Hot)");
		 
		
	}
	
}
