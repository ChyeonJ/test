package com.ktdsuniversity.edu.array;

import java.util.Scanner;

//9개의 서로 다른 자연수가 주어질 때, 
//이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
public class Q2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numArray = new int[9];
		int count = 0;
		int max = 0;
		for(int i = 0; i < numArray.length; i++) {
			System.out.print("자연수 1개 입력");
			numArray[i] += sc.nextInt();
		}
		max = numArray[0];
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] > max) {
				max = numArray[i];
				//몇번째 수인지 계산 인덱스는 0부터지만 몇번째 숫자인지는 알려면 +1을 해야함
				count = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(count);

		//System.out.println(numArray[]);
		
	}

}
