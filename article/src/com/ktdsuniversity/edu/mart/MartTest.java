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
		
		Customer cs1 = new Customer(10_000, 10000, null);
		
		NomalMart conven = new Convenience(a, b, c);
		
		//NomalMart 일반마트
		pr.sell(cs1, "싼옷");
		pr.sellerStatus();
		
		System.out.println("----------------------------------------");
		
		//Convenience 편의점
		if(conven instanceof Convenience cv) {
			cv.convenienceSell(cs1, "싼옷");
			cv.convenienceSell(cs1, "싼옷");
			cv.convenienceSell(cs1, "싼옷");

		}
		
	}
}
