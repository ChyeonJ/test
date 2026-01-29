package com.ktdsuniversity.edu.implement;

public class Test {
	
	
	public static void main(String[] args) {
		//TV가 super class인듯?
//		TV lgTv = new LgTV();
//		TV samsungTV = new SamsungTV();
		
		LgSmartTV lgTv = new LgTV();
		LgRemoteController lgRemoteCon = new LgSmartRemoteController();
		lgRemoteCon.turnOn(lgTv);
		lgRemoteCon.runNetflix(lgTv);
		
		SamsungSmartTV samsungTV = new SamsungTV();
		lgRemoteCon.turnOn(samsungTV);
		//lgRemoteCon.runYoutube(samsungTV);
		
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		samsungRemoteCon.runCoupangPlay(samsungTV);
		//samsungRemoteCon.runNetflix(lgTv);
		
//		lgTv.turnOn();
//		lgTv.turnOff();
//		lgTv.changeChannel(0);
//		lgTv.changeVolumn(0);
//		lgTv.runInternet();
//		lgTv.runYoutube();
//		lgTv.runNetflix();
//		
//		System.out.println("---------------------------------------------------------");
//		
//		samsungTV.changeChannel(0);
//		samsungTV.changeVolumn(0);
//		samsungTV.runMenu();
//		samsungTV.runNetflix();
//		samsungTV.turnOff();
//		samsungTV.turnOn();
//		samsungTV.runCoupangPlay();
		
		
		
	}
	
}
