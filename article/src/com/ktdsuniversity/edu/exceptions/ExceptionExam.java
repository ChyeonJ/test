package com.ktdsuniversity.edu.exceptions;

public class ExceptionExam {
	
	public static void nullExam(String str) {
		//모든 인스턴스에서 .을 사용할 때, 무조건 null 체크를 해야하는가?
		// .을 사용하려는 인스턴가 null이 될 수 있는 가능성이 조금이라도 존재할 때만 null 체크한다.
		
		//str이 비어있지 않으면 내용을 출력한다.
		if(str != null &&  !str.isEmpty()) {
			System.out.println(str);
		}
	}
	
	public static void arrayIndexExam(String[] arr, int index) {
		if (arr != null && index >= 0 && index < arr.length) {
			System.out.println(arr[index]);
		}
	}
	
	public static void numberFormatExam(String str) {
		
		if(str == null) {
			System.out.println(0);
			return;
		}
		
		//언더바 없애기
		str = str.replace("_", "");

		//str의 자릿수를 계산하는데 11자리, 21억이 넘어가면 0으로 치환
		if(str.matches("^[0-9]+${1,10}")) { //정규표현식 0 ~ 9로 시작하는게 10번 반복해서 조사
			long tempNum = Long.parseLong(str);
			if(tempNum > Integer.MAX_VALUE) {
				tempNum = 0;
			}
			//숫자를 정수로 변경한다.
			int num = (int) tempNum;
			System.out.println(num);
		}else {
			System.out.println(0);
		}
		
	}
	
	public static void main (String [] args) {
		
//		nullExam("asd");
//		nullExam("   ");
//		nullExam("asd");
//		nullExam(null);
		
//		arrayIndexExam(new String[] {"a", "b"} ,0);
//		arrayIndexExam(new String[] {"a", "b"} ,1);
//		arrayIndexExam(null ,0);
		
		numberFormatExam("10");
		numberFormatExam("2000");
		numberFormatExam("3_000_000");
		numberFormatExam("3_000_000_000");
		numberFormatExam("1.22121");
		numberFormatExam(null);
		
		
		
	}
	
}
