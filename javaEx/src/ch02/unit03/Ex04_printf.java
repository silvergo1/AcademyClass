package ch02.unit03;

public class Ex04_printf {

	public static void main(String[] args) {
		
		System.out.println("123456789012345678901234567890");
		
		//%d 정수
		System.out.printf("%10d\n", 123);
		System.out.printf("%010d\n", 123);
		System.out.printf("%-10d*", 123);
		System.out.printf("%-10d*\n", 456);
		System.out.printf("%d\n", 123456);
		System.out.printf("%,d\n", 123456); // 세자리 마다 콤마
		
		System.out.println();
		System.out.printf("%d\n", 123);		// 123
		System.out.printf("%d\n", -123);	// -123
		System.out.printf("%+d\n", 123);	// +123
		System.out.printf("%+d\n", -123);	// -123
		System.out.printf("%(d\n", 123);	// 123
		System.out.printf("%(d\n", -123);	// (123)
		
		//%c 문자
		System.out.printf("%c\n", 'a');	// a
		System.out.printf("%c\n", 'A');	// A
		System.out.printf("%C\n", 'a');	// A, 소문자일경우 대문자로
		System.out.printf("%C\n", 'a');	// A
		System.out.printf("%C\n", 65);	// A, 아스키코드 65 = A
		System.out.printf("%C\n", 97);	// A, 아스키코드 97 = a
		//System.out.printf("%d\n", 'A');	// 런타임 오류. %d는 문자열 출력 불가
		System.out.println();
		
		//%f 실수
		System.out.printf("%f\n", 123.236);		// 123.236000
		System.out.printf("%8.2f\n", 123.236);	// 123.24
		System.out.printf("%8.2f\n", 123.234);	// 123.23
		System.out.printf("%.2f\n", 123.236);	// 123.24
		System.out.printf("%4.2f\n", 123.236);	// 123.24
		System.out.printf("%5.0f\n", 15.3);		// 15
		System.out.printf("%5.0f\n", 15.7);		// 16
		System.out.println();
		
		//%e 지수형식, n.nnnnnne+nn
		System.out.printf("%e\n", 12345.0e-3);	//1.234500e+01
		// 12345.0e-3 => 1.2345 * 10^-3 => 1.2345 * 10^1
		
		System.out.printf("%10.3e\n", 123.456);	//1.235e+02
		// 123.456 => 1.23456 * 10^2
		System.out.println();
		
		// %x, %X : 16진수로 출력 (0~9, A, B, C, D, E, F)
		System.out.printf("%x\n", 65);	// 41
		System.out.printf("%x\n", 27);	// 1b
		System.out.printf("%X\n", 27);	// 1B
		
		int a = 27;		// 10진수
		int b = 0x1b;	// 16진수 (0x 붙으면 16진수)
		
		System.out.printf("%d %d\n", a, b); // 27 27
		
		System.out.printf("%#x\n", 27);	// 0x1b
		System.out.println();
		
		String s = "Korea seoul";
		System.out.printf("%s\n", s); // 그대로 출력 Korea seoul
		System.out.printf("%S\n", s); // 모두 대문자로 KOREA SEOUL
		System.out.printf("%.5s\n", s); // Korea
		System.out.println();
		
		System.out.printf("%c %c %c %c %c\n", 'a', 'b', 'a', 'b', 'b');	// a b a b b
		System.out.printf("%1$c %2$c %1$c %2$c %2$c\n", 'a', 'b');		// a b a b b
		

	}

}
