package ch07.unit03;

public class Ex02 {

	public static void main(String[] args) {
		
		Integer obj1 = 10;
		Integer obj2 = null;
		int n;
		
		//n = obj1 + obj2; //런타임 오류
		
		obj2 = 20;
		n = obj1 + obj2;
		System.out.println(n); // 결과 값 = 30
		
		String s1, s2;
		int a, b;
		
		s1 = "123";
		s2 = "456";
		System.out.println(s1 + s2); // 결과 값 = 123456. 문자열 결합
		
		// 문자열을 정수로 변환
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		n = a + b;
		System.out.println(n); // 결과 값 = 579
		
		//a = Integer.parseInt("1,234"); // 런타임오류(NumberFormatException)
		//a = Integer.parseInt("123.4"); // 런타임오류(NumberFormatException)		
		//a = Integer.parseInt("b1"); // 런타임오류(NumberFormatException)
		
		a = Integer.parseInt("b1", 16); // 16진수로 변환
		System.out.println(a); // 결과 값 = 177
		
		a = Integer.parseInt("1011");
		System.out.println(a); // 결과 값 = 1011
		
		a = Integer.parseInt("1011", 2); // 2진수로 변환
		System.out.println(a); // 결과 값 = 11
		
		a = 123;
		s1 = Integer.toString(a); //정수를 String으로 변환
		System.out.println(s1); // 결과 값 = 123
		
		a = 123;
		s1 = Integer.toBinaryString(a); //정수를 2진수 String으로 변환
		System.out.println(s1); // 결과 값 = 1111011
		
		a = 123;
		s1 = Integer.toHexString(a); //정수를 16진수 String으로 변환
		System.out.println(s1); // 결과 값 = 7b
		
	}

}
