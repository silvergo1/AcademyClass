package ch04.unit01;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y;
		
		System.out.print("연도 ? ");
		y = sc.nextInt();
		
		if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
			System.out.println(y + ": 윤년");
		}else {
			System.out.println(y + ": 평년");
		}
	
		sc.close();

	}

}
