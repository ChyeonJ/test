package com.ktdsuniversity.edu.quest;
/**
 * 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
 */
public class Q27866 {

	public static void main(String[] args) {
		
		String s = "Sprout";
		int i = 3;
		
		System.out.println(s.charAt(i) + ""); //charAt 사용
		System.out.println(s.substring(2,i)); //subString 사용 주어진 정수가 하나인 경우는 charAt이 맞는듯하다
		

	}

}
