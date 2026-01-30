package com.ktdsuniversity.edu.exceptions;

public class RandomExtractNumbers {
	
	private String[] numbers;
	
	public RandomExtractNumbers() {
		this.numbers = new String[100];
		
		int index = 0;
		for(int i = 0; i < 10; i++) {
			// 0 ~ 99 하나.
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (int)(Math.random() * 1_000_000) + "";
			
		}
		
		for(int i = 0; i < 10; i++) {
			// 0 ~ 99 하나.
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (char)((int)(Math.random() * 26) + 97) + "";
												  //122 => 소문자 z 아스키코드
												  //97 => 소문자 a
			
		}
	}
	
	// 브라우저 => 서버로 데이터를 전송 => 데이터베이스에 저장.
	// 브라우저에 서버로 전송된 데이터의 형태가 어떠한지 그 누구도 모른다.
	//	- 데이터 검증이 반드시 필요 ==> Validation Logic => 예외처리. (데이터를 알맞게 입력했냐?)
	
	public void printNumber(int index) {
		
		//this.naubers의 index에 존재하는 값을 출력한다.
		if(!(index > this.numbers.length)) {
			if(this.numbers[index] != null && this.numbers[index].matches("^[0-9]+${1,7}")) {
				// 값이 숫자인 경우 그대로 출력하고
				System.out.println("값이 숫자 : " + this.numbers[index]);
			}
		}		// 숫자가 아닌 경우 0을출력한다.
			System.out.println(0);
	}
	
	public static void main(String[] args) {
		RandomExtractNumbers ren = new RandomExtractNumbers();
		int index = 0;
		for(int i = 0; i < 50; i++) {
			index = (int) (Math.random() * 200);
			ren.printNumber(index);
		}
			
	}
	
}
