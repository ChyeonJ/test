package com.ktdsuniversity.edu.quest;
//부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 예를 들어,
//문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만, "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.
public class Q181843 {
	
	public static int solution (String my_string, String target) {
		if(my_string.contains(target)) {
			return 1;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = solution("banana", "ana");
		System.out.println(a);

	}
}
