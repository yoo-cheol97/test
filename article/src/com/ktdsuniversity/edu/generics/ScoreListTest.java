package com.ktdsuniversity.edu.generics;

import java.util.Arrays;

public class ScoreListTest {
	
	public static void main(String[] args) {
		
		ScoreList<Integer, Integer> list = new ScoreList<Integer, Integer>(); //<>에 int를 적으면 ScoreList에 할당x 클래스만 할당 가능
		//에러나는 이유 scorelist에는 t, sumresult2개를 사용하는데 여기는 1개만 사용, 1개를 추가해줘야함
		list.add(1); // 제너릭
		list.add(1); 
		list.add(1);
		list.add(1); 
		list.add(1); 
		list.add(1); 
		list.add(1); 
		
		Reducer<Integer, Integer> listReducer = new Reducer<>() { // reducer라는 인터페이스를 가져오고 제네릭을 맞추기 위해 INPUT OUTPUT을 둘 다 Integer로 준다

			@Override
			public Integer reduce(Integer input, Integer output) {
				return input + output;
			}
		}; 
		
		int sum = list.sum(listReducer, 0);
		System.out.println(sum);
		
		
		int value = list.get(3);
		System.out.println(value);
		
		
		ScoreList<String, String> strList = new ScoreList<>(); // .add를 하면 타입이 바뀌어있음 int -> string
		// String 추가 10줄 이유
		strList.add("abcd");
		strList.add("abcd");
		strList.add("abcd");
		
		String concat = ""; //합칠 수가 없어서 연결한다는 생각으로
		for(int i = 0; i < 2; i++) {
			concat += strList.get(i);
		}
		System.out.println(concat);
		
		String strValue = strList.get(0);
		System.out.println(value);
		
		ScoreList<String[], String> arrayList = new ScoreList<>(); // 추가
		arrayList.add(new String[] {"abcd", "efgh"});
		arrayList.add(new String[] {"abcd", "efgh"});
		
		Reducer<String[], String> arrayReducer = new Reducer<>(){// input은 string배열 

			@Override
			public String reduce(String[] input, String output) {
				for(int i = 0; i < input.length; i++) {
					output += input[i];
				}
				
				return output;
			}
			
		};
		String arrayResult = arrayList.sum(arrayReducer, "");
		System.out.println(arrayResult);
	}
	
}
