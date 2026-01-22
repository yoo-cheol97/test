package oop;

public class Seller {
	
	// 1. 상수
	// 2. 멤버 변수
	// 3. 인스턴스 메소드
	
	final int PRICE= 1000;
	
	int stock;
	int account;
	
	public boolean isSoldOut() {
		return stock == 0;
	}
	
	public boolean isEnoughStock(int orderCount) {
		return stock >= orderCount;
	}
	
	
	public void sell(int orderCount) {
		boolean isEnoughStock = isEnoughStock(orderCount);
		boolean isSoldOut = isSoldOut();
		
		if(isSoldOut) { // 품절되었습니다
			System.out.println("품절 되었습니다");
		}
		else if(isEnoughStock) { // 판매
			stock -= orderCount;
			account += orderCount * PRICE;
		}
		else if(!isEnoughStock) { // 남은 재고를 모두 판매
			account += stock * PRICE;
			stock = 0;
		}
		
		System.out.println("남은 재고: " + stock);
		System.out.println("자본금: " + account);
	}

}
