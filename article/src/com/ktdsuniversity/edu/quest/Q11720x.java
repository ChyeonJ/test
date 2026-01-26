package com.ktdsuniversity.edu.quest;

import java.util.Scanner;

//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
public class Q11720x {

	public static void main(String[] args) {
		//숫자 입력
		//String 입력 받고
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력해봐: ");
		String nums = sc.nextLine();
		int add;
		
		// for로 반복문 돌려서
		for (int i =0; i < nums.length(); i++) {
			//int a = Integer.parseInt(nums);
			int a = Integer.parseInt(String.valueOf(nums.charAt(i)));
			System.out.println(a);
			//charAt으로 하나씩 쪼개고
			char c = nums.charAt(i);
			//parseInt로 하나씩 형변환해서 더한다
			//add += c[i] - 0;
			//System.out.println(c);
			
		}

	



	}

}
