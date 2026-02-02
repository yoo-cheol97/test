package com.ktdsuniversity.edu.ariplane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seats {
	
	private static void printAirplaneName(Map<Integer, List<AirplaneName>> seat, int i) {
		
		List<AirplaneName> airplane = seat.get(i);
		
		if(airplane != null) {
			for(AirplaneName airplaneName : airplane) {
				System.out.println(i);
				System.out.println(airplaneName);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Map<Integer, List<AirplaneName>> seat = new HashMap<>();
		
		seat.put(0002, new ArrayList<>());
		seat.put(0003, new ArrayList<>());
		
		List<AirplaneName> airplane = seat.get(0002);
		airplane.add(new AirplaneName(1, "O"));
		airplane.add(new AirplaneName(2, "O"));
		airplane.add(new AirplaneName(3, "O"));
		airplane.add(new AirplaneName(4, "O"));
		airplane.add(new AirplaneName(5, "X"));
		airplane.add(new AirplaneName(6, "O"));
		airplane.add(new AirplaneName(7, "O"));
		airplane.add(new AirplaneName(8, "O"));
		airplane.add(new AirplaneName(9, "O"));
		
		printAirplaneName(seat, 1);
			
	}


}
