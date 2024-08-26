package ch02.unit04;

public class Ex07_Escape {

	public static void main(String[] args) {
		
		// 확장열
		
		System.out.println("a\tb\tc");	// 결과 값 = a b c
		System.out.println("x\ny");		// 결과 값 = x enter y
		System.out.println("1\\2");		// 결과 값 = 1/2
		System.out.println("\"국어\"");	// 결과 값 = "국어"
		System.out.println("\u0045");	// 결과 값 = E

	}

}
