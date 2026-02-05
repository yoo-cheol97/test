package com.ktdsuniversity.edu.fp.basic.calc;

import java.util.function.BiFunction;

public class Calculator {
	
	public int calc(int num1, int num2, Compute compute) {
		return compute.compute(num1, num2); // 1. compute.java num1, num2로 전달
	}
	
	public int calc2(int num1, int num2, BiFunction<Integer, Integer, Integer> function) {
		return function.apply(num1, num2); // 1. compute.java num1, num2로 전달
	}

}
