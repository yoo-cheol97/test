package com.ktdsuniversity.edu.market;

import com.ktdsuniversity.edu.market.consumer.Consumer;
import com.ktdsuniversity.edu.market.seller.Product;

public class Market {
	
	public static void main(String[] args) {
		
		Product product = new Product(5000, 10, 3000);
		
		Consumer consumer = new Consumer(4000 ,5000);
		
		int stock = product.getStock();
		int weight = product.getProductWeight();
		
		
		product.buyFrom(consumer ,5); // 캡슐화
		
		System.out.println("구매 개수: " + product.);
		System.out.println("중량: " + product.get);
		System.out.println("지갑: " + product);
		
		
		System.out.println("재고: " + product.getStock());
		System.out.println("자본금: " + product.getCapital());
		
		
	
	}

}
