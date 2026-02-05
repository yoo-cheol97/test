package com.ktdsuniversity.edu.fp.basic.kakao;

import java.lang.management.PlatformLoggingMXBean;
import java.time.LocalDate;
import java.time.Period;

public class KakaoTalk {
	public static void main(String[] args) {
		FriendList fl = new FriendList();
		
		fl.add(new Friend("A", "2000-01-01"));
		fl.add(new Friend("B", "2001-11-11"));
		fl.add(new Friend("C", "2002-02-02"));
		fl.add(new Friend("D", "2003-03-03"));
		
		fl.add(new Friend("E", "2003-02-04"));
		fl.add(new Friend("F", "2003-02-09"));
		fl.add(new Friend("G", "2003-01-30"));
		fl.add(new Friend("H", "2003-02-01"));
		
		System.out.println("7일 이내에 생일을 맞이하는 친구 목록");
		//fl.printSpecialFriends(birthdate -> birthdate.isAfter(LocalDate.now())
		//					&& birthdate.isBefore(LocalDate.now().plusDays(8))); // Search 파라미터가 1개면 괄호도 생략 가능
		
		fl.printSpecialFriends2(friend ->{
			
			LocalDate birthdate = friend.getBitrhdate().withYear(LocalDate.now().getYear());
			return birthdate.isAfter(LocalDate.now())
				&& birthdate.isBefore(LocalDate.now().plusDays(8) );
		});
		
		
		System.out.println("\n오늘이 생일인 친구 목록");
		//fl.printSpecialFriends(birthdate -> birthdate.isEqual(LocalDate.now()));
		
		fl.printSpecialFriends2(friend -> {
			LocalDate now = LocalDate.now();
			LocalDate birthdate = friend.getBitrhdate().withYear(now.getYear());
			return birthdate.isEqual(now);
			
		});
		
		System.out.println("\n7일 이내에 생일이 지난 친구 목록");
		//fl.printSpecialFriends(birthdate -> birthdate.isBefore(LocalDate.now())
		//					&& birthdate.isAfter(LocalDate.now().minusDays(8)));
		
	
		
		System.out.println("\n오늘 만 30세가 된 친구 목록");
		
		fl.printSpecialFriends2(friend -> {
			
			Period period = Period.between(friend.getBitrhdate(), LocalDate.now());
			return period.getYears() == 30 && period.getMonths() == 0 && period.getDays() == 0;
		});
		
		System.out.println("\n이름이 'A'인 친구 목록");
		fl.printSpecialFriends2(friend -> friend.getName().equals("A"));
		
		System.out.println("\n이름이 '김'으로 시작하는 친구 목록");
		fl.printSpecialFriends2(friend -> friend.getName().equals("김"));
		
		System.out.println("\n이름이 '이'로 시작하면서 나이가 20세 이상인 친구 목록");
		fl.printSpecialFriends2(friend -> friend.getName().equals("김"));
		
		
		System.out.println("\n전체 친구 목록");
		//System.out.println(fl);
		fl.printSpecialFriends2(friend -> true);
	}

}
