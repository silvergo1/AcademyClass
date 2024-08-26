package ch03.unit01;

public class Ex03 {

	public static void main(String[] args) {
		
		int a = 3, b =2;
		double c;
		
		c = a/b + a/b; // 1 + 1
		System.out.println(c); // 결과 값 = 2.0
		
		c = (double)a/b + a/b; // 1.5 + 1
		System.out.println(c); // 결과 값 = 2.5
		
		c = (double)(a/b + a/b); // 1 + 1
		System.out.println(c); // 결과 값 = 2.0
		
		c = (double)a/b + (double)a/b; // 1.5 + 1.5
		System.out.println(c); // 결과 값 = 3.0
		
		c = 3.7 % 1.3; // 1.1
		System.out.println(c); // 결과 값 = 1.1
		
		c = 'A' + 10; // 65 + 10
		System.out.println(c); // 결과 값 = 75.0

	}

}
