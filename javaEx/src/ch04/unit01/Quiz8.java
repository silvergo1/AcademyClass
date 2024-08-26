package ch04.unit01;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b, c, d, e, grade;
		String a, name, result;
		
		System.out.print("학번 ? ");
		a = sc.next();
		
		System.out.print("이름 ? ");
		name = sc.next();
		
		System.out.print("중간고사 점수 ? ");
		b = sc.nextInt();
		b = (int)(b*0.4);
		
		System.out.print("기말고사 점수 ? ");
		c = sc.nextInt();
		c = (int)(c*0.4);
		
		System.out.print("결석 횟수 ? ");
		d = sc.nextInt();
		
		int s;
		
		if(d <= 1) {s = 100;}
		else if (d == 2 || d == 3) {s = 80;}
		else if (d == 4 || d == 5) {s = 60;}
		else {s = 0;}
		
		s = (int)(s*0.1);
		
		System.out.print("레포트 점수 ? ");
		e = sc.nextInt();
		e = (int)(e*0.1);
		
		grade = b+c+s+e;
		
		if(grade >= 90) {result = "A";}
		else if(grade >= 80) {result = "B";}
		else if(grade >= 70) {result = "C";}
		else if(grade >= 60) {result = "D";}
		else {result = "F";}
		
		System.out.printf("학번 \t 이름 \t 중간고사 \t 기말고사 \t 출석점수 \t 레포트 \t 합산점수 \t 학점 \n");
		System.out.printf("%s \t %s \t %d \t %d \t %d \t %d \t %s \t %s \n", a, name, b, c, s, e, grade, result);
		
		
		sc.close();

	}

}
