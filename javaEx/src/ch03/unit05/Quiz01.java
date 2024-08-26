package ch03.unit05;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 	- 한 문자를 입력 받아 입력 받은 문가사 소문자이면 대문자로 변환하고
		 	대문자로 변환하여 출력
		 	단, 입력 받은 문자가 영문자가 아니면 그대로 출력
		 	
		 	문자 ? a
		 	a -> A
		*/
		
		Scanner sc = new Scanner(System.in);
		
		char c, result;
		
		System.out.print("문자 ? ");
		c = sc.next().charAt(0);
		
		result =  c >= 'A' && c <= 'Z' ? (char)(c+32) : (c >= 'a' && c <= 'z' ? (char)(c-32) : c);
		
		System.out.println(result);
		
		
		sc.close();

	}

}
