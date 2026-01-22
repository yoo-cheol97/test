package oop;

/**
 * 커피 메뉴를 나타내는 데이터 클래스
 */

public class Coffee {
	/**
	 * 커피 메뉴의 이름
	 */
	String name;
	
	/**
	 * 커피 메뉴의 가격
	 */
	int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
