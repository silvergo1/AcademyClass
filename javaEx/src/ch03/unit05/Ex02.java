package ch03.unit05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		//정수를 입력받아 짝/홀 판별
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		String s;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		s = a % 2 == 0 ? "짝수" : "홀수";
		System.out.printf("%d : %s\n", a, s);
		
		sc.close();

	}

}
