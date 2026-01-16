package exam;

public class Q120804 {

	public static void main(String[] args) {
		// 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
		
		int num1 = 3;
		int num2 = 4;
		int result = num1 * num2;
		
		System.err.println(result);
		
		//머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
		
		int age = 40;
		int year = 2026;	//문제는 2022기준이지만 올해는 2026이니 요걸로 하겠음
		result = year - age;
		
		System.out.println(result);
		
		// 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
		
		num1 = 2;
		num2 = 3;
		result = num1 - num2;
		
		System.out.println(result);
		
		// 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
		
		num1 = 3;
		num2 = 2;
		result = num1 / num2;
		
		System.out.println(result);
		
		//정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
		
		num1 = 10;
		num2 = 5;
		result = num1 / num2;
		
		System.out.println(result);
		
		
	}

}
