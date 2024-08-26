package ch07.unit04;

/*
	
	String
	: 문자열을 나타내는 클래스
	: 문자열은 상수풀(String Constant Pool)에 저장
	: 내용 불변(Immutable)
	  Integer, Long, Double 등 Wrapper 클래스도 내용 불변
	: final 클래스
	  하위 클래스를 가질 수 없음
	
*/
public class Ex01 {

	public static void main(String[] args) {

		// 상수풀에 동일한 문자열이 존재하면 해당 문자열의 주소를 반환
		String s1 = "seoul"; // 메모리 할당
		String s2 = "seoul"; // 메모리 할당 x. s1이랑 같은 주소로 잡힘.
		
		// 새로운 객체를 생성하여 문자열을 설정
		String s3 = new String("seoul"); // 메모리 공간 하나 만듦.
		
		System.out.println(s1 == s2); // true: 주소비교, 동일한 객체
		System.out.println(s1 == s3); // false: 주소비교, 상이한 객체
		//객체에서는 == 는 주소를 비교하는 것이지 값을 비교하는 것이 아님.
		
		// 동일한 객체는 해쉬코드가 같지만 해쉬코드가 같다고 같은 객체는 아니다.
		System.out.println("s1: " + s1.hashCode());
		System.out.println("s2: " + s2.hashCode());
		System.out.println("s3: " + s3.hashCode());
		
		// 문자열은 불변이다.
		// 문자열이 변경되면 기존의 문자열을 변경하는 것이 아니라 새로운 메모리를 할당 받는다.
		s1 += "korea";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2); // false
		
		String s4 = ""; // 길이가 0인 문자열. 메모리 할당은 받음. 값만 없는 상태.
		System.out.println(s4.length()); // length() : 문자열의 길이
		//문자는 길이가 0인 문자는 없다. 런타임 오류 나옴
		//문자열은 길이가 0인 문자열은 있다.
		
		String s5 = null;// 메모리 할당 받지 못함.
		//System.out.println(s5.length()); // 런타임 오류
		
	}

}
