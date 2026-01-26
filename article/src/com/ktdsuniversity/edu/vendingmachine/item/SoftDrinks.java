package com.ktdsuniversity.edu.vendingmachine.item;

public class SoftDrinks {
	
	private String name;
	
	private int price; // 가격
	private int stock; // 재고
	
	/*
	public SoftDrinks(int price, int stock) {
		this.price = price;
		this.stock = stock;
	}*/
	
	public SoftDrinks(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
		
	}
	
}
