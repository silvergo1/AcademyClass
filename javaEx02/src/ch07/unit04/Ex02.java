package ch07.unit04;

public class Ex02 {

	public static void main(String[] args) {
		
		// 문자열 비교
		String s1 = "seoul";
		String s2 = new String("seoul");
		
		// 객체의 == 는 주소를 비교
		// 객체는 == 으로 비교할 일이 절대 없다.
		System.out.println(s1 == "seoul"); // 결과 값 = true
		System.out.println(s2 == "seoul"); // 결과 값 = false
		System.out.println(s1 == s2); // 결과 값 = false
		
		// 주소가 아닌 문자열을 비교
		// String의 equlas()
		// : Object의 equlas()를 재정의한 메소드
		// : 문자열을 비교한다.		
		System.out.println(s1.equals("seoul")); // 결과 값 = true
		System.out.println(s2.equals("seoul")); // 결과 값 = true
		System.out.println(s1.equals(s2)); // 결과 값 = true
		
	}

}
