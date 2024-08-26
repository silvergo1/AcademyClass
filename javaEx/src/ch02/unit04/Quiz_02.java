package ch02.unit04;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		
		// 한 문자를 입력 받아 입력 받은 ASCII 코드 출력
		// 문자 ? A A -> 65
		
		Scanner sc = new Scanner(System.in);
		
		char c;
		
		System.out.println("한 문자 ? ");
		c = sc.next().charAt(0);
		
		int n = c;
		System.out.printf("%c -> %d\n", c, n);
		// 정수는 %c로 출력 불가
		
		sc.close();

	}

}
