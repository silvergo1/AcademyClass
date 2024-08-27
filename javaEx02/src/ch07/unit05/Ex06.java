package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		// 생년월일 (yyyy-mm-dd)을 입력받아 나이구하기
		
		Scanner sc = new Scanner(System.in);
		String birth;
		
		int age;
		
		do {
			System.out.print("생년월일?");
			birth = sc.next();
			birth = birth.replaceAll("(\\-|\\/|\\.)", "");
			
		}while(! birth.matches("^(\\d{8})$"));
		
		age = toAge(birth);
		
		System.out.println("나이 : " + age);
		
		sc.close();
		
	}
	
	public static int toAge(String birth) {
		
		int age = 0;
		
		birth = birth.replaceAll("(\\-|\\/|\\.)", "");
		
		Calendar now = Calendar.getInstance();
		int m = now.get(Calendar.MONTH)+1;
		int d = now.get(Calendar.DATE);
		String nowMonthDate = String.format("%02d%02d", m, d);
		
		int y = Integer.parseInt(birth.substring(0,4));
		
		age = now.get(Calendar.YEAR) - y;
		
		if(birth.substring(4).compareTo(nowMonthDate)>0) { //compareTo 문자열 비교
			age--;
		}
		
		return age;
		
	}

}
