package ch03.unit03;

public class Ex01 {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 10; //0000 1010
		b = ~a; //1111 0101
		System.out.println(b); //결과 값 = ~11;
		
		a = -9;
		b = ~a;
		System.out.println(b); //결과 값 = 8;
		
		a = 13; //0000 1101
		b = 7; //0000 0111
		System.out.println((a & b)); //0101 결과 값 = 5;
		System.out.println((a | b)); //1111 결과 값 = 15;
		System.out.println((a ^ b)); //1010 결과 값 = 10;

	}

}
