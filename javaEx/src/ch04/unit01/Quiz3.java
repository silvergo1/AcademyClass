package ch04.unit01;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch, result;
		
		System.out.print("문자 ? ");
		ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z'){
			result = (char)(ch + 32);
		}else if(ch >= 'a' && ch <= 'z') {
			result = (char)(ch - 32);
		}else {
			result = ch;
		}
		
		System.out.println(ch + "=>" + result);
		
		sc.close();

	}

}
