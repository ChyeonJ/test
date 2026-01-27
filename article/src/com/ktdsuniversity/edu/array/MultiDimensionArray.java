package com.ktdsuniversity.edu.array;
/**
 * 다차원 배열 실습
 */
public class MultiDimensionArray {
	
	public static void main(String[] args) {
		
		//다차원 배열 만드는 방법 1
		int[][] arr = new int[3][3];
		arr[2][0] = 100;
		
		//다차원 배열 만드는 방법 2
		int[][] arr2 = new int[][] {{0,0,0},{0,0,0},{0,0,0}};
		int[][] arr3 ={{0,0,0},{0,0,0},{0,0,0}};	//보전길이 다차원 배열
		
		//컬렉션 프레임워크 진행할 때 이 지식이 필요함
		int[][] arr4 = new int[3][];//가변길이 다차원 배열
		arr[0] = new int[]{1,2,3};
		arr[1] = new int[] {1,2,3,4,5,6};
		arr[2] = new int[]{1};
		
	}
}
