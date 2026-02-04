package com.ktdsuniversity.edu.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		int Year = now.get(Calendar.YEAR);
		System.out.println(Year);
		
		int month = now.get(Calendar.MONTH) + 1; // month를 배열로 관리
		System.out.println(month);
		
		int date = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 1 - 일요일 ~ 7 - 토요일
		System.out.println(week);
		
		String[] weekDays = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(weekDays[week - 1] + "요일");
		
		Calendar birthdate = Calendar.getInstance();
		birthdate.set(1997, 5 - 1, 22);
		week = birthdate.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDays[week -1] + "요일");
		
		// 오늘 날짜부터 56일 후는 몇 월 며칠 무슨 요일일까?
		Calendar now2 = Calendar.getInstance();
		now2.add(Calendar.DAY_OF_MONTH, 56);
		// now2에서 연, 월, 일, 요일 추출 출력
		
		// 2025년 2월 4일은 2026년 2월 4일보다 과거인가?
		Calendar now3 = Calendar.getInstance();
		Calendar past = Calendar.getInstance();
		past.set(2025, 2 - 1, 4);
		
		long nowTime = now3.getTimeInMillis(); // now3의 시간이 1970년 1월 1일 0시 0분 0초부터 얼마나 흘렀나?
		System.out.println(nowTime);
		
		long pastTime = past.getTimeInMillis();
		System.out.println(pastTime);
		
		if(pastTime < nowTime) {
			System.out.println("더 과거입니다");
		}
		
		// 2026년 2월 4일부터 2026월 7월 14일까지 며칠이 걸리나?
		Calendar now4 = Calendar.getInstance();
		int daysCount = 0;
		while(true) {
			now4.add(Calendar.DAY_OF_MONTH, 1); // 하루씩 더한다
			daysCount++;
			
			if(now4.get(Calendar.YEAR) == 2026 && now4.get(Calendar.MONTH) == 6 && now4.get(Calendar.DAY_OF_MONTH) == 14){
				break;
			}
		}
		System.out.println(daysCount + "일 걸렸습니다");
		
		// 오늘부터 7영업일 이후는 몇 년 몇 월 며칠 무슨 요일인가?
		Calendar now5 = Calendar.getInstance();
		int workingDays = 7;
		int weekDay = 0;
		while(workingDays > 0) {
			now5.add(Calendar.DAY_OF_MONTH, 1);
			weekDay = now5.get(Calendar.DAY_OF_WEEK);
			if(weekDay != 1 && weekDay != 7) {
				workingDays--;
			}
		}
		
		int nextYear = now5.get(Calendar.YEAR);
		int nextMonth = now5.get(Calendar.MONTH) + 1;
		int nextDate = now5.get(Calendar.DAY_OF_MONTH);
		weekDay = now5.get(Calendar.DAY_OF_WEEK);
		System.out.println(nextYear + "-" + nextMonth + "-" + nextDate + "|" + weekDays[weekDay -1] + "요일" );
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*java.util.Date*/ Date dateTime = now5.getTime();
		String dateString = sdf.format(dateTime);
		dateString += " " + weekDays[weekDay - 1] + "요일";
		System.out.println(dateString);
		
	}
}
