package ch02.unit03;

import java.util.Scanner;

public class Ex06_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String birth;
		String tel;
		
		System.out.print("이름 ? ");
		name = sc.nextLine(); //중간에 공백 입력 가능
		
		System.out.print("나이 ? ");
		age = sc.nextInt();
		sc.nextLine(); //나이에서 읽지 않은 엔터를 읽어서 버림
		
		System.out.print("생년월일 ? ");
		birth = sc.nextLine();
		
		System.out.print("전화번호 ? ");
		tel = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("생년월일 : " + birth);
		System.out.println("전화번호 : " + tel);
		
		sc.close();

	}

}
