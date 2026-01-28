package com.ktdsuniversity.edu.vehicle;

public class SportsCar extends Vehicle {
	

	private boolean turboMode;
	
	//public SportsCar(String name, boolean turnStatus, String engineSound) {
		
	//}
	
	public SportsCar(String name, boolean turnStatus, boolean turboMod, String engineSound) {
		super(name, turnStatus, engineSound);
		this.turboMode = turboMode;
	}
	
	public boolean isTurboMode() {
		return this.turboMode;
	}
	
	public void setTurboMode(boolean turboMode) {
		this.turboMode = turboMode;
	}
	
	@Override
	public void turnOn(Vehicle car) {
		// TODO Auto-generated method stub
		super.turnOn(car);
	}
	
	
	public void turboSet(Vehicle car) {
		if(car.getTurnStatus() == this.turboMode) {
			System.out.println("터보 모드 활성");
			setTurboMode(true);
		}
		else if(car.getTurnStatus() == this.turboMode){
			System.out.println("시동부터 켜세요");
		}
	}

}
