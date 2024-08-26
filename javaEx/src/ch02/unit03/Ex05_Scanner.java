package ch02.unit03;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {
		
		//데이터를 입력 받을 수 있는 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		String name;	// 문자열 변수
		int age;		// 정수형 변수
		char g;			// 문자 변수
		double h;		// 실수형 변수
		
		//문자열 입력: 공백이 구분 기호로 공백은 입력 불가능
		System.out.print("이름 ? ");
		name = sc.next(); //문자열 받을꺼야
		
		// 정수 입력
		System.out.print("나이 ? ");
		age = sc.nextInt(); //정수 받을꺼야
		
		//문자 입력: 문자 입력은 불가능하여 문자열을 입력 받아 첫글자만 가져옴
		System.out.print("성별(남:M, 여:F) ? ");
		g = sc.next().charAt(0); //문자열 받을껀데.첫번째 글자만 받을꺼야
		
		// 실수 입력
		System.out.print("키 ? ");
		h = sc.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + g);
		System.out.println("키 : " + h);
		
		sc.close(); //모든 리소스는 사용 후 닫아야 한다.
	}

}
