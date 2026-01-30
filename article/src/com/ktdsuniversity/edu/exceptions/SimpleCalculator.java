package com.ktdsuniversity.edu.exceptions;

import com.ktdsuniversity.edu.exceptions.custom.DivideZeroException;
import com.ktdsuniversity.edu.exceptions.custom.NullOperatorException;
import com.ktdsuniversity.edu.exceptions.custom.WrongOperatorException;

public class SimpleCalculator {
	/**
	 * 계산기
	 * @param a 계산할 값
	 * @param b 계산할 값
	 * @param operator 연산자 (+, -, *, /)
	 * @return 연산자에 따른 결과를 반환
	 */
	
	public int calc(int a, int b, String operator) {
		
		int result = 0;
		
		if(operator == null) {
			//System.out.println("잘못된 연산자입니다");
			//throw new RuntimeException("잘못된 연산자입니다");
			throw new NullOperatorException("잘못된 연산자입니다");
			//return 0; //throw를 쓰면 지운다
		}
		
		if(operator.equals("+")){
			result = a + b;
		}
		else if(operator.equals("-")){
			result = a - b;
		}
		
		else if(operator.equals("*")){
			result = a * b;
		}
		
		else if(operator.equals("/")){
			
			if(a == 0 || b == 0) {
				//throw new RuntimeException("잘못된 숫자 입니다");
				throw new DivideZeroException("잘못된 연산자입니다");
				//System.out.println("잘못된 숫자 입니다");
				//return 0;
			}
			
			result = a / b;
		}
		else {
			//throw new RuntimeException("잘못된 연산자 입니다");
			throw new WrongOperatorException("잘못된 연산자입니다");
			//System.out.println("잘못된 연산자 입니다");
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		SimpleCalculator sc = new SimpleCalculator();
		int result = 0;
		try {
			result = sc.calc(10, 0, "+");
		}
		catch(NullOperatorException noe) { //연산자가 0일 때의 처리
			System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
		}
		
		catch(DivideZeroException dge) { // 숫자가 0일 때의 처리
			System.out.println("0으로 나누려 했습니다. 숫자를 제대로 작성해서 다시 실행하세요");
		}
		
		catch(WrongOperatorException woe) { // 연산자를 잘못 작성했을 때의 처리
			System.out.println("지원하지 않는 연산자입니다. +, -, *, / 중에 선택해서 다시 실행하세요");
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, "-");
		}
		catch(NullOperatorException noe) { //연산자가 0일 때의 처리
			System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
		}
		
		catch(DivideZeroException dge) { // 숫자가 0일 때의 처리
			System.out.println("0으로 나누려 했습니다. 숫자를 제대로 작성해서 다시 실행하세요");
		}
		
		catch(WrongOperatorException woe) { // 연산자를 잘못 작성했을 때의 처리
			System.out.println("지원하지 않는 연산자입니다. +, -, *, / 중에 선택해서 다시 실행하세요");
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, "*");
		}
		catch(NullOperatorException noe) { //연산자가 0일 때의 처리
			System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
		}
		
		catch(DivideZeroException dge) { // 숫자가 0일 때의 처리
			System.out.println("0으로 나누려 했습니다. 숫자를 제대로 작성해서 다시 실행하세요");
		}
		
		catch(WrongOperatorException woe) { // 연산자를 잘못 작성했을 때의 처리
			System.out.println("지원하지 않는 연산자입니다. +, -, *, / 중에 선택해서 다시 실행하세요");
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, "/");
		}
		catch(NullOperatorException noe) { //연산자가 0일 때의 처리
			System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
		}
		
		catch(DivideZeroException dge) { // 숫자가 0일 때의 처리
			System.out.println("0으로 나누려 했습니다. 숫자를 제대로 작성해서 다시 실행하세요");
		}
		
		catch(WrongOperatorException woe) { // 연산자를 잘못 작성했을 때의 처리
			System.out.println("지원하지 않는 연산자입니다. +, -, *, / 중에 선택해서 다시 실행하세요");
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, "%");
		}
		catch(NullOperatorException noe) { //연산자가 0일 때의 처리
			System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
		}
		
		catch(DivideZeroException dge) { // 숫자가 0일 때의 처리
			System.out.println("0으로 나누려 했습니다. 숫자를 제대로 작성해서 다시 실행하세요");
		}
		
		catch(WrongOperatorException woe) { // 연산자를 잘못 작성했을 때의 처리
			System.out.println("지원하지 않는 연산자입니다. +, -, *, / 중에 선택해서 다시 실행하세요");
		}
		System.out.println(result);
		
		try {
			result = sc.calc(10, 0, null);
		}
		catch(NullOperatorException noe) { //연산자가 0일 때의 처리
			System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
		}
		
		catch(DivideZeroException dge) { // 숫자가 0일 때의 처리
			System.out.println("0으로 나누려 했습니다. 숫자를 제대로 작성해서 다시 실행하세요");
		}
		
		catch(WrongOperatorException woe) { // 연산자를 잘못 작성했을 때의 처리
			System.out.println("지원하지 않는 연산자입니다. +, -, *, / 중에 선택해서 다시 실행하세요");
		}
		System.out.println(result);
		
		
	}
	

}
