package ch03.unit01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		//초를 입력 받아 시, 분, 초 로 변환하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int a, h, m, s;
		
		System.out.println("초를 입력하세요 ? ");
		a = sc.nextInt();
		
		h = a / 3600; //시간
		m = (a / 60) % 60; //분
		s = a % 60; //초
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", a, h, m, s);
		
		sc.close();
	}

}
