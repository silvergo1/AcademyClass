package ch02.unit03;

public class Ex03_printf {

	public static void main(String[] args) {
		
		int a, b, c; // 정수형 변수 선언
		a = 13;
		b = 4;
		
		c = a + b;
		
		System.out.println(c);
		System.out.println(a + " + " + b + " = " + c);
		
		System.out.printf("%d + %d = %d\n", a, b, c); // %d: 변환 문자, 정수를 출력
		System.out.format("%d + %d = %d\n", a, b, c);
		
		System.out.println();
		
		System.out.printf("%d + %d = %d\t", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\t", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d%n", a, b, a % b);

	}

}
