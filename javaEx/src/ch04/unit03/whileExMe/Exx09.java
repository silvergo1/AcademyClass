package ch04.unit03.whileExMe;

import java.util.Scanner;

public class Exx09 {
	// 정수를 입력 받아 1부터 입력 받은 수까지의 합을 구하는 프로그램
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n=0, s=0, inputNum;
		
		System.out.print("점수 ? ");
		inputNum = sc.nextInt();
		
		while(n < inputNum) {
			n++;
			s+=n;
		}
		System.out.println("결과 : " + s);
		
		sc.close();

	}

}
