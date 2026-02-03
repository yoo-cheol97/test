package com.ktdsuniversity.edu.ariplane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Seats {

	private static void printAirplaneName(Map<String, List<AirplaneName>> seat) { // seat 비행기 좌석 map

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("비행기 편의 이름을 입력하세요: ");
			String input = scanner.nextLine();

			if (input.equals("0001")) {
				System.out.println(input + "편은 존재하지 않습니다.");
			} 
			else if(input.equals("0002")){
				List<AirplaneName> seats = seat.get(input);
				System.out.println(input + "편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
				System.out.println();
				for (int i = 0; i < seats.size(); i++) {
					System.out.print(seats.get(i));
				}
				System.out.println();
				
				while (true) {
					System.out.println();
					System.out.print("좌석 예약을 하려면 번호를 입력하세요: ");
					String seatInput = scanner.nextLine();
					
					for (int i = 0; i < seats.size(); i++) { // 밑 airplane 9개의 객체가 들어감
						AirplaneName ox = seats.get(i);
						if (String.valueOf(ox.getNumber()).equals(seatInput)) {
							if (ox.getSeatOx().equals("X")) {
								System.out.println(seatInput + "번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: ");
							} else {
								System.out.print(seatInput + "번 좌석을 예약하시겠습니까? (Y/N): ");
								String booked = scanner.nextLine();
								if (booked.equals("Y")) {
									ox.setSeatOx("X");
									System.out.println(seatInput + "번 좌석이 예약되었습니다.");
								}
							}
						}
					}
					break;
				}
			}
			else if (input.equals("0003")) {
				List<AirplaneName> seats = seat.get(input);
				
				System.out.println(input + "편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
				for (int i = 0; i < seats.size(); i++) {
					System.out.println(seats.get(i));
				}
				System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
			} else {
				System.out.println(input + "편은 없습니다.");
			}
		}
	}

	public static void main(String[] args) {
	
		Map<String, List<AirplaneName>> seat = new HashMap<>();
		
		seat.put("0002", new ArrayList<>());
		seat.put("0003", new ArrayList<>());
		
		List<AirplaneName> airplane = seat.get("0002");
		airplane.add(new AirplaneName(1, "O"));
		airplane.add(new AirplaneName(2, "O"));
		airplane.add(new AirplaneName(3, "O"));
		airplane.add(new AirplaneName(4, "O"));
		airplane.add(new AirplaneName(5, "X"));
		airplane.add(new AirplaneName(6, "O"));
		airplane.add(new AirplaneName(7, "O"));
		airplane.add(new AirplaneName(8, "O"));
		airplane.add(new AirplaneName(9, "O"));
		
		List<AirplaneName> airplane2 = seat.get("0003");
		airplane2.add(new AirplaneName(1, "X"));
		airplane2.add(new AirplaneName(2, "X"));
		airplane2.add(new AirplaneName(3, "X"));
		airplane2.add(new AirplaneName(4, "X"));
		airplane2.add(new AirplaneName(5, "X"));
		airplane2.add(new AirplaneName(6, "X"));
		airplane2.add(new AirplaneName(7, "X"));
		airplane2.add(new AirplaneName(8, "X"));
		airplane2.add(new AirplaneName(9, "X"));
		
		printAirplaneName(seat);
	
	}
}
