package com.ktdsuniversity.edu.vehicle;

public class EV extends Vehicle{
	
	private float battery;
	

	public EV(String name, boolean turnStatus, float battery, String engineSound) {
		super(name, turnStatus, engineSound);
		this.battery = battery;
	}
	
	public float getBattery() {
		return battery;
	}
	
	public void setBattery(float battery) {
		this.battery = battery;
	}
	
	public void batteryCheck(Vehicle car) {
		System.out.println(car.getName() + " 현재 배터리 상태는 " + this.getBattery());
	}
	
}
