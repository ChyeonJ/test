package oop;

public class ParamTest {

	public static void sell(DrinkMachine drink) {
		drink.stock -= 1;
		System.out.println(drink.drinkName + ", " + drink.price + ", " + drink.stock);
	}
	
	public static void printString(String str) {
		str += "이어붙는것이야!";
		System.out.println(str);
	}
	
	public static void print(int number) {
		number += 10;
		System.out.println(number);
	}
	
	
	public static void main(String[] args) {
		
		DrinkMachine drink = new DrinkMachine("A", 1500, 3);
		sell(drink);
		System.out.println(drink.drinkName + ", " + drink.price + ", " + drink.stock);
		
		
		int number = 10;
		print(number);
		System.out.println(number);
		
		String str = "최현종";
		printString(str);
		System.out.println(str);
		

	}
}