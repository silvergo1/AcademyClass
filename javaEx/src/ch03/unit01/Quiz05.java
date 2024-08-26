package ch03.unit01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		//주행거리와 시속을 입력 받아 주행시간을 계산하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int km, speed;
		int h, m;
		double s, t;
		
		System.out.print("주행거리(km) ? ");
		km = sc.nextInt();
		
		System.out.print("시속(km/h) ? ");
		speed = sc.nextInt();
		
		t = (double)km / speed;
		
		h = (int)t;
		m = (int)(t * 60 % 60);
		s = (t * 3600) % 60;
		s = (int)(s * 100) / 100.0; // 소수점 3째자리 버림
		
		System.out.printf("%d시간 %d분 %.2f초 소요", h, m, s);
		
		sc.close();

	}

}
