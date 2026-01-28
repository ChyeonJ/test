package com.ktdsuniversity.edu.inheritance;

public class Bird extends Animal{
	

	private boolean isFly;
	private float walkingSpeed;
	
	//Animal classs한테 파라미터 값을 전달하고 싶은데
	//변수가 할당 되지 않아서 에러가 발생
	public Bird (String name, String voice, float speed, float damage, float hitPoint) {
//		this.name = name;
//		this.voice = voice;
//		this.speed = speed;
//		this.damage = damage;
//		this.hitPoint = hitPoint;
		//super를 호출할 때 Animal class의 순서에 맞게 필드변수를 적어준다. 그러면 Animal의 파라미터를 보낼 수 있다
		// this() 랑 결이 같음
		super(name, voice, speed, damage, hitPoint);
		this.walkingSpeed = speed;
		
	}
	public boolean getIsFly() {
		return this.isFly;
	}
	
	//speed에서 오류가 발생한다. superclass의 모든 것을 사용할 수 있다고 했는데, 정작 speed라는 변수가 없어서 안된다.
	//this.speed가 아니라 super.speed라고 해야하나 했지만 이것도 되지 않는다.
	//에러가 나는 이유는 Animal(super)class에서 speed 변수는 private이기 때문이다.
	//setter를 만든 후 super.setSpeed(70f)를 사용하면 된다.
	public void fly() {
		this.isFly = true;
		super.setSpeed(70f);
		System.out.println();
	}
	
	public void land(){
		this.isFly = false;
		//isFly에서 speed의 값이 바뀌었기 때문에 원래 속도를 알기 위해서 새로운 멤버변수를 생성한다.
		super.setSpeed(this.walkingSpeed);
	}
	
	//Bird 클래스의 최종 Super Class인 Object 클래스의 toString() 메소드를 다시 정의한다.
	@Override	//애너테이션 안 붙이면 미세한 성능차이가 발생할 수 있다.
	public String toString() {
		String str = "Bird [name: %s, isFly: %s]";
		return str.formatted(super.getName(), this.isFly);
	}
	
}
