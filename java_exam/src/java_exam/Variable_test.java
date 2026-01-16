package java_exam;

public class Variable_test {

	public static void main(String[] args) {
		// 실습 1 : 정수 <-> 부동소수점의 변환 정수 -> 부동소수
		int num = 10;
		float fnum = num; //int num은 float fnum보다 작으니 묵시적 변환 가능
		double dnum = num; // int num은 double dnum보다 작으니 묵시적 변환 가능
		System.out.println(num); // 10
		System.out.println(fnum); // 10.0
		System.out.println(dnum); // 10.0
		
		// 실습 2 : 정수 <-> 부동소수점의 변환 부동소수 -> 정수
		float fnum1 = 10.9f;
		int num1 = (int) fnum1;
		System.out.println(fnum1); // 10.9
		System.out.println(num); // 10
		
		//부동소수점 소수점 처리
		double dnum1 = 10.1;
		//소수점 올림
		dnum1 = Math.ceil(dnum1); // 11.0 ceil 사용 시 무조건 올림
		System.out.println(dnum1);
		//소수점 버림
		dnum1 = 10.9;
		dnum1 = Math.floor(dnum1); // 10.0 floor 사용 시 무조건 버림
		System.out.println(dnum1);
		//소수점 반올림
		dnum1 = 15.18;
		dnum1 = Math.round(dnum1);
		System.out.println(dnum1);// 15.0 round 사용 시 0.1의 자리가 5이하일 시 버림
		dnum1 = 10.56;
		dnum1 = Math.round(dnum1);
		System.out.println(dnum1);// 11.0 round 사용 시 0.1의 자리가 5이상일 시 올림
		
		// 29.37을 29.4로 올림 처리하기
		double dnum3 = 29.37;
		double dnum4 = dnum3 * 10;
		System.out.println(dnum4); //293.7
		
		dnum4 = Math.round(dnum4);
		System.out.println(dnum4); // 294.0
		
		double dnum5 = dnum4 / 10;
		System.out.println(dnum5); // 29.4
		
	}	

}
