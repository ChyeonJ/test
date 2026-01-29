package com.ktdsuniversity.edu.implement;

public class LgTV implements LgSmartTV{
	
	//TV.interface
		@Override
		public void turnOn() {
			System.out.println("엘지 티비를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("엘지 티비를 끕니다.");
		}

		@Override
		public void changeChannel(int channelNumber) {
			System.out.println("엘지티비 채널을 바꿉니다. : " + channelNumber);
		}
		
		//SamsungSmartTV.interface
		@Override
		public void changeVolumn(int volumn) {
			System.out.println("엘지티비 볼륨을 바꿉니다 : " + volumn);
		}

		@Override
		public void runNetflix() {
			System.out.println("엘지티비 넷플릭스를 실행합니다.");
		}

		@Override
		public void runInternet() {
			System.out.println("엘지티비 인터넷을 실행합니다.");
		}

		@Override
		public void runYoutube() {
			System.out.println("엘지티비 유튜브를 실행합니다.");
		}
		
}
