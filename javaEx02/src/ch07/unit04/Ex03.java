package ch07.unit04;

public class Ex03 {

	public static void main(String[] args) {
		
		// String 클래스의 주요 메소드
		String s1 = "seoul korea";
		String s2;
		int n;
		
		// 문자열의 길이
		n = s1.length();
		System.out.println(n); // 결과 값 = 11
		
		// substring(s, e) : s 인덱스에서 e-1 인덱스 까지의 문자열
		// 인덱스는 0 부터 시작
		s2 = s1.substring(6,9);
		System.out.println("특정 위치의 문자열 : " + s2); // 결과 값 = 특정 위치의 문자열 : kor
		
		//s2 = s1.substring(s) : s 인덱스에서 마지막 문자열까지
		s2 = s1.substring(6); // index(6)에서 마지막 문자열까지
		System.out.println(s2);
		
		s2 = s1.toUpperCase();
		System.out.println("대문자로 변환 : " + s2);
		
		//s2 = s1.substring(6, 7) //문자열
		char c = s2.charAt(6);
		System.out.println("한문자 : " + c);
		
		// 문자열 비교
		System.out.println(s1.equals("seoul korea")); // 결과 값 = true
		System.out.println(s1.equals("Seoul Korea")); // 결과 값 = false
		// equals() 는 대소문자를 구분.
		
		System.out.println(s1.equalsIgnoreCase("Seoul Korea")); // 결과 값 = true
		// equalsIgnoreCase() 는 대소문자를 구분하지 않음.
		
		System.out.println(s1.equals("seoul")); // 결과 값 = false
		// ~로 시작하는 문자열인지
		System.out.println(s1.startsWith("seoul")); // 결과 값 = true
		// ~로 끝나는 문자열인지
		System.out.println(s1.endsWith("korea")); // 결과 값 = true
		
		// 문자열은 >,< 등으로 크기를 비교할 수 없다.
		// compareTo() : 문자열을 사전식으로 비교하여 ASCII 차이를 반환
		System.out.println(s1.compareTo("seoul corea")); // 8('k' - 'c')
		System.out.println("Java Spring".compareTo("Java Oracle")); // 4('S' - 'O')
		
	}

}
