package com.ktdsuniversity.edu.ariplane;

public class AirplaneName {
	
	private int number;
	private String seatOx;
	
	public AirplaneName(int number, String seatOx) {
		this.number = number;
		this.seatOx = seatOx;
	}
	
	public int getNumber() {
		return number;
	}

	public String getSeatOx() {
		return seatOx;
	}

	public void setSeatOx(String seatOx) {
		this.seatOx = seatOx;
	}

	@Override
	public String toString() {
		return this.number + ": " + this.seatOx + "   " ;
	}
	
}
