package ch04.unit03.whileExMe;

import java.util.Scanner;

public class AppliedQ04 {
	// 개수를 입력 받아 0부터 입력 받은 개수만큼의 피보나치수열을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=0, b=1, c, n=0, s=0, inputNum;
		
		System.out.print("개수 ? ");
		inputNum= sc.nextInt();
		
		while(n<inputNum) {
			System.out.print(a + "\t");
			s+=a;
			c=a+b;
			a=b;
			b=c;
			
			n++;
		}
		
		sc.close();
		
	}

}