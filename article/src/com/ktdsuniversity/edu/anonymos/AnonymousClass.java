package com.ktdsuniversity.edu.anonymos;

import com.ktdsuniversity.edu.abstracts.AbstractMart;
import com.ktdsuniversity.edu.abstracts.Guest;
import com.ktdsuniversity.edu.implement.TV;

public class AnonymousClass {
	
	public static void main(String[] args) {
		
		//new => 생성자 호출
		//Cannot instantiate the type AbstractMart
		AbstractMart mart = new AbstractMart(1500) {	//중괄호 시작
			
			//이름이 없는 클래스 생성
			
			@Override
			public int usePoint(Guest guest) {
				return 0;
			}

			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(10_000_000);
			}

			@Override
			public int discoiunt(Guest guest, int amount) {
				return amount;
			}
			
			}; //중괄호 닫음
			
			Guest gs = new Guest(0, 0);
			
			mart.sell(gs, 10000, 0);
			System.out.println(gs.getPoint());
			
			
			TV emartTV = new TV() {	//인터페이스도 마찬가지로 인터페이스도 이름없는 클래스가 생성된다.

				@Override
				public void turnOn() {
					System.out.println("이미트 온");
				}

				@Override
				public void turnOff() {
					System.out.println("이미트 오프");
				}

				@Override
				public void changeChannel(int channelNumber) {
					System.out.println("이미트 채널");
					
				}

				@Override
				public void changeVolumn(int volumn) {
					System.out.println("이미트 볼륨");
					
				}};
				
				emartTV.changeChannel(123);
				emartTV.turnOn();
				
				System.out.println(mart);
				System.out.println(emartTV);
	}
	
}
