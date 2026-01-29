package com.ktdsuniversity.edu.mart;
/**
 * 테스트
 */
public class MartTest {
	public static void main(String[] args) {
		
		Product a = new Product("비싼옷", 100_000);
		Product b = new Product("싼옷", 1_000);
		Product c = new Product("땡처리", 999);
		
		NomalMart pr = new NomalMart(a, b, c);
		
		Customer cs1 = new Customer(10_000, 1000, null);
		
		NomalMart conven = new Convenience(a, b, c);
		
		//NomalMart 일반마트
		pr.sell(cs1, "땡처리");
		
		System.out.println("----------------------------------------");
		
		//Convenience 편의점
		if(conven instanceof Convenience cv) {
			cv.sell(cs1, "싼옷");
			cv.sell(cs1, "싼옷");
			cv.sell(cs1, "싼옷");

		}
		
	}
}
