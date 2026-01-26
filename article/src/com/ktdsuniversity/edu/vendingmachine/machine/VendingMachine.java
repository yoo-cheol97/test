package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.SoftDrinks;

public class VendingMachine {
	
	private SoftDrinks[] drinks;
	int cost;
	int stock;
	
	public VendingMachine(int cost, int stock) {
		this.cost = cost;
		this.stock = stock;
	}
	
	public VendingMachine(SoftDrinks 박카스, SoftDrinks 몬스터, SoftDrinks 핫식스, SoftDrinks 밀키스 ) {
		this.drinks = new SoftDrinks[4];
		this.drinks[0] = 박카스;
		this.drinks[1] = 몬스터;
		this.drinks[2] = 핫식스;
		this.drinks[3] = 밀키스;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public int getStock() {
		return this.stock;
	}
	
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
		
		if(pressedDrink.getStock() == 0) {
			System.out.println("품절 되었습니다");
			return 0;
		}
		else if(pressedDrink.getStock() < menuCount) {
			menuCount = pressedDrink.getStock();
			//pressedDrink.stock = 0;
		}
		
		int stock = pressedDrink.getStock();
		stock -= menuCount;
		pressedDrink.setStock(stock);
		
		//pressedDrink.stock -= menuCount; // 위 3줄이 해당 코드
		return pressedDrink.getPrice() * menuCount;
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
		
		int stock = pressedDrink.getStock();
		stock += getMenuCount;
		pressedDrink.setStock(stock);
		
		//pressedDrink.stock += getMenuCount; 위 3줄
		
	}
	
	public void printAllDrinkInfo() {
		
		for(int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].getName() + "" + this.drinks[i].getStock() + "개 남았습니다" );
		}
		/*
		System.out.println(this.drinks[0].name + "" + this.drinks[0].stock + "개 남았습니다" );
		System.out.println(this.drinks[1].name + "" + this.drinks[1].stock + "개 남았습니다" );
		System.out.println(this.drinks[2].name + "" + this.drinks[2].stock + "개 남았습니다" );
		System.out.println(this.drinks[3].name + "" + this.drinks[3].stock + "개 남았습니다" );
		*/
	}

}
