package com.ktdsuniversity.edu.quest;
//어떤 문자열 A가 다른 문자열 B안에 속하면 A를 B의 부분 문자열이라고 합니다. 예를 들어 문자열 "abc"는 문자열 "aabcc"의 부분 문자열입니다.
public class Q181842 {
	
	public static int solution(String str1, String str2) {
		if (str2.contains(str1)) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = solution("sdddda", "asdasdsdasd");
		System.out.println(a);

	}
}
