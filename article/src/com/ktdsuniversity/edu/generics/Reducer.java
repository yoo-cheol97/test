package com.ktdsuniversity.edu.generics;

public interface Reducer<INPUT, OUTPUT> { // 만들어진 인스턴스를 scorelist 41번째 줄에 준다
	
	OUTPUT reduce(INPUT input, OUTPUT output); //OUTPUT을 반환시킨다 - INPUT주면 OUTPUT준다

}
