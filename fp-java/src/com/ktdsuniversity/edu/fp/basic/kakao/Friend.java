package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;

public class Friend {
	
	private String name;
	private LocalDate bitrhdate;
	
	public Friend(String name, String birthdate) {
		this.name = name;
		this.bitrhdate = LocalDate.parse(birthdate);
	}
	
	public String getName() {
		return this.name;
	}
	
	public LocalDate getBitrhdate() {
		return bitrhdate;
	}

	@Override
	public String toString() {
		return "이름: " + this.name + ", 생일: " + this.bitrhdate;
	}
	
	
	
}
