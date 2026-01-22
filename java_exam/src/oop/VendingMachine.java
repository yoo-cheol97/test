package oop;

public class VendingMachine {
	
	SoftDrinks[] drinks;
	
	public VendingMachine(SoftDrinks 박카스, SoftDrinks 몬스터, SoftDrinks 핫식스, SoftDrinks 밀키스 ) {
		this.drinks = new SoftDrinks[4];
		this.drinks[0] = 박카스;
		this.drinks[1] = 몬스터;
		this.drinks[2] = 핫식스;
		this.drinks[3] = 밀키스;
	}
	
	int cost;
	int stock;
	
	
	public int orderDrinks(int menu, int menuCount) {
		/*int sumCost;
		if(menuCount <= stock) {
			sumCost = menuCount * cost;
			stock -= menuCount;
		}
		else if(stock == 0) {
			System.out.println("상품이 품절되었습니다");
			
		}*/
		
		if(menu < 0 || menu >= this.drinks.length) {
			return 0;
		}
		
		
		SoftDrinks pressedDrink = this.drinks[menu];
		
		if(pressedDrink.stock == 0) {
			System.out.println("품절 되었습니다");
			return 0;
		}
		else if(pressedDrink.stock < menuCount) {
			menuCount = pressedDrink.stock;
			//pressedDrink.stock = 0;
		}
		
		pressedDrink.stock -= menuCount;
		return pressedDrink.price * menuCount;
	}
	
	public void getDrinks(int menu, int getMenuCount) {
		/*if(menu < 0 || menu >= this.drinks.length) { 
			System.out.println("존재하지 않는 음료입니다");
		}
		else {
			stock += getMenuCount;
		}*/
		
		if(menu < 0 || menu >= this.drinks.length) {
			return;
		}
		SoftDrinks pressedDrink = this.drinks[menu];
		pressedDrink.stock += getMenuCount;
		
	}
	
	public void printAllDrinkInfo() {
		
		for(int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].name + "" + this.drinks[i].stock + "개 남았습니다" );
		}
		/*
		System.out.println(this.drinks[0].name + "" + this.drinks[0].stock + "개 남았습니다" );
		System.out.println(this.drinks[1].name + "" + this.drinks[1].stock + "개 남았습니다" );
		System.out.println(this.drinks[2].name + "" + this.drinks[2].stock + "개 남았습니다" );
		System.out.println(this.drinks[3].name + "" + this.drinks[3].stock + "개 남았습니다" );
		*/
	}

}
