package ch02.unit04;

public class Ex06_DataType {

	public static void main(String[] args) {
		
		// char : 2byte, 부호없는 정수
		
		char c;
		
		c = 'A';
		System.out.println(c); // 결과 값 = A
		
		c = '\u0041';
		System.out.println(c); // 결과 값 = A
		
		c = '\101';
		System.out.println(c); // 결과 값 = A
		
		int a;
		a = c;
		System.out.println(a); // 결과 값 = 65, 'A' 의 코드 값: 65
		
		c = '대';
		a = c;
		System.out.println(a); // 결과 값 = 45824, '대'의 유니코드 값
		
		double x = 'k';
		System.out.println(x); // 결과 값 = 107.0

	}

}
