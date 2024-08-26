package ch04.unit02;

import java.util.Scanner;

public class Ex09_switch {

	public static void main(String[] args) {

		//점수 입력 받아 평점 계산
		//90~100: 4.0, 80~89: 3.0, 70~79: 2.0, 60~69: 1.0
		//0~59: 0.0, 나머지 입력 에러
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.print("점수 ? ");
		score = sc.nextInt();
		
		var a = switch(score/10) {
		case 10,9 -> 4.0;
		case 8 -> 3.0;
		case 7 -> 2.0;
		case 6 -> 1.0;
		case 5,4,3,2,1,0 -> 0.0;
		default -> "입력 오류";
		};

		System.out.println(score + " -> " + a);
		
		sc.close();

	}

}
