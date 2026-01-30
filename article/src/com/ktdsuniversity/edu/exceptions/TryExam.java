package com.ktdsuniversity.edu.exceptions;

public class TryExam {
	
	public static void handleException() {
		try {
		Class.forName("com.ktdsuniversity.edu.exceptions.Tryexam");
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	
	public static void numberFormatExam(String str) {
		int value = 0;
		if( str != null) {
			try {
				System.out.println("변환 전!");
				value = Integer.parseInt(str);	//예외 발생 가능성 높음!
				System.out.println("변환 후!"); //예외가 발생하면 발생한 코드부터 멈추고 catch로 바로 이동한다.
			}
			catch (NumberFormatException nfe){	//타입의 변수명은 대문자만 골라서 쓰는게 국룰
				System.out.println(nfe.getMessage());
				nfe.printStackTrace(); //에러가 발생하게 된 원인들을 모두 출력 (Call Stack을 모두 출력)
										//0을 알아서 반환한다.
			}
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		numberFormatExam("100000");
		numberFormatExam("100123zsd0");
		numberFormatExam("100000000000000000");
		numberFormatExam("asdasdasd");
		
		handleException();
	}
	
}
