package com.ktdsuniversity.edu.abstracts;

public class DepartmentStore extends AbstractMart {
	
	public DepartmentStore(int productPrice) {
		super(productPrice);
	}
	
	@Override
	public int usePoint(Guest guest) {
		
		int point = guest.getPoint();
		if(point >= 10000) {
			guest.usePoint(point);
			return point;
		}
		
		return 0;
	}
	
	@Override
	public void givePoint(Guest guest, int amount) {
		/*
		 * Guest : Guest is a Guest
		 *   - VIP : VIP is a Guest
		 *       - VVIP : VVIP is a VIP and Guest
		 */
		if ( guest instanceof VVIP) {
			guest.addPoint((int)(amount * 0.3));
		}
		else if ( guest instanceof VIP) {
			
		}
		else if (guest instanceof Guest) {
			guest.addPoint((int)(amount * 0.05));
		}
	}
	
	@Override
	public int discount(Guest guest, int amount) {
		return 0;
	}
}
