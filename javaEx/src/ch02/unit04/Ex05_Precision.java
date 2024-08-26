package ch02.unit04;

public class Ex05_Precision {

	public static void main(String[] args) {
		
		// 정밀도
		
		int a = 2_000_000_000;
		int b = 2_000_000_050;
		
		float c = 2_000_000_000;
		float d = 2_000_000_050;
		
		double e = 2_000_000_000;
		double f = 2_000_000_050;
		
		System.out.printf("int : %d %d\n", a, b);		// 결과 값 = 2000000000 2000000050
		System.out.printf("float : %.2f %.2f\n", c, d);	// 결과 값 = 2000000000.00 2000000000.00
		System.out.printf("double : %.2f %.2f\n", e, f);// 결과 값 = 2000000000.00 2000000000.00
		
		System.out.println(a == b);	// 결과 값 = false
		System.out.println(c == d);	// 결과 값 = true
		System.out.println(e == f);	// 결과 값 = false

	}

}
