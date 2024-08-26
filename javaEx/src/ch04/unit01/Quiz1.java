package ch04.unit01;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("첫번째 수 ? ");
		a = sc.nextInt();
		
		System.out.print("두번째 수 ? ");
		b = sc.nextInt();
		
		c = a - b;
		if(c < 0) {
			c = -c;
		}
		System.out.printf("두 수의 차이 : %d", c);
		
		sc.close();

	}

}
