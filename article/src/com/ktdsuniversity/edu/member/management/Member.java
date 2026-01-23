package com.ktdsuniversity.edu.member.management;

public class Member {
	
//	public String id; => 멤버 변수는 외부로 바꾸면 안된다.
//	public String name;
	//String id; => public을 붙여야 이외의 클래스에 값을 전달 가능
	//String name; 
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//2번째 방법 Getter, Setter 위치는 생성자 밑
	public String getId() {		//Member class의 아이디를 Getter 생성
		return this.id;
	}
	
	public String getName() {	//Member class의 이름을 Getter 생성
		return this.name;
	}
	
	
	//1번째 방법 => 인스턴스 메소드를 만들어 Select가 가능하게 함
	public void printInfo() {
		System.out.println("작성자 ID: " + this.id);
		System.out.println("작성자명: " + this.name);
		
	}
}
