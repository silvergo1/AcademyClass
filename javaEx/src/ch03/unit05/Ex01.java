package ch03.unit05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 삼항 연산자
		// 변수 = 논리식 ? 참 일때 : 거짓일때;
		
		// 정수를 입력 받아 절대값 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		b = a > 0 ? a : -a;
		
		System.out.printf("%d 의 절대값 : %d\n", a, b);
		
		sc.close();

	}

}
