package exam;

public class Q1000 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		int a = 1;
		int b = 2;
		int c = a + b;
		
		System.out.println("1번 문제 결과 : " + c);
		
		//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		
		a = 3;
		b = 2;
		c = a - b;
		
		System.out.println("2번 문제 결과 : " + c);
		
		//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		
		a = 1;
		b = 3;
		c = a / b;
		
		System.out.println("3번 문제 결과 : " + c);
		
		// 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
		
		a = 1;
		b = 2;
		c = a * b;
		
		System.out.println("4번 문제 결과 : " + c);
		
		// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		a = 7;
		b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.err.println(a % b);
		System.out.println("5번 문제 결과---------------------");
		
		//1998년생인 내가 태국에서는 2541년생?!
		/*  ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다.
		 *  공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
		 *  불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.
		 *  반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
		 */
		
		int acYear = 2541;
		int result = acYear - 543; // 불기년도를 알게 된 계기는 우리나라는 1998년인데 태국은 2541년이라고 해서, 2541 - 1998년 해서 543년이 나옴
		
		System.out.println("6번 문제 결과 : " + result);
		
	}

}
