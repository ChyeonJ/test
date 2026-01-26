package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame2 {
	
	//getter, setter 생략
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame2() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void statGame() {
		System.out.println("게임이 시작되었습니다");
		System.out.println("시작 단어를 입력해주세요.");
		
		this.startWord = this.keyboard.nextLine();
		
		 String firstLetter;
		 String lastLetter;
		
		
		while(true) {
		System.out.println("다음 단어를 입력헤주세여");
		this.nextWord = this.keyboard.nextLine();
		this.nextWord = this.nextWord.trim(); //" 기찻길 " 공백제거 => 단순하게 공백을 제거 해주지만 제거된 문자를 반환해줌 => 그래서 다시 변수에 담아줘야함
		
		// 시작 단어의 마지막 글자 추출.
		// "기찻길" => 3글자 이상이면 "기찻길옆오막살이" => 배열은 8 - 1 7을 할당함 => 길이 확인 .length
		// 인덱스가 0, 1, 2 이런식으로 똑같이 만들어짐
		lastLetter = this.startWord.charAt(this.startWord.length() -1) + "";
		
		// 다음 단어의 첫번째 글자
		// "기찻길옆오막살이"
		// 0 1 2 3 4 5 6 7
		// 시작을 알려면 0번째 인덱스랑 - 1번째 인덱스가 필요함
		firstLetter = this.nextWord.substring(0, 1);
		
		if(this.nextWord.startsWith(lastLetter)) {
			if(this.nextWord.length() >= 3) {
			this.startWord = this.nextWord;
			}
			else {
				System.out.println("겜끄으읕");
				break;
			}
		}
		else {
			System.out.println("겜끝");
			break;
			
		}
		
	 }
	}
	
	public static void main(String [] args) {
		//System.out.println("asdasdasd"); //System = class / out = 상수
		RelayGame game = new RelayGame();
		game.statGame();
	}

}
