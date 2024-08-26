package ch03.unit01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 	반지름을 입력 받아 원의 넓이와 둘레 계산
		 	넓이 = 반지름 * 반지름 * 3.141592
		 	둘레 = 반지름 * 2 * 3.141592
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int r;
		double a, b;
		double PI = 3.141592;
		
		System.out.print("반지름 값은 ? ");
		r = sc.nextInt();
		
		a = r * r * PI;
		b = r * 2 * PI;
		
		System.out.printf("넓이: %.2f\n둘레: %.2f", a, b);
		
		sc.close();

	}

}
