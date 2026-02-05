package com.ktdsuniversity.edu.fp.basic.calc;

public class Test {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		// num1, num2를 더해 반환한다
		int result = calc.calc2(1, 2, (n, n2) -> n + n2); // int result = calc.calc(1, 2, null);
		System.out.println(result);
		
		// num1의 num2를 제곱한 수를 반환
		int result2 = calc.calc2(2, 3, (n, n2) -> (int)Math.pow(n, n2));
		System.out.println(result2);
		
		// num1, num2 중 큰 수를 반환
		int result3 = calc.calc2(2, 3, (n, n2) -> Math.max(n, n2));
		System.out.println(result3);
		
		// num1, num2 중 작은 수를 반환
		int result4 = calc.calc2(2, 3, (n, n2) -> Math.min(n, n2));
		System.out.println(result4);
		
		// num1이 num2의 제곱수라면 0을 반환, 아니라면 1을 반환
		int result5 = calc.calc2(4, 16, (n, n2) -> n2 % n);
		if(result5 == 0) {
			System.out.println("0");
		}
		else {
			System.out.println("1");
		}
	}

}
