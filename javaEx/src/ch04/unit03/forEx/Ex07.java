package ch04.unit03.forEx;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		//정수를 입력 받아 입력 받은 수 까지 짝수합 구하기

		Scanner sc = new Scanner(System.in);
		
		int n, s, inputNum;
		s=0;
		
		System.out.print("정수 ? ");
		inputNum = sc.nextInt();
		
		for(n=0; n <= inputNum; n+=2) {
			s+=n;
		}
		System.out.println(s);
		
		/*
		int inputNum, s;
		
		do {
			System.out.print("정수 ? ");
			inputNum = sc.nextInt();
		}  while(inputNum < 0);
		*/
		
		sc.close();
		
	}

}
