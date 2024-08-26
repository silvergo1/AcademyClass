package ch04.unit03.whileEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum, s, s2, s3, n;
		
		s = s2 = s3 =0;
		n = 0;
		
		System.out.print("수 ? ");
		inputNum = sc.nextInt();
		
		while(n < inputNum) {
			n++;
			s += n;
			
			if(n%2 ==0) {
				s2 += n;
			} else {
				s3 += n;
			}
		}
		
		System.out.println(s+","+s2+","+s3);
		sc.close();

	}

}
