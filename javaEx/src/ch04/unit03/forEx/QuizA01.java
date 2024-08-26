package ch04.unit03.forEx;

import java.util.Scanner;

public class QuizA01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, diff, min=0, result=0;
		
		System.out.print("5개 정수를 입력\n");
		
		for(int i=0; i<5; i++) {
			n = sc.nextInt();
			
			diff = n > 7 ? n-7 : 7-n;
			
			if(i==0||min>diff) {
				min = diff;
				result = n;
			}
		}
		System.out.println("7에 가장 가까운 수: " + result);
		sc.close();
		
	}
}
