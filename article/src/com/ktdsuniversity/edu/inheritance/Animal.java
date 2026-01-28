package com.ktdsuniversity.edu.inheritance;

public class Animal {
	
	private String name;

	private String voice;
	//상속까지는 허용해주고 싶으면 protected 접근제어 지시자를 사용하면 된다.
	//protected는 사용하지 않는다. protected가 열어주는 허용범위가 생각보다 넓기 때문이다
	//예를 들면 클래스 내부, 동일 패키지, 상속받은 클래스까지 열어주기 떄문이다.
	//사용하려면 패키지를 완전히 분리시키면 가능하지만, 실무에서는 그럴 일이 많이 없다.
	// 어떤 이유든 멤버변수는 private으로 보호한다
	private float speed;

	private float damage;
	private float hitPoint;
	
	//public Animal() {};

	
	public Animal(String name, String voice, float speed, float damage, float hitPoint) {
		this.name = name;
		this.voice = voice;
		this.speed = speed;
		this.damage = damage;
		this.hitPoint = hitPoint;
	}
	
	
	public String getVoice() {
		return voice;
	}


	public void setVoice(String voice) {
		this.voice = voice;
	}


	public float getDamage() {
		return damage;
	}


	public void setDamage(float damage) {
		this.damage = damage;
	}


	public float getHitPoint() {
		return hitPoint;
	}


	public void setHitPoint(float hitPoint) {
		this.hitPoint = hitPoint;
	}


	public float getSpeed() {
		return speed;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}
	//setter 생성
	public void setSpeed(float speed) {
		this.speed = speed;

	}
	public void howling() {
		System.out.println(this.name + " : " + this.voice);
	}
	
	public void move() {
		System.out.println(this.name + " : " + this.speed + "km/h의 속도로 움직임");
	}
	
	//instanceoF를 사용하여 attack을 보강해보자~
	public void attack(Animal other) {
		
		if(this.isDead()) {
			System.out.println(this.name + "이 이미 죽어서 행동할 수 없습니다.");
			return;
		}
		//!this는 에러 !this는 없는 것
		if(!(this instanceof Bird) && other instanceof Bird bird) {
			//bird가 날고 있으면 공격 불가
			if(bird.getIsFly()) {
				System.out.println(other.getName() + "이 비행 중이라 공격할 수 없습니다.");
				return;
			}
		}
		
		System.out.println(this.name + "이 " +  other.getName() + "에게 공격하려 합니다.");
		if(!other.isDead()) {	//만약에 동물이 죽지 않았다면 공격해라
		other.getDamage(this.damage);
		}
		else {
			System.out.println(other.getName() +  "이 이미 죽었습니다.");
		}
	}
	//getter 아님
	public void getDamage(float damage) {
		System.out.println(this.name + "이 " + damage + "만큼 피해를 입었습니다.");
		this.hitPoint -= damage;	
	}
	
	public boolean isDead() {
		return this.hitPoint <= 0;
	}
	
	//오버라이딩 사용
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Animal other) {
			return other.getName().equals(this.name);
		}
		
		return super.equals(obj);
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", voice=" + voice + ", speed=" + speed + ", damage=" + damage + ", hitPoint="
				+ hitPoint + "]";
	}
	
	
	
}
