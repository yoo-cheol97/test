package oop;



public class ConsumerTest {
	
	public static void main(String[] args) {
		Consumer consumer = new Consumer();
		consumer.productMaxWeight = 4000;
		consumer.money = 5000;
		
		consumer.buy(6);
		
		System.out.println("구매자의 상품 수는 " + consumer.buyNum +"개 입니다" );
		System.out.println("장바구니의 무게는 " + consumer.cartWeight + "g 입니다");
		System.out.println("지갑의 돈은 " + consumer.money +"원 입니다");
		
		
	}

}
