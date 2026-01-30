package com.ktdsuniversity.edu.abstracts;

public class MartTest {
	
	public static void main(String[] args) {
		
		int point = 0;
		//int usePoint = (int) (Math.random() * point + 1);
		//System.out.println(usePoint);
		
		Guest guest = new Guest(10000, 0); // 소지금, point
		Guest guest2 = new VIP(10000, 0);
		Guest guest3 = new VVIP(50000, 0);
		
		/*
		AbstractMart mart = new Mart(1000);
		mart.sell(guest, 4, 10000);
		System.out.println(guest);
		System.out.println();
		*/
		
		/*
		AbstractMart con = new ConvenienceStore(1000);
		System.out.println("편의점");
		
		con.sell(guest, 4, 10000);
		System.out.println(guest);
		System.out.println();
		
		con.sell(guest2, 4, 3000);
		System.out.println(guest2);
		System.out.println();
		*/
		
		AbstractMart dep = new DepartmentStore(1500);
		System.out.println("백화점");
		
		dep.sell(guest, 4, 10000); // 구매개수, 내는 돈
		System.out.println(guest);
		System.out.println();
		
		dep.sell(guest2, 6, 10000);
		System.out.println(guest2);
		System.out.println();
		
		dep.sell(guest3, 8, 40000);	
		System.out.println(guest3);
		System.out.println();
	}
	
	
	

}
