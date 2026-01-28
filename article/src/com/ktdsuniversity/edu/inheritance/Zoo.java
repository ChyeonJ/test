package com.ktdsuniversity.edu.inheritance;

public class Zoo {
	
	public static void main(String[] args) {
		
		String name = "최현종";
		String other = "최현종";
		System.out.println(name = other); //애도 false가 나와야 하는데 true가 나온다. 이유는 String Object에서 .equals가 있기 때문이다
		
		//super class   sub class
		//Animal duck = new Bird(); 이렇게 사용가능 기존 Bird duck = new Bird
		Animal duck = new Bird("오리", "꽥", 15f, 20f, 50f);
		Animal duck2 = new Bird("오리", "꽥", 15f, 20f, 50f);
		
		System.out.println("==비교" + (duck == duck2)); //false가 나온다 메모리의 주소를 비교하기 때문이다.
		System.out.println("equals오버라이딩 비교" + duck.equals(duck2));
		
		duck.howling();
		duck.move();
		
		//java의 모든 최종 부모는 Object이다.
		System.out.println(duck);	//toString 오버라이딩 시 코드
		
		StringBuffer sb = new StringBuffer();
		sb.append("asdasd");
		System.out.println(sb);
		//duck.
		
		//Animal duck = new Bird(); 이렇게 사용가능 이렇게 사용하면 duck.fly()가 에러가 난다.
		//이를 사용하기 위해서는 Bird duck new Bird로 생성해도 되지만 /////// => 확장성 때문에 이 방식은 사용하지 않음
		//명시적 변환으로 사용할 것이다.
		//옛날 버전
//		if(duck instanceof Bird) { //duck이 Bird의 인스턴스냐를 물어본다 "instanceoF"
//			Bird bird = (Bird) duck;
//			bird.fly();
//			bird.land();
//		}
		//현재버전
		if (duck instanceof Bird bird) { // duck이 Bird의 인스턴스가 맞다면 bird로 할당해라 => duck이라는 인스턴스 값이 bird로 할당
			bird.fly();
			bird.land();
			
			bird.land();
			bird.move();

			bird.fly();
		}

		
		Animal lion = new Animal("사자", "크아앙", 80f, 60f, 200f);
		Animal tiger = new Animal("호랑이", "어흥", 50f, 55f, 200f);
		
		//Animal class에서 상속은 받았지만 tiger는 duck이 왜 공격이 가능한가?
		// is - a 관계를 이용한 다형성 => is-a의 다형성을 이용하면 묵시적 형변환이 가능하다(sub class => super class)에 접근이 가능하다.
		// Aniomal.class는 => super calss
		// Bird.class => sub class
		tiger.attack(duck);
		
		duck.attack(tiger);
		
		lion.howling();
		tiger.howling();
		
		lion.move();
		tiger.move();
		
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		tiger.attack(lion);
		
		
	}
	
}
