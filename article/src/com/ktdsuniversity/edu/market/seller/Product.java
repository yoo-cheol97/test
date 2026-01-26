package com.ktdsuniversity.edu.market.seller;

public class Product {
	
	private final int productCost = 1000; // 판매 상품의 금액
	private int stock;				// 재고
	private int capital;			// 자본금
	private final int productWeight = 500;
	
	public Product(int productCost, int stock, int capital) {
		//this.productCost = productCost;
		this.stock = stock;
		this.capital = capital;
	}
	/*
	public int getProductCost() {
		return this.productCost;
	}*/
	
	public int getStock() {
		return this.stock;
	}
	
	public int getCapital() {
		return this.capital;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	public int getProductWeight() {
		return this.productWeight;
	}
	
	public void sell(int productNum) {
		if (this.stock >= productNum ) {
			this.capital += productNum * this.productCost;
			this.stock -= productNum;
		}
		else if (productNum > this.stock &&this. stock > 0) {
			this.capital += this.stock * this.productCost;
			this.stock -= this.stock;
		}
		else if(this.stock == 0) {
			System.out.println("품절되었습니다.");
			
		}
		
	}

}
