package oop;

public class FoodTest {

	public static void main(String[] args) {
		// FoodStoreApp Test
		FoodStoreApp fsa = new FoodStoreApp();
		
		fsa.temperatureButton("냉수");
		fsa.temperatureButton("정수");
		fsa.temperatureButton("온수");
		fsa.waterPress("한컵");
		fsa.filterExp("교체");
		fsa.waterPress("반컵");
		fsa.waterPress("한컵");
		fsa.filterExp("");
		fsa.disinfection();

	}

}
