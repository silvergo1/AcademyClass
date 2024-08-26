package ch03.unit02;

public class Ex03 {

	public static void main(String[] args) {
		
		int a;
		boolean b1, b2;
		
		a = 10;
		b1 = false;
		
		b2 = a > 20 && (b1 = true); // 단축 연산
		System.out.println(b1 + "," + b2); // 결과 값 = false, false
		
		b1 = false;
		b2 = a < 20 && (b1 = true);
		System.out.println(b1 + "," + b2); // 결과 값 = true, true
		
		b1 = false;
		b2 = a > 20 || (b1 = true);
		System.out.println(b1 + "," + b2); // 결과 값 = true, true
		
		b1 = false;
		b2 = a < 20 || (b1 = true); // 단축 연산
		System.out.println(b1 + "," + b2); // 결과 값 = false, true
	}

}
