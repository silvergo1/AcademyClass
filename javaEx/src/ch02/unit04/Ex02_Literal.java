package ch02.unit04;

public class Ex02_Literal {

	public static void main(String[] args) {
		
		int a = 0b1100; // 2진수, 12
		//a = 0b1201; // 컴파일 오류. 2진수에는 2가 없음
		
		System.out.println(a); //결과 값 = 12
		
		a = 01100; // 가장 앞에 0이 있으면 8진수
		System.out.println(a); // 결과 값 = 576
		
		a = 1100; // 10진수
		System.out.println(a); // 결과 값 = 1100
		
		a = 0x1100; // 16진수
		System.out.println(a); // 결과 값 = 4352
		
		a = 0xA0;
		System.out.println(a); // 결과 값 = 160
		
		//a = 0xG0; // 컴파일 오류. 16진수에는 G가 없음.
		
		a = 3_320;
		System.out.println(a); // 결과 값 = 3320
		
		long b;
		b = 120L;
		System.out.println(b); // 결과 값 = 120
		
		//a = b; //컴파일 오류. 큰 자료형을 작은 자료형에 대입 불가

	}

}
