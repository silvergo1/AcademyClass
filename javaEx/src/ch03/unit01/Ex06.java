package ch03.unit01;

public class Ex06 {

	public static void main(String[] args) {
		
		String s;
		
		s = "korea" + 9 + 3;
		System.out.println(s); // 결과 값 = korea93
		
		s = 9 + 3 + "korea";
		System.out.println(s); // 결과 값 = 12korea

		s = '9' + 3 + "korea"; // '9' ASCII 코드 값 = 57
		System.out.println(s); // 결과 값 = 60korea
		
	}

}
