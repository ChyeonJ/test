package com.ktdsuniversity.edu.article.management;

import com.ktdsuniversity.edu.member.management.Member;

public class Article {
	
	String title;
	String content;
	Member author;
	
	
	String authorName;
	String authorId;
	
	public Article(String title, String content, Member author) {
		this.title = title;
		this.content = content;
		this.author = author;
		
	}
	
	public void viewArticleDescription() {
		
		System.out.println("제목: " + this.title);
		System.out.println("내용: " + this.content);
		this.author.printInfo(); // <= 출력 인스턴스 메소드 콜
		System.out.println("작성자ID: " + this.author.getId());
		System.out.println("작성자 명: " + this.author.getName());
//		System.out.println("작성자ID: " + this.author.id); => 인스턴스 메소드 호출을 하기 때문에 지움
//		System.out.println("작성자 명: " + this.author.name);
	}
	
	public static void main(String[] args) {
		
		Member author = new Member("superUser", "관리자");
		Article article = new Article("테스트", "내용", author);
		article.viewArticleDescription();
		
	}
	
}
