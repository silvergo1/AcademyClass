package ch03.unit03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		//s = n%2 == 0 ? "짝수" : "홀수";
		s = (n & 1) == 1 ? "홀수" : "짝수";
		
		// 컴퓨터에서는 위의 식보단 아래식이 조금 더 빨리 계산됌.		
		// 2진수에서 맨 마지막 자리 1이면 홀수
		
		System.out.println(n + "->" + s);
		
		sc.close();
	}

}
