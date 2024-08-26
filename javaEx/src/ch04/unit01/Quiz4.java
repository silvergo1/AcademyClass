package ch04.unit01;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		double grade;
		
		System.out.print("점수 ? ");
		score = sc.nextInt();
		
		if (score >=0 && score <= 100) {
			if(score >= 95 ) {grade = 4.5;}
			else if(score >= 90) {grade = 4.0;}
			else if(score > 85) {grade = 3.0;}
			else if(score >= 80) {grade = 3.5;}
			else if(score >= 75) {grade = 2.5;}
			else if(score >= 70) {grade = 2.0;}
			else if(score >= 65) {grade = 1.5;}
			else if(score >= 60) {grade = 1.0;}
			else {grade = 0.0;}
			System.out.printf("점수 : %d, 평점 : %.1f\n", score, grade);
		}else {
			System.out.printf("점수 입력 오류입니다.");
		}
		
		sc.close();

	}

}
