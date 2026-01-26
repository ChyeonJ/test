package com.ktdsuniversity.edu.quest;

import java.util.Scanner;

//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
public class Q11654 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("암거나 입력해 보소: ");
		char result = sc.nextLine().charAt(0);	//Scanner는 String으로 받아오는데 char선언과, CharAt()을 사용하여 char로 바꾼 후
		
		int num = result; //char의 값을 num으로 할당한 후 
		
		System.out.println(num);//출력 해주면 된다
		
	}

}
