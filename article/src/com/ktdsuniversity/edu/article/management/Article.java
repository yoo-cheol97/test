package com.ktdsuniversity.edu.article.management;

import com.ktdsuniversity.edu.member.management.Member;

public class Article {
	
	String title;
	//String authorName;
	//String authorId;
	String content;
	Member author;
	
	public Article(String title, Member author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	public void viewArticleDescription() {
		System.out.println("제목: " + this.title);
		System.out.println("내용: " + this.content);
		//System.out.println("작성자ID: " + this.author.id);
		//System.out.println("작성자명: " + this.author.name);
		//this.author.printInfo();
		System.out.println("작성자ID: " + this.author.getId());
		System.out.println("작성자명: " + this.author.getName());

	}
	
	public static void main(String[] args) {
		
		Member author = new Member("superuser","관리자");
		Article article = new Article("테스트", author, "내용");
		article.viewArticleDescription();
		
	}

}
