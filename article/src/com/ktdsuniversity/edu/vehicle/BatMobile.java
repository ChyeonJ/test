package com.ktdsuniversity.edu.vehicle;

public class BatMobile extends SportsCar{
	
	private boolean batEscape;
	

	public BatMobile(String name, boolean turnStatus, boolean turboMode, boolean batEscape, String engineSound) {
		super(name, turnStatus, turboMode, engineSound);
		this.batEscape = batEscape;
	}
	
	public boolean isBatEscape() {
		return batEscape;
	}
	
	public void setBatEscape(boolean batEscape) {
		this.batEscape = batEscape;
	}
	
	public void batSet(Vehicle car) {
		if(car.getTurnStatus() == false) {
			System.out.println("시동을 켜세요");
		}
		else if(this.batEscape == false) {
			System.out.println("분리 성공");
			setBatEscape(true);
		}
	}

}
