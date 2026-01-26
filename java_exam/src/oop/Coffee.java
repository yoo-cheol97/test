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
	int stock;
	
	public Coffee(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
