package ch04.unit03.whileExMe;

import java.util.Scanner;

public class Exx11 {
	// 단(정수)을 입력 받아 입력 받은 단에 대한 구구단을 출력하는 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0,dan;
		
		System.out.print("단 ? ");
		dan = sc.nextInt();
		
		while(n<9) {
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, dan*n);
			
		}
		
		sc.close();
		
	}

}
