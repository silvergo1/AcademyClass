package ch07.unit04;

public class Ex05 {

	public static void main(String[] args) {
		
		String s1 = "seoul korea";
		String s2;
		int n;
		
		// indexOf()
		// : 문자열에서 특정 문자 또는 특정 문자열의 인덱스를 반환. 없으면 -1 반환
		// : 처음은 0을 반환
		n = s1.indexOf("kor");
		System.out.println("kor 인덱스 : " + n); // 결과 값 = kor 인덱스 : 6
		
		n = s1.indexOf("KOR");
		System.out.println("KOR 인덱스 : " + n); // 결과 값 = KOR 인덱스 : -1
		
		n = s1.indexOf("o");
		System.out.println("o 인덱스 : " + n); // 결과 값 = o 인덱스 : 2
		
		n = s1.lastIndexOf("o");
		System.out.println("o 인덱스 : " + n); // 결과 값 = o 인덱스 : 7
		
		s1 = "우리나라 대한민국 대한 독립만세";
		
		// 정규식 사용 불가
		s2 = s1.replace("대한", "大韓"); // 결과 값 = 우리나라 大韓민국 大韓 독립만세
		System.out.println(s2);

		// 정규식 사용 가능
		s2 = s1.replaceAll("대한", "大韓"); // 결과 값 = 우리나라 大韓민국 大韓 독립만세
		System.out.println(s2);
		
		s1 = "우리 123 나라 456 대한";
		
		// 숫자 : \\d
		// 공백(공백, 탭, 엔터): \\s
		// | : 또는
		
		s2 = s1.replaceAll("\\d|\\s", ""); // 숫자와 공백 제거
		System.out.println(s2); //결과 값 = 우리나라대한
		
		s2 = s1.replaceAll("[0-9]", ""); // 숫자 제거
		System.out.println(s2); //결과 값 = 우리  나라  대한
		
		// [^] : 부정
		s2 = s1.replaceAll("[^0-9]", ""); // 숫자 빼고 모두 제거
		System.out.println(s2); //결과 값 = 123456
		
		s1 = "우리 12나라 ab대한XY민국";
		s2 = s1.replaceAll("[a-zA-Z]", ""); // 영문자 제거
		System.out.println(s2); //결과 값 = 우리 12나라 대한민국
		
		s2 = s1.replaceAll("[a-zA-Z0-9]", ""); // 영문자, 숫자 제거
		//s2 = s1.replaceAll("\\w", ""); // 영문자, 숫자 제거
		System.out.println(s2); //결과 값 = 우리 나라 대한민국
		
	}

}
