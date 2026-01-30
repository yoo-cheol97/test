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
		 if (guest instanceof Guest) {
				guest.addPoint((int)(amount * 0.005));
			}
		
		else if ( guest instanceof VVIP) {
			guest.addPoint((int)(amount * 0.03));
		}
		else if ( guest instanceof VIP) {
			
		}
		
	}
	
	@Override
	public int discount(Guest guest, int amount) {
		int discountM = 0;
		
		if(guest instanceof VVIP) {
			discountM = (int)(amount * 0.1);
		}
		else if(guest instanceof VIP) {
			discountM = (int)(amount * 0.03);
		}
		return discountM;
		
	}
}
