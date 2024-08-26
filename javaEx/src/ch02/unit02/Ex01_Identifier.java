package ch02.unit02;

/*

	- 이클립스
	실행: <ctrl> + <F11>
	syso: <ctrl> + <space> ==> System.out.println();
	줄 바꿈: <alt> + 방향키
	줄 복사: <ctrl> + <alt> + 방향키
 	
 */

public class Ex01_Identifier {

	public static void main(String[] args) {
		
		//식별자
		String name = "김자바";
		//String #subject = "자바"; //컴파일 오류. #은 식별자로 사용 불가
		//String int; //컴파일 오류. 예약어는 식별자로 사용 불가
		String 주소 = "서울";
		String _tel = "010-1111-2222";
		
		int $age = 20;
		//int ~age = 10; //컴파일 오류. ~는 사용 불가
		int a = 10;
		//String a = "자바"; //컴파일 오류. 동일한 이름으로 다시 선언 불가
		
		System.out.println("이름: " + name);
		System.out.println("주소: " + 주소);
		System.out.println("전화: " + _tel);
		System.out.println("나이: " + $age);
		System.out.println("a: " + a);

	}

}
