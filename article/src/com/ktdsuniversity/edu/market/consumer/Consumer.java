package com.ktdsuniversity.edu.market.consumer;

import com.ktdsuniversity.edu.market.seller.Product;

public class Consumer {
	
	
	private int buyNum;
	private int money;
	private int productMaxWeight;
	private int cartWeight;
	int price;
	
	public Consumer(int money, int productMaxWeight) {
		this.money = money;
		this.productMaxWeight = productMaxWeight;
	} //필요한 것만 받기 money productMaxWeight
	
	
	public int getBuyNum() {
		return this.buyNum;
	}
	public int getPirce() {
		return this.price;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public int getProductMaxWeight() {
		return this.productMaxWeight;
	}
	
	public int getCartWeight() {
		return this.cartWeight;
	}
	
	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void setProductMaxWeight(int productMaxWeight) {
		this.productMaxWeight = productMaxWeight;
	}
	
	public void setCartWeight(int cartWeight) {
		this.cartWeight = cartWeight;
	}
	
	/**
	 * 구매자가 판매자에게 상품을 구매한다
	 * @param seller 구매자에게 상품을 판매할 판매자 인스턴스
	 * @param productCount 구매자가 구매할 상품의 개수
	 */
	
	public void buyfrom(Product seller, int productCount) {
		
		// 1. 구매자: 혹시 두쫀쿠 productCount 만큼 있나요?
		if(int stock = seller.getStock()) {// seller.isEnoughStock(productCount);
			// 2. 판매자: 있습니다
			// 3. 구매자: 하나에 얼마에요?
			int price = seller.getPrice();
			// 4. 판매자: 1000원 입니다.
			// 5. 구매자: (내가 5천원이 있나?)
			if (this.isEnoughtMoney(price * productCount)) {
				//          있다
				// 6. 구매자: 혹시, 무게가 많이 무겁나요?
				int weight = seller.getProductWeight();
				// 7. 판매자: 한 500g 합니다
				// 8. 구매자: (내가 2.5kg 들 수 있나?)
				if(this.isEnoughtWeight(weight * productCount)) {
					//          들 수 있다
					// 9. 구매자: 5개만 주시겠어요?
					// 10. 판매자: 두쫀쿠 5개 포장해서 구매자에게 준다 (판매자의 재고가 감소)
					int stock = seller.getStock();
					stock -= productCount;
					seller.setStock(stock);
					// 11. 구매자: 여기 5천원 드릴게요 (구매자의 돈이 감소, 판매자의 자산이 증가, 구매자의 무게와 구매 개수 증가)
					this.money -= price * productCount;
					
					int capital += seller.getCapital();
					capital += price * productCount;
					seller.setCapital(capital);
					
					this.cartWeight += productCount * weight;
					this.buyNum += productCount;
					
				}
				
			}
		}
		//          들 수 없다 -> 구매도 안하고 판매도 안한다
		//          모자란다 -> 구매도 안하고 판매도 안한다
		//          없습니다 -> 구매도 안하고 판매도 안한다
		
	}
	
	
	public void buy(int money, int weight, int num ) {
		if(num * 500 > this.productMaxWeight) {
			System.out.println("더 이상 장바구니를 들 수 없습니다");
		}
		else if(num * this.productCost > money) {
			System.out.println("돈이 부족합니다");
		}
		else {
			this.buyNum += num;
			this.cartWeight += this.productWeight * num;
			this.money -= this.productCost * num;
		}
	}

}
