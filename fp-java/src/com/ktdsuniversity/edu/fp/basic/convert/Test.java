package com.ktdsuniversity.edu.fp.basic.convert;

public class Test {
	
	public static void main(String[] args) {
		
		Converter converter = new Converter();
		
		
		// 숫자로 변환한 결과를 반환한다
		converter.printConvertResult("10", str -> Integer.parseInt(str));
		
		converter.printConvertResult("12", Integer::parseInt);
		
		converter.printConvertResult("abcdef", str -> str.length()); // 파라미터의 타입을 쫓을 거면
		converter.printConvertResult("abcdef", String::length); // 내가 사용하려는 메소드가 
		
		
		converter.printConvertResult2("10", str -> Integer.parseInt(str));
		
		converter.printConvertResult2("12", Integer::parseInt);
		
		converter.printConvertResult2("abcdef", str -> str.length());
		converter.printConvertResult2("abcdef", String::length);
	}

}
