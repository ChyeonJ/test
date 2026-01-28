package com.ktdsuniversity.edu.vehicle;
/**
 * 자동차(Vehicle)
 * 속성: 자동차모델명
 * 기능: 시동걸기
 */
public class Vehicle {
	
	private String name;
	private boolean turnStatus;
	private String engineSound;
	
	public Vehicle(String name) {
		this.name = name;
		this.engineSound = "부롱롱롱!";
	}
	
	/**]
	 * 
	 * @param name 자동차 이름
	 * @param turnStatus 시동 상태
	 */
	public Vehicle(String name, boolean turnStatus, String engineSound) {
		this.name = name;
		this.turnStatus = turnStatus;
		this.engineSound = engineSound;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getTurnStatus() {
		return this.turnStatus;
	}
	
	public void setTurnStatus(boolean turnStatus) {
		this.turnStatus = turnStatus;
	}
	
	public void turnOn(Vehicle car) {
		
		//시동 여부 체크 => instanceoF? => 이거는 나중에 하면 됨
		if(this.getTurnStatus() == true) {
			System.out.println("이미 시동이 켜져 있습니다.");
			return;
		}
		else {
			System.out.println(this.getName() + " 시동이 켜졌습니다.");
			System.out.println(this.engineSound);
		}
		// 시동이 꺼져 있다면 => 시동을 건다
		
	}
	

}
