package com.ktdsuniversity.edu.anonymous;

import com.ktdsuniversity.edu.abstracts.AbstractMart;
import com.ktdsuniversity.edu.abstracts.Guest;

public class AnonymousClass {
	
	public static void main(String[] args) {
		
		// Cannot instantiate the type AbstractMart
		AbstractMart mart = new AbstractMart(1500) {

			@Override
			public int usePoint(Guest guest) {
				return 0;
			}

			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(10_000_000);
			}

			@Override
			public int discount(Guest guest, int amount) {
				return amount;
			}};
			
			Guest guest = new Guest(0, 0);
			mart.sell(guest, 10000, 0);
		
			System.out.println(guest);
			
			System.out.println(mart);
		
	}

}
