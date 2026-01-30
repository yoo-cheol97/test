package com.ktdsuniversity.edu.exceptions;

public class TryExam {
	
	public static void handleException() {
		
		try {
			Class.forName("com.ktdsuniversity.edu.exceptions.TryExam");
		}
		
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	public static void numberFormatExam(String str) {
		if(str != null) {
			int value = 0;
			
			try {
				//System.out.println("변환 전");
				value = Integer.parseInt(str); // 예외 발생 가능성 높지만 일단 실행해라
				//System.out.println("변환 후");
			}
			catch(NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
				nfe.printStackTrace();
			}
			System.out.println(value);
		}
		
	}
	
	public static void main(String[] args) {
		numberFormatExam("10000000");
		numberFormatExam("100000023232322323232");
		numberFormatExam("abcd");
		numberFormatExam("10000000");
		
		handleException();
		
	}

}
