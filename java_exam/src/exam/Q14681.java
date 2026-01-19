package exam;

public class Q14681 {

	public static void main(String[] args) {
		// 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. 
		//"Quadrant n"은 "제n사분면"이라는 뜻이다.
		
		int dotA = -12;
		int dotB = 5;
		
		if(dotA >= 0 && dotB >= 0) {
			System.out.println("제 1사분면");
		}
		else if (dotA < 0 && dotB >= 0) {
			System.out.println("제 2사분면");
		}
		else if (dotA < 0 && dotB < 0) {
			System.out.println("제 3사분면");
		}
		else if (dotA >= 0 && dotB < 0) {
			System.out.println("제 4사분면");
		}

	}

}
