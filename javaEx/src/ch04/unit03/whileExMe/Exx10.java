package ch04.unit03.whileExMe;

import java.util.Scanner;

public class Exx10 {
	// 정수를 입력받아 1부터 입력받은 수까지의 홀수의 합을 구하는 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=1, s=0, inputNum;
		
		System.out.print("점수 ? ");
		inputNum = sc.nextInt();
		
		while(n < inputNum) {
			s+=n;
			n+=2;
		}
		System.out.println("결과 : " + s);
		
		sc.close();
		
	}

}
