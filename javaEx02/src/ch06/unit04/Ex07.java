package ch06.unit04;

public class Ex07 {

	public static void main(String[] args) {

		Test7 t = new Test7();
		t.set(100);
		t.print(); // 결과 값 = a : 100
		
		Test7.sub(20);
		System.out.println(Test7.b); // 결과 값 = 30
		
	}

}

class Test7 {
	
	private int a;
	static int b = 10;
	
	public void set(int a) {
		this.a = a;
	}
	
	public void print() {
		//System.out.println("a : " + this.a); // this 생략 가능
		System.out.println("a : " + a);
	}
	
	public static void sub(int b) {
		//b= b+10; // 매개변수 증가
		
		//this.b = b+10; // 컴파일 오류. 클래스메소드는 this 사용 불가
		
		//클래스 안에서 this와 똑같은 기능을 할 수 있는 코드
		Test7.b = Test7.b+b;
	}
	
}
