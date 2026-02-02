package com.ktdsuniversity.edu.generics.collections.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.market.seller.Product;

public class ListExam {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("장민창");
		names.add("장민창1");
		names.add("장민창2");
		names.add("장민창3");
		names.add("장민창4");
		names.add("장민창5");
		
		System.out.println(names);
		
		String name = null;
		for(int i = 0; i < names.size(); i++) {
			name = names.get(i);
			System.out.println(name);
		}
		
		for(String name2 : names) {
			System.out.println(name2);
		}
		
		int[] arr = new int[] {1, 2, 3};
		for(int i = 0; i < arr.length; i++) { // index가 필요하면 for문
			System.out.println(arr[i]);
		}
		
		for(int value : arr) { // 반복하는 과정에서 index는 필요없으면 for : (내용 출력만 필요하다)
			System.out.println(value);
			
		}
		
		String[] names2 = new String[] {"A", "B", "C"};
		/*
		 * A ===> for : 문	1. A
		 * B				2. B
		 * C				3. C ==> for문 사용 (순번이 주어진다)
		 */
		
		
		//List<Product> products = new ArrayList<>();
		
	}

}
