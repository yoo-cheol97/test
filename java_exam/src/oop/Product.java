package oop;

public class Product {
	
	/**
	 * <pre>
	 * 판매자가 판매하는 모든 상품의 금액은 1,000원 입니다.
	 * 판매자는 한번에 n개 만큼의 상품을 판매할 수 있습니다.
	 * 판매(5); 라고 한다면 판매자의 상품 재고에서 5개를 빼야합니다.
	 * 또한 5개를 판매한 금액을 판매자의 자본금에 더해야 합니다.
	 * 판매자가 소지한 상품의 개수보다 더 많은 개수의 상품을 판매하려할 경우, 남은 모든 재고를 판매해야 하며
	 * 남은 재고를 판매한 금액만큼을 판매자의 자본금에 더해야 합니다.
	 * 판매자의 재고가 없다면, "품절되었습니다"를 출력해야 합니다.
	 * 상품의 판매 프로세스가 종료되었다면 판매자의 재고 수, 판매자의 자본금을 출력한다.
	 * </pre>
	 */
	
	int productCost = 1000; // 판매 상품의 금액
	int stock;				// 재고
	int capital;			// 자본금
	
	public void sell(int productNum) {
		if (stock >= productNum ) {
			capital += productNum * productCost;
			stock -= productNum;
		}
		else if (productNum > stock && stock > 0) {
			capital += stock * productCost;
			stock -= stock;
		}
		else if(stock == 0) {
			System.out.println("품절되었습니다.");
			
		}
		
	}

}