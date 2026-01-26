package oop;

public class CoffeeShop {

	/**
	 * 커피숍에서 판매하는 따뜻한 아메리카노
	 */
	Coffee hot;
	
	/**
	 * 커피숍에서 판매하는 차가운 아메리카노
	 */
	Coffee ice;
	
	public CoffeeShop() {
		//this.hot = new Coffee("기본 아메리카노", 1500, 30);
		//this.ice = new Coffee("아이스 아메리카노", 1500, 50);
		this(new Coffee("기본 아메리카노", 1500, 30)
			,new Coffee("아이스 아메리카노", 1500, 50));
	}
	
	public CoffeeShop(Coffee hot, Coffee ice) {
		this.hot = hot;
		this.ice = ice;
		
	}
	
	public Coffee getHot() {
		return this.hot;
	}

	public void setHot(Coffee hot) {
		this.hot = hot;
	}

	public Coffee getIce() {
		return this.ice;
	}

	public void setIce(Coffee ice) {
		this.ice = ice;
	}

	
	/**
	 * 가장 첫 번째 메뉴를 한 개 주문한다
	 */
	
	public int orderCoffee() {
		int price = this.orderCoffee(1);
		return price;
	}
	
	
	/**
	 * 메뉴 한개만 주문한다
	 */
	
	public int orderCoffee(int menu) {
		int price = this.orderCoffee(menu, 1);
		return price;
	}
	
	/**
	 * 커피숍에서 커피를 판매한다
	 * @param menu 메뉴들의 번호 1: hot, 2: ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	
	public int orderCoffee(int menu, int quantity) {
		if(menu == 1) {
			System.out.println(this.hot.name + "음료를 " + quantity + "개 주문 받았습니다");
			return hot.price * quantity;
		}
		else if(menu == 2) {
			System.out.println(this.ice.name + "음료를 " + quantity + "개 주문 받았습니다");
			return this.ice.price * quantity;
		}
		else {
			System.out.println("존재하지 않는 음료입니다.");
			return 0;
		}
	}
	
}
