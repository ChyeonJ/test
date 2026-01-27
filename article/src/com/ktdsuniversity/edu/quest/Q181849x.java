package com.ktdsuniversity.edu.quest;

public class Q181849x {

	public static void main(String[] args) {
		String num_str = "123456789";
		int add = 0;
		for(int i = 0; i < num_str.length(); i++) {
			int num = Integer.parseInt(num_str.charAt(i) + "");
			add += num;
			System.out.println(add);
		}

	}

}
