package com.ktdsuniversity.edu.quest;

public class Q181878 {
	
	public static int solution(String myString, String pat) {
		if(myString.toLowerCase().contains(pat.toLowerCase())) {
			return 1;
		}
		return 0;
	}
	

	public static void main(String[] args) {
		
		String nyString = "AbCdEfG";
		String pat = "aBc";
		
		int a = solution(nyString, pat);
		System.out.println(a);
		
		
	}

}
