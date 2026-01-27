package com.ktdsuniversity.edu.array;

public class Q10818 {

	public static void main(String[] args) {
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		String numArray = new String("20 10 35 30 7");
		String[] a = numArray.split(" ");
		//System.out.println(a[0]);
		int[] b = new int[numArray.length()];
		
		
		int max = 0;
		int min = 0;
		int c = 0;
		for(int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		
		max = b[0];
		min = b[0];
		
		for(int i = 0; i < a.length; i++) {
			if(b[i] > max) {
				max = b[i];
			}
			else if(b[i] < min) {
				min = b[i];
			}
		}
		
		System.out.println(max + " " + min + "");
	
		
	}

}
