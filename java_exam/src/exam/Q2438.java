package exam;

import java.util.Scanner;

public class Q2438 {

	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제


		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;	//n번 돌아야 할 때를 대비한 증감식을 위한 변수
		int j = 1; //별 출력할때 쓰기 위한 변수
		
		
		while(n >= i) { // n이 5개가 있다고 치면 5 >= 1 : 1이 5보다 크거나 같다
			j = 1;	// j를 1로 바꿔줘야함 그 이유는 1 -> 1 + 2 이런 상황이 되기 때문에 1로 돌려서 1부터 시작하게 만든다
			while(j <= i) {	// 1 <= 1 1이 1보다 작거나 같아야 하는데 최초 1회 실행 후 j++ 증가 되면 2가 되서 * ** 이 가능해짐
				System.out.print("*");
				j++;	//1 -> 2로 증가 시  2 <= 1 2가 1보다 작거나 같다 성립하지 않음으로 한 번 더 반복 후 j++ 만나서 2 == 2 동등한 조건
			}
			i++; //i의 증가로 j while문의 조건식이 성립 됨
			System.out.println(" ");
		}
		
		
		
		

		
		
		
		
		
		
		
//		Scanner keybord = new Scanner(System.in);
//		int n = keybord.nextInt();
//		int i = 1;
//		int j = 1;
//		String air = " ";
//		
//		while (i <= n) {
//			
//			j = 1;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println(""); //한줄 띄우기
//			i++;
//		}

	}

}
