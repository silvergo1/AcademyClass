package ch03.unit05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		// 두 정수를 입력 받아 두 수 사이의 정수의 개수 구하기
		// 2~5 사이의 정수의 개수는 4개
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int n;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		n = (a>b ? a-b:b-a)+1;
		
		System.out.println("개수 : " + n);
		
		sc.close();

	}

}
