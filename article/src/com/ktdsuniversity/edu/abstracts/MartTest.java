package com.ktdsuniversity.edu.abstracts;

public class MartTest {
	
	public static void main(String[] args) {
		
		int point = 1_000_000;
		int usePoint = (int) (Math.random() * point + 1);
		System.out.println(usePoint);
		
		Guest guest = new Guest(200_000, 0);
		Guest guest2 = new VIP(7_000, 300);
		Guest guest3 = new VVIP(0, 12_000);
		
		/*
		AbstractMart mart = new Mart(1500);
		mart.sell(guest, 5, 10000);*/
		
		/*
		AbstractMart mart = new ConvenienceStore(1500);
		mart.sell(guest, 5, 10000);
		mart.sell(guest2, 5, 7000);
		mart.sell(guest3, 5, 0);
		*/
		
		AbstractMart mart = new DepartmentStore(1500);
		
		mart.sell(guest, 5, 10000);
		System.out.println();
		
		mart.sell(guest2, 5, 7200);
		System.out.println();
		
		mart.sell(guest2, 5, 7500);
		System.out.println();
		
		mart.sell(guest3, 5, 0);
		System.out.println();
	}
	
	
	

}
