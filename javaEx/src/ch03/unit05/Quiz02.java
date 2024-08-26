package ch03.unit05;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		 	연도를 입력 받아 윤년인지 평년인지 출력하기
		 	연도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년이며
		 	그렇지 않으면 평년
		 	
		 	연도 ? 2024
		 	2024년은 윤년입니다.
		*/

		Scanner sc = new Scanner(System.in);
		
		int y;
		String result;
		
		System.out.print("연도 ? ");
		y = sc.nextInt();
		
		result = y%4 == 0 && y%100 != 0 || y%400 == 0 ? "윤년" : "평년";
		
		System.out.printf("%d년은 %s입니다.", y, result);
		
		sc.close();
		
	}

}
