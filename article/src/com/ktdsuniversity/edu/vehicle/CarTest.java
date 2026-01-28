package com.ktdsuniversity.edu.vehicle;

public class CarTest {
	
	public static void main(String[] args) {
		
		Vehicle car = new SportsCar("람보르라리", false, false,"뿌앙");
		
		//스포츠카
		if(car instanceof SportsCar sports) {
			sports.turnOn(car);
			sports.turboSet(car);
		}
		
		Vehicle car1 = new BatMobile("맹모빌", false, false, false,"ㅎ;ㅣ히ㅣ힣");
		
		//배트 모빌
		if(car instanceof BatMobile BatMobile) {
			BatMobile.turnOn(car1);
			BatMobile.turboSet(car1);
		}
		
		Vehicle car2 = new EV("정깅창", false, 50f,"띠로리");
		
		if(car instanceof EV ev) {
			ev.turnOn(car2);
			ev.batteryCheck(car2);
		}

		

	}

}
