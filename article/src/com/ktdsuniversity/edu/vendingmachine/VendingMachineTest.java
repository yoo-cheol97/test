package com.ktdsuniversity.edu.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.SoftDrinks;

public class VendingMachineTest {
	
	public static void main(String[] agrs) {
	
	SoftDrinks 박카스 = new SoftDrinks("박카스", 900 , 15);
	SoftDrinks 몬스터 = new SoftDrinks("박카스", 1500 , 20);
	SoftDrinks 핫식스 = new SoftDrinks("박카스", 1300 , 10);
	SoftDrinks 밀키스 = new SoftDrinks("박카스", 1400 , 5);
	
	//VendingMachine lotte = new VendingMachine(박카스, 몬스터, 핫식스 ,밀키스);

	
	lotte.printAllDrinkInfo();
	
	
	
	}
}
