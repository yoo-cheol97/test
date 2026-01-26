package com.ktdsuniversity.edu.coffee;

/**
 * 커피 메뉴를 나타내는 데이터 클래스
 */

public class Coffee {
	/**
	 * 커피 메뉴의 이름
	 */
	private String name;
	
	/**
	 * 커피 메뉴의 가격
	 */
	private int price;
	
	/**
	 * 하루동안 판매할 수 있는 커피의 양
	 */
	private int stock;
	
	public Coffee(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	//getter : Coffee 클래스 외부로 멤버 변수의 값을 노출시키는 코드
	//setter : 외부에서 Coffee 클래스 내부로 멤버 변수의 값을 변경시키는 코드
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setName(String name) { //()에 있는게 외부에서 들어온 값
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
