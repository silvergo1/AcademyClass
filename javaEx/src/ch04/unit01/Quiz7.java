package ch04.unit01;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		String name, result;
		
		System.out.print("이름 ? ");
		name = sc.next();
		
		System.out.print("세과목 점수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if((a + b + c)/3 >= 60) {
			if (a >= 40 && b >= 40 && c >= 40 ) {
				result = "합격";
			}else {
				result = "과락";
			}
		}else {
			result = "불합격";
		}
		
		System.out.printf("%s님은 %s입니다", name, result);
		
		sc.close();

	}

}
