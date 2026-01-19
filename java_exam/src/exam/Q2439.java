package exam;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int j = 1;
		
		while(n >= i) {	//시작할 떄 i이 5보다 크거나 같아야 한다.
			j = 1;	//j를 1로 초기값을 설정한다.
			while(j <= n-i) { // 1 4보다 작거나 같으면 멈춰라
				System.out.print(" ");	// 공백 한 번 j 1증가 반복 4번
				j++; // 1증가
			}
			while(j <= n) { // 4이 5보다 작거나 같을 때 멈춰라
				System.out.print("*"); // * 한 번 찍힌다.
				j++;	// j 증가
			}
			i++;
			System.out.println(" ");
		}
		
		
		
		
		
		
//		final int startCount = 5;
//		int i = 1;
//		int j = 1;
//		
//		while(i < 6) {
//			
//			j = 1;
//			while(j <= startCount - i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			while(j <= startCount) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println("");
//			i++;
//		}

	}

}
