package com.ktdsuniversity.edu.exceptions;

public class RandomExtractNumbers {
	
	private String[] numbers;
	
	public RandomExtractNumbers() {
		this.numbers = new String[100];
		
		int index = 0;
		for(int i = 0; i < 10; i++) {
			index =  (int) (Math.random() * this.numbers.length); // 0부터 99 중 숫자 1개
			this.numbers[index] = (int) (Math.random() * 1_000_000) + "";
		}
		
		for(int i = 0; i < 10; i++) {
			index =  (int) (Math.random() * this.numbers.length); // 0부터 99 중 숫자 1개
			this.numbers[index] =  (char) ((int) (Math.random() * 26) + 97) + ""; // 122 = z, 97 = a
		}
	}
	
	// 브라우저에서 서버로 데이터를 전송함 -> 데이터베이스에 데이터를 저장
	// 브라우저에서 서버로 전송된 데이터의 형태가 어떠한지 그 누구도 모른다
	//  -데이터 검증이 반드시 필요 ==> Validation Logic이 필요 ==> 예외처리 (데이터를 알맞게 입력했냐?)	
	
	public void printNumber2(int index) {
		if(index >= 0 && index > this.numbers.length) {
			String value = this.numbers[index];
			if(value != null && value.matches("^[0-9]+$"));{
				int intValue = Integer.parseInt(value);
				System.out.println(intValue);
				return;
			}
			
		}
	}
	
	public void printNumber(int index) {
		//this.numbers의 index에 존재하는 값을 출력한다
		//값이 숫자인 경우 그대로 출력하고 아닌 경우 0을 출력한다
		/*
		if(index > 0 && index <= this.numbers.length) {
			System.out.println("Index: " + index + ", " +"value: " + this.numbers[index]);
			System.out.println("Index: " + index + " - " +"Not number format" + " - Result: 0");
		}
		else if (index > this.numbers.length) {
			System.out.println("Index: " + index + " - " + "out of range" + " - Result: 0");
		}
		*/
		if(index < 0 || index >= this.numbers.length) {
			System.out.println("Index: " + index + " - out of range. Result: " + 0);
			return;
		}
		
		String value = this.numbers[index];
		if(value == null) {
			System.out.println("Index: " + index + " - Null. Result: " + 0);
			return;
		}
		
		if(value.matches("^[0-9]+$")){
			int intValue = Integer.parseInt(value);
			System.out.println(intValue);
		}
		else {
			System.out.println("Index: " + index + " - " + value + " is wrong number format. Result: " + 0);
		}
		
	}
	
	public static void main(String[] args) {
		
		RandomExtractNumbers ren = new RandomExtractNumbers();
		
		int index = 0;
		for(int i = 0; i < 50; i++) {
			index = (int)(Math.random() * 200);
			ren.printNumber(index);
		}
	}
	

}
