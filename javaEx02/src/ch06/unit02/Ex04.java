package ch06.unit02;

public class Ex04 {

	public static void main(String[] args) {
		
		// class 변수 접근 : class명.class변수
		System.out.println(Test4.c); // 결과 값 = 20
		// System.out.println(Test4.a); // 컴파일 오류. 메모리 할당 하지 않음.
		
		// 인스턴스변수 : new를 이용하여 객체가 생성된 이휴에 접근 가능
		// 접근 방법 : 객체명.인스턴스변수
		
		Test4 t = new Test4();
		System.out.println(t.a); // 결과 값 = 0
		t.print(); // 결과 값 = 0 : 10 : 20

	}

}

class Test4 {
	
	// 필드 - 인스턴스 변수 : 객체를 생성해야 접근할 수 있는 변수(즉, new 선언을 해야함)
	int a;
	private int b = 10;
	
	// 필드 - class 변수 : 객체 생성과 상관없이 접근할 수 있는 변수
	// class가 메모리에 로딩되는 순간 단 한번 메모리 할당
	// class가 메모리에서 사라질때 메모리가 해제
	public static int c = 20;
	
	// 인스턴스 메소드 - 객체를 생성해야 접근할 수 있는 메소드(즉, new 선언을 해야함)
	public void print() {
		System.out.println(a + " : " + b + " : " + c);
	}
	
}
