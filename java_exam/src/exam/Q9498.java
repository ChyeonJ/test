package exam;

public class Q9498 {

	public static void main(String[] args) {
		// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 
		//C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		int subject1 = 90;
		
		if (subject1 >= 90 && subject1 <= 100) {
			System.out.println("A");
		}
		else if (subject1 >= 80) {
			System.out.println("B");
		}
		else if (subject1 >= 70) {
			System.out.println("C");
		}
		else if (subject1 >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
