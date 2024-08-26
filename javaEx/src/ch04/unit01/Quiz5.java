package ch04.unit01;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pay, hour, rate = 10000;
		
		System.out.print("근무시간 ? ");
		hour = sc.nextInt();
		
		if(hour > 8) {
			pay = 8 * rate + (int)((hour-8)*rate*1.5);
		}else {
			pay = hour * rate;
		}
		
		System.out.printf("급여 : %,d원\n", pay);
		
		sc.close();

	}

}
