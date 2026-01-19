package exam;

import java.util.Scanner;

public class Q25314 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/25314
		// N 바이트를 줄테니 long이 몇개 붙어야 하니?
		// long int는 4바이트 longlong int는 8바이트
		
		Scanner keyboard = new Scanner(System.in);
		int bite = keyboard.nextInt();
		int n = 4;
		String type = " ";
		
		while(bite >= 4) {
			type += "long ";
			bite -= 4;
		}
		System.out.println(type + "int");
	}

}
