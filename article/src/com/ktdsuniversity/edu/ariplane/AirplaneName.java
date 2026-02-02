package com.ktdsuniversity.edu.ariplane;

import java.util.Scanner;

public class AirplaneName {
	
	private int number;
	private String seatO;
	
	public AirplaneName(int number, String seatO) {
		this.number = number;
		this.seatO = seatO;
	}

	@Override
	public String toString() {
		return "AirplaneName = " + this.number + " : " + this.seatO ;
	}
	
	
	
	/*
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println("비행기 편의 이름을 입력하세요: ");

		if (input.equals("0001")) {
			String planeName = scanner.nextLine();
			System.out.println("0001편은 존재하지 않습니다.");
			System.out.println("다른 비행기 편의 이름을 입력하세요: ");
		}
	}*/

}
