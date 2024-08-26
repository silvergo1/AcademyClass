package ch03.unit05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		//정수를 입력받아 양수, 영, 음수 인지 판별
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		String s;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		s = a > 0 ? "양수" : (a==0 ? "영" : "음수");
		System.out.printf("%d : %s\n", a, s);
		
		sc.close();

	}

}
