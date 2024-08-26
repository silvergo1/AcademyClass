package ch04.unit03.whileEx;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력 받아 1 부터 입력받은 수까지 합 구하기
		
		int inputNum,n,s;
		
		n = s = 0;
		
		
		System.out.print("숫자 ? ");
		inputNum = sc.nextInt();
		
		while(n < inputNum) {
			n++;
			s+=n;
		}
		System.out.println("전체 합 : " + s);
		
		// 정수를 입력 받아 1 부터 입력받은 수까지 홀수합 구하기
		
		int inputNum2,n2,s2;
		
		n2 = 1;
		s2 = 0;
		
		
		System.out.print("숫자 ? ");
		inputNum2 = sc.nextInt();
		
		while(n2 <= inputNum2) {
			s2+=n2;
			n2+=2;
		}
		System.out.println("홀수 합 : " + s2);
		
		sc.close();

	}

}
