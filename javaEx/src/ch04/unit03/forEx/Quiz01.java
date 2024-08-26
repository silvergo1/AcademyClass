package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int s=0, inputNum;

		do {
			System.out.print("정수 ? ");
			inputNum = sc.nextInt();
		}while(inputNum<1||inputNum>1000);
		
		for (int i=1; i<=inputNum; i++) {
			s+=i;
		}
		System.out.printf("%d ~ %d까지의 합 : %d", 1, inputNum, s);
		
		sc.close();
		
	}
}
