package ch04.unit02;

import java.util.Scanner;

public class Ex06_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y, m;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		System.out.print("월 ? ");
		m = sc.nextInt();
		
		switch(m){
		
		/*
			- 강화된 switch (JDK 14 이상 버전 가능)
			  : 여러 조건
			    case 값, 값, 값, 값 -> 수식;
			  : 화살표 case 라벨(->)
			    마지막에 break를 사용하는 것과 동일
			    실행문이 1개인 경우만 {}(중괄호) 생략 가능. 즉 실행문 2줄 이상인 경우 {}로 블록화 해줘야함.
		*/
		
		case 1,3,5,7,8,10,12 -> System.out.println("31일");
		case 4,6,9,11 -> System.out.println("30일");
		default -> {
			int d = y%4 == 0 && y%100 != 0 || y%400 == 0 ? 29:28;
			System.out.println(d + "일");
		}
		
		}
		
		
		sc.close();

	}

}
