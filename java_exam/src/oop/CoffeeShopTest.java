package oop;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노 (HOT)", 4500);
		Coffee iceCoffee = new Coffee("아이스티", 4000);
		Coffee tea = new Coffee("캐모마일", 5000);
		
		//CoffeeShop starbucks = new CoffeeShop(hotCoffee, iceCoffee);
		
		CoffeeShopArray starbucks = new CoffeeShopArray(hotCoffee, iceCoffee, tea);
		
		int price = starbucks.orderCoffee(1, 3);
		System.out.println(price+ "원");
		
		price = starbucks.orderCoffee(2, 6);
		System.out.println(price+ "원");
		
		price = starbucks.orderCoffee(3, 5);
		System.out.println(price+ "원");
		
		price = starbucks.orderCoffee(0, 10);
		System.out.println(price+ "원");
		
	}

}
