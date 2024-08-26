package ch07.unit04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		// 정수를 입력 받아 몇자리 정수인지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.print("숫자 ? ");
		n = sc.nextInt();
		
		s = n > 0 ? Integer.toString(n) : Integer.toString(-n);
		
		System.out.println(n + "의 길이는 " + s.length() + "자리 정수");
		
		sc.close();
		
	}

}
