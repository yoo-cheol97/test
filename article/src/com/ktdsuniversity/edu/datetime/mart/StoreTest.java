package com.ktdsuniversity.edu.datetime.mart;

public class StoreTest {
	
	public static void main(String[] args) {
		Store store= new Store();
		
		store.add(new Item("A", "2026-02-04"));
		store.add(new Item("B", "2026-02-03"));
		store.add(new Item("C", "2026-02-02"));
		store.add(new Item("D", "2026-02-01"));
		store.add(new Item("E", "2026-02-05"));
		store.add(new Item("F", "2026-02-06"));
		
		
		System.out.println(store);
		
		store.sell(0);
		store.sell(1);
		store.sell(2);
		store.sell(3);
		store.sell(4);
		store.sell(5);

		
	}
	
}
