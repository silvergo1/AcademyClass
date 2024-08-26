package ch02.unit04;

public class Ex03_DataType {

	public static void main(String[] args) {
		
		short a = 350; // 350 16진수 = 0000 0001 0101 1110
		short b = -350;
		System.out.printf("%X %X\n", a, b); 	// 결과 값 = 15E FEA2
		System.out.printf("%04X %04X\n", a, b); // 결과 값 = 015E FEA2

		//byte b1 = 100; // 가능
		//byte b1 = 129; // 불가능
		byte b1 = (byte)129;
		byte b2 = (byte)385;
		System.out.println(b1 + "," + b2); // 결과 값 = -127, -127
		System.out.println(b1 == b2);	// 결과 값 = true 
										// == : 두 값이 같으면 true
		
		
		
	}

}
