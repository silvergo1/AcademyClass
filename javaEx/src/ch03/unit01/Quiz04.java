package ch03.unit01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 금액을 입력 받아, 입력 받은 금액을 50000원 권에서 1원까지의 화폐 매수로 계산하는 프로그램을 연산자를 이용하여 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("금액 ? ");
		n = sc.nextInt();
		
		
		System.out.println("오만원권:" + (n/50000));
		System.out.println("만원권:" + ((n%50000)/10000));
		System.out.println("오천원권:" + ((n%10000)/5000));
		System.out.println("천원권:" + ((n%5000)/1000));
		System.out.println("오백원권:" + ((n%1000)/500));
		System.out.println("백원권:" + ((n%500)/100));
		System.out.println("오십원권:" + ((n%100)/50));
		System.out.println("십원권:" + ((n%50)/10));
		System.out.println("오원권:" + ((n%10)/5));
		System.out.println("일원권:" + n%5);
		
		sc.close();
		
	}

}
