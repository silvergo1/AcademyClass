package ch03.unit01;

public class Ex10 {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 10; 
		b = a++ + a++ + 1; // 10 + 11 + 1
		System.out.println(a + "," + b); // 결과 값 = 12, 22
		
		a = 10; 
		b = ++a + ++a + 1; // 11 + 12 + 1
		System.out.println(a + "," + b); // 결과 값 = 12, 24
		
		a = 10; 
		b = a++ + ++a + a++ + a++; // 10 + 12 + 12 + 13
		System.out.println(a + "," + b); // 결과 값 = 14, 47
		
		a = 0;
		b = a---a; // 0 - (-1)
		System.out.println(a + "," + b); //결과 값 = -1, 1
		
		char c = 'A';
		System.out.println((c++) + "," + (++c)); // 결과 값 = A, C 

	}

}
