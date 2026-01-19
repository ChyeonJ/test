package exam;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		
		int i = 1;
		int sum = 1;
		while (n > 1) {
			sum += n;
			n--;
		}
		
// 내가 한 방법		
		int hap = 0;
		
		while (i <= n) {	// = 입력 받는 값 n -> i = 1 -> 조건식 1 < 3 (1,2) 이래서 =을 붙여야함. 3까지는 반복하니까.
			
			hap += i;
			i++;
			
		}
		System.out.println(sum);
	}
	
}
