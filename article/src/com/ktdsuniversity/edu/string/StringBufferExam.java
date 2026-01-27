package com.ktdsuniversity.edu.string;

public class StringBufferExam {
	
	public static void main(String[] args) {
		//import는 필요없다 java.lang 안에 있는 메소드임
		//Reference Type인데 출력 시 I@asdheE 이런식으로 나오지 않음
		//상속 개념에서 이해해보자
		StringBuffer sb = new StringBuffer();
		sb.append("askjd hkjashkjsahd");
		sb.append("askjd hkjashkjsahd");
		sb.append("askjd hkjashkjsahd");
		sb.append("askjd hkjashkjsahd");
		sb.append("askjd hkjashkjsahd");
		sb.append("askjd hkjashkjsahd");
		sb.append("askjd hkjashkjsahd");
		
		//.toString()을 사용해주어야 문자열로 변경이 
		String str = sb.toString();
		System.out.println(str);
		System.out.println(sb);
		
		StringBuffer longString = new StringBuffer();
		
		appendString(longString);
		
//		for(int i = 0; i < 1_000; i++) {
//			longString.append("ashdkjashdhjasjkdhasjhkdjkas \n");
//		}
		
		String aa = longString.toString();
		System.out.println(aa);
	}
	
	public static void appendString(StringBuffer buffer) {
		buffer.append("12312312313");
	}
	
}
