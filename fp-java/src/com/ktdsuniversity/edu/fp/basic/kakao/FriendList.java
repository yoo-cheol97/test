package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FriendList {
	
	private List<Friend> friends;
	
	public FriendList() {
		this.friends = new ArrayList<>();
	}
	
	public void add(Friend friend) {
		this.friends.add(friend);
	}
	
	public void printSpecialFriends(Search search) {
		
		//LocalDate tempBirthdate = null;
		
		for(Friend f : this.friends) {
			
			//tempBirthdate = LocalDate.parse(f.getBitrhdate().toString()); // temp가 반복 중인 친구의 생일
			//tempBirthdate = tempBirthdate.withYear(LocalDate.now().getYear()); // 올해의 연도로 바뀐다
			
			if(search.check(f)) {
				System.out.println(f);
			}
			
			
		}
		
	}
	
public void printSpecialFriends2(Predicate<Friend> predicate) {
		
		//LocalDate tempBirthdate = null;
		
		for(Friend f : this.friends) {
			
			//tempBirthdate = LocalDate.parse(f.getBitrhdate().toString()); // temp가 반복 중인 친구의 생일
			//tempBirthdate = tempBirthdate.withYear(LocalDate.now().getYear()); // 올해의 연도로 바뀐다
			
			if(predicate.test(f)) {
				System.out.println(f);
			}
			
			
		}
		
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		if(this.friends.size() == 0) {
			buffer.append("등록된 친구가 없습니다");
		}
		else {
			for(Friend f : this.friends) {
				buffer.append(f);
				buffer.append("\n");
			}
		}
		
		return buffer.toString();
	}
	
	
	
}
