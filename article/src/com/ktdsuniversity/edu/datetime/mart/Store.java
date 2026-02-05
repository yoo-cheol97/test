package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

	private List<Item> items;

	public Store() {
		this.items = new ArrayList<>();
	}

	public void add(Item item) {
		this.items.add(item);
	}

	public void sell(int index) {

		Item item = items.get(index);
		LocalDate expireDate = item.getExpireDate();
		LocalDate tempExpireDate = LocalDate.now();

		if (expireDate.isBefore(tempExpireDate)) {
			System.out.println("소비기한이 지나 판매하지 않습니다");
		} else if (expireDate.isEqual(tempExpireDate)) {
			System.out.println("오늘까지 드세요");
		} else if (tempExpireDate.isBefore(tempExpireDate.plusDays(4))) {
			System.out.println("가능한 빨리드세요");
		}
	}

	@Override
	public String toString() {
		return items.toString(); // 간단하게 리스트 출력
	}
}
	/*
	 * index에 할당되어있는 제품의 소비기한이 당일이라면 "오늘까지 드세요"를 출력
	 * 
	 * 소비기한이 3일 내에 도래한다면 "가능한 빨리드세요"를 출력
	 * 
	 * 소비기한이 지났다면 "소비기한이 지나 판매하지 않습니다"를 출력
	 */