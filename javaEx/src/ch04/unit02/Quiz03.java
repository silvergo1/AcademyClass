package ch04.unit02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int y, m;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		System.out.print("월 ? ");
		m = sc.nextInt();
		
		switch(m) {
			case 1:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 2:
				if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
					System.out.printf("%d년 %d월은 29일까지 있습니다.", y, m);
				}else {
					System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m);
				} break;
			case 3:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 4:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 5:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 6:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 7:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 8:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 9:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 10:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 11:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			case 12:System.out.printf("%d년 %d월은 30(31)일까지 있습니다.", y, m); break;
			default: System.out.println("입력 오류");
		}
		
		sc.close();

	}

}
