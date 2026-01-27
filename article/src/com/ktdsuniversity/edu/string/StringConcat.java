package com.ktdsuniversity.edu.string;

public class StringConcat {
	
	public static void main(String[] args) {
		
		String abcd = "abcdefghijk";
		
		/*
		for ( int i =  0; i < 20; i++ ) {
			abcd += abcd;
			
		}*/
		
		int i = 0;
		 while(true) {
			 abcd += abcd;
			 
			 if(i > 100) {
				 break;
			 }
		 }
		
		System.out.println("완료되었습니다");
		
	}

}
