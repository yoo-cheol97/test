package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;

public class Item {
	
	private String name;
	private LocalDate expireDate;

	public Item(String name, String expireDate) {
		this.name = name;
		this.expireDate = LocalDate.parse(expireDate);
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + expireDate;
	}
}
