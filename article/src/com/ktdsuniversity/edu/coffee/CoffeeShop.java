package com.ktdsuniversity.edu.coffee;

public class CoffeeShop {

	/**
	 * 커피숍에서 판매하는 따뜻한 아메리카노
	 */
	private Coffee hot;
	
	/**
	 * 커피숍에서 판매하는 차가운 아메리카노
	 */
	private Coffee ice;
	
	public CoffeeShop() {
		this(new Coffee("기본 아메리카노", 1500, 30), new Coffee("아이스 아메리카노", 1500, 50));
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
	
	public int orderCoffee() {
		int price = this.orderCoffee( Menu.HOT );
		return price;
	}

	/**
	 * 메뉴 한 개만 주문한다.
	 */
	public int orderCoffee(Menu menu) {
		int price = this.orderCoffee(menu, 1);
		return price;
	}
	
	
	/**
	 * 커피숍에서 커피를 판매한다
	 * @param menu 메뉴들의 번호 1: hot, 2: ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	

	
	public int orderCoffee(Menu menu, int quantity) {
		
		
		if(menu == Menu.HOT) {
			
			if(this.hot.getStock() >= quantity) {
			System.out.println(this.hot.getName() + "음료를 " + quantity + "개 주문 받았습니다");
			
			int stock = this.hot.getStock();
			stock -= quantity;
			this.hot.setStock(stock);
			
			return hot.getPrice() * quantity;
			}
			else {
				return 0;
			}
		}
		else if(menu == Menu.ICE) {
			if(this.ice.getStock() >= quantity) {
			System.out.println(this.ice.getName() + "음료를 " + quantity + "개 주문 받았습니다");
			
			int stock = this.ice.getStock();
			stock -= quantity;
			this.ice.setStock(stock);
			
			return this.ice.getPrice() * quantity;
		}
		else {
			System.out.println("존재하지 않는 음료입니다.");
			return 0;
		}
	}
		return quantity;
	}
}
