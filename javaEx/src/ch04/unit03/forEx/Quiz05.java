package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, max;
		
		//처음 입력 받은 값을 초기값으로
		/*
		max = 0;
		System.out.println("5개의 정수를 입력...");
		
		for(int i=0; i<5; i++) {
			n = sc.nextInt();
			
			if(i==0 || max < n) {
				max = n;
			}
		}
		
		System.out.println("최대 값: " + max);
		*/
		
		/*
		//음수만 입력 했을 경우 값이 0.
		
		int n, max=0;
		
		for(int i=1; i<=10; i++) {
			n = sc.nextInt();
			
			if(max < n) {
				max = n;
			}
		}
		
		System.out.println("최대 값: " + max);
		*/
		/*
		System.out.println("5개의 정수를 입력...");
		max = sc.nextInt();
		for(int i=0; i<4; i++) {
			n = sc.nextInt();
			
			if(max < n) {
				max = n;
			}
		}
		
		System.out.println("최대 값: " + max);
		*/
		
		//가장 적은 값을 초기 값으로
		max = 0x80000000; //'0x' 붙이면 16진수
		
		System.out.println("5개의 정수를 입력...");
		
		for(int i=0; i<4; i++) {
			n = sc.nextInt();
			
			if(max < n) {
				max = n;
			}
		}
		
		System.out.println("최대 값: " + max);
		
		sc.close();
		
	}
}
