package com.ktdsuniversity.edu.generics;

public class ScoreList<T, SUM_RESULT> { //T에게 아무것도 할당하지 않았다면 object, SUM_RESULT라는 제네릭 생성
	
	// scoreList에서 사용할 멤버 변수
	// 점수들의 배열
	private Object[] scoreArray; // 모든 걸 담을 수 있게 T[]에서 Object로 바꿔준다 14줄 포함
	
	// 배열에 몇 개의 데이터가 있는지 확인하는 용도의 변수를 만든다
	private int size;
	
	public ScoreList(){ // 제네릭은 제외한 클래스만 <T>를 지운다
		// T[] scoreArray 초기화: 인덱스가 2개인
		this.scoreArray = new Object[2];
		
	}
	
	public void add(T score) {
		if(this.size >= this.scoreArray.length) {
			// 배열의 길이를 늘린다
			// 1. 기존 배열의 길이보다 2개 더 많은 인덱스를 가진 배열을 새롭게 만든다
			Object[] newArray = new Object[this.scoreArray.length + 2];
			// 2. 기존 배열의 데이터를 새로운 배열에 복사한다
			// System.arraycopy//(원본 배열, 복사를 시작할 원본 배열의 인덱스 번호, 복사를 받을 새로운 배열, 새로운 배열의 복사를 받을 시작 인덱스 번호, 복사할 개수);
			System.arraycopy(this.scoreArray, 0, newArray, 0, this.scoreArray.length);
			// 3. 새로운 배열을 기존의 배열에 할당한다
			this.scoreArray = newArray;
		}
		this.scoreArray[this.size++] = score;
	}
	
	public T get(int index) { // 위 add에 T를 넣었으니까 반환 시킬 것도 T
		if(this.size <= index) {// index가 벗어난 케이스
			throw new IndexOutOfBoundsException(this.size + "보다 크거나 같은 인덱스는 없습니다");
		}
		
		T value = (T) this.scoreArray[index]; // 아직(T)가 뭔지 모르지만 (T)로 형변환하고 value를 반환
		return value;
	}
	
	public SUM_RESULT sum(Reducer<T, SUM_RESULT> reducer, SUM_RESULT defaultValue) {
		SUM_RESULT result = defaultValue;
		
		T t = null;
		
		for(int i = 0; i < this.size; i++) {
			t = (T) this.scoreArray[i]; //(T)로 this.scoreArray 타입 변환해준다
			result = reducer.reduce(t, result);
		}
		return result;
	}
	
	/*
	public void sum() { // public int sum()으로 적으면 integer로만 판단한다 안됨
		// 배열에 들어있는 모든 요소들의 합을 구해 반환하려 한다
		//T sum = 0; // T가 뭔지 몰라서 안됨
		test로 가서 구해야함
	}*/

}
