package ch06.unit02;

public class Ex02 {

	public static void main(String[] args) {
		
		// 객체 선언과 메모리 할당
		Test2 t = new Test2();
		
		//System.out.println(t.a); //컴파일 오류. private 이라 class 내에서만 접근 가능.
		System.out.println(t.b); // 결과 값 = 20
		System.out.println(t.c); // 결과 값 = 30
		System.out.println(t.d); // 결과 값 = 40

	}

}

class Test2 {
	
	// 필드 접근 제어자
	// private < default < protected < public
	
	private int a = 10;		// private : class 내에서만 접근 가능 (정보의 은닉)
	int b = 20;				// default : 하위class 및 다른 class 모두 동일한 패키지에서만 접근 가능 
	protected int c = 30;	// protected : 하위class는 어디에서나 접근 가능. 다른 class는 동일 패키지에서만 접근 가능
	public int d = 40;		// public : 어디에서나 접근 가능
	
	public void write() {
		System.out.println(a + " : " + b + " : " + c + " : " +  d);
	}
	
}
