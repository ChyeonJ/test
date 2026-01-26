package com.ktdsuniversity.edu.quest;

import java.net.Socket;

public class Q181875X {
	
    public static String[] solution(String[] strArr) {
    	String[] answer = new String[strArr.length];
    	for(int i = 0; i < strArr.length; i = i++) {
    		if(i % 2 == 0) {
    			answer[i] = strArr[i].toUpperCase();
    		}
    		else {
    			answer[i] = strArr[i].toLowerCase();
    		}
    	}
        return answer;
    }


	public static void main(String[] args) {
		String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
		String[] strArr1 = {"aBc","AbC"};
		
		System.out.println(solution(strArr1));
		
		//스스로 풀지못함
	}

}
