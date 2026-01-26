package oop;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product seller = new Product();
		seller.stock = 15;
		
		seller.sell(10);
		
		System.out.println("판매자의 재고 수는 " + seller.stock +"개 입니다");
		System.out.println("판매자의 자본금은 " + seller.capital +"원 입니다");
		
		
		
	}

}