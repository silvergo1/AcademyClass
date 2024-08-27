package ch07.unit05;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 2024년 8월 1일
		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.MONTH, 7);
		cal.set(Calendar.DATE, 1);
		System.out.printf("%tF\n", cal);
		
		// 요일을 일요일으로 수정
		cal.set(Calendar.DAY_OF_WEEK, 1);
		System.out.printf("%tF\n", cal);
		
		/*
			요일을 일요일로 수정
			set() 메소드는 실제 날짜 필드의 갑슬 변경하지 않음
			따라서 요일을 변경하면 시스템 날짜보다 크지 않는 가장 가까운 일요일을 반환
			set()메소드를 호출하면 Calendard의 필드값은 변경되지만 시간 값은 get(), add() 등의 메소드를 호출해야 변경됨
		*/
		
		System.out.println("---------------------------------");
		
		// 2024년 8월 1일
		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.MONTH, 7);
		cal.set(Calendar.DATE, 1);
		System.out.printf("%tF\n", cal);
		
		cal.getTime(); // 리턴 타입 Data // 시간도 변경
		cal.set(Calendar.DAY_OF_WEEK, 1);
		System.out.printf("%tF\n", cal); // 8월 1일 주의 일요일로 변경 // 2024-07-28
	}

}
