package com.ktdsuniversity.edu.fp.basic.convert;

import java.util.function.Function;

public class Converter {
	
	public void printConvertResult2(String str, Function<String, Integer> function) {
		
		int result = function.apply(str); // String을 전환해서 integer를 반환 받는다
		System.out.println(result);
		
	}
	
	

	public void printConvertResult(String str, Changer changer) {
		
		int result = changer.changeToInt(str);
		
		System.out.println(result);
	}

}
