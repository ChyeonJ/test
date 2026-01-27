package com.ktdsuniversity.edu.array;

import java.util.Scanner;

//X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 
//학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
//교수님이 내준 특별과제를 28명이 제출했는데, 
//그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
public class Q5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int[] numArray = new int[29];
		int[] numArray = {3, 1, 4, 5, 7, 9, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		int num = 0;
		int temp = 0;
		// 배열 입력 완료
//		for(int i = 0; i < numArray.length - 1; i++) {
//			System.out.print("입력 하시오 " );
//			numArray[i] += sc.nextInt();
//		}
		//정렬 완료
		for(int i = 0; i < numArray.length -1; i++) {
			for(int j = 1; j < numArray.length-1; j++) {
				if(numArray[i] > numArray[j]) {
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		//과제를 내지 않은 사람 찾기
		int[] miss = new int[numArray.length];
		int missIndex = 0;
		for(int i = 0; i < numArray.length-1; i++) {
			if(numArray[i] != numArray[i + 1] - 1) {
				miss[missIndex++] = numArray[i] + 1;
			}
		}
		
		System.out.println(miss[0]);
		System.out.println(miss[1]);
		
	}

}
