package ch04.unit02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		String op;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자[+, -. *, /] ? ");
		op = sc.next();
		
		String s;
		switch(op) {
		case "+": s = a + "+" + b + "=" + (a+b); break;
		case "-": s = a + "-" + b + "=" + (a-b); break;
		case "*": s = a + "*" + b + "=" + (a*b); break;
		case "/": s = a + "/" + b + "=" + (a/b); break;
		default: s="연산자 입력 오류";
		}
		System.out.println(s);
		sc.close();

	}

}
