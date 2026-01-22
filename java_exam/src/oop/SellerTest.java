package oop;

public class SellerTest {
	
	public static void main (String[] args) {
		
		Seller abcMart = new Seller();
		abcMart.account = 0;
		abcMart.stock = 5;
		
		abcMart.sell(3);
		abcMart.sell(5);
		abcMart.sell(1);
	}

}
