package com.ktdsuniversity.edu.string;

public class StringBufferExam {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefg");
		sb.append("abcdefg");
		sb.append("abcdefg");
		sb.append("abcdefg");
		sb.append("abcdefg");
		sb.append("abcdefg");
		sb.append("abcdefg");
		sb.append("abcdefg");
		sb.append("abcdefg");
		
		String str = sb.toString();
		
		appendString(longString);
		
		System.out.println(sb);
		System.out.println(str);
		
		StringBuffer longString = new StringBuffer();
		//for(int i = 0; i < 100; i++) {
		//	longString.append("abcdefg");
		//}
		
		String resultString = longString.toString();
		System.out.println(">>" + resultString);
		
	}
	
	public static void appendString(StringBuffer buffer) {
		buffer.append("123456");
	}
	

}
