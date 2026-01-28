package com.ktdsuniversity.edu.array;

public class ArrayExam {
	/*
	public static void main(String[] args) {
		
		int[] numArray = new int[10];
		numArray[0] = 10;
		
		//String[] strArray = new String[0]; // 아래 코드랑 동일
		String[] strArray = new String[] {"A", "B", "C", "D"};
		//								   0    1     2    3
		System.out.println(strArray[3]);
		
		String[] strArray2 = {"A", "B", "C", "D"};
		//					   0    1    2    3
		
	}
	
	
	*/
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		int[][] arr2 = new int [][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		int[][] arr3 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}; //보정 길이 4차원 배열

		int[][] arr4 = new int[3][];
		arr[0] = new int[] {1, 2, 3};
		arr[1] = new int[] {1, 2, 3, 4, 5, 6};
		arr[2] = new int[] {1};
		
	}

}
