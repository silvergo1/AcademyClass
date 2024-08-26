package ch04.unit02;

import java.util.Scanner;

public class Ex07_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y, m, d;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		System.out.print("월 ? ");
		m = sc.nextInt();
		
		/*
		 	- switch 표현식
		 	  : -> 또는 yield 를 사용하여 값을 반환
		 	  : switch 표현식 마지막에 ;(세미콜론)이 필요함.
		 	  : yield는 {} 안에서만 사용가능.
		*/
		
		d = switch(m) {
			case 1,3,5,7,8,10,12 -> 31;
			case 4,6,9,11 -> 30;
			default -> {
				int n = y%4 == 0 && y%100 != 0 || y%400 == 0 ? 29:28;
				yield n;
				//yield: switch 표현식의 결과 값을 반환해주는 값
			}
		}; //스위치 표현식의 마지막은 반드시 ;
		
		System.out.printf("%d년 %d월의 마지막은 %d일 입니다.\n", y, m, d);
		
		
		sc.close();

	}

}
