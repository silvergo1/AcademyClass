package ch06.unit04;

public class Ex10 {

	public static void main(String[] args) {

		Test10 t = new Test10();
		t.disp();
		
	}

}

class Test10 {
	
	public static int a = 10;
	
	// final 변수 : 한번만 초기화 되며 값을 변경할 수 업음
	// final 변수 특징
	// - 무조건 대문자로 만들어야함.
	// - static 변수로 만듦. 인스턴스변수로 만드는건 극히 드뭄.
	// - 무조건 초기값을 주어야함. 초기값 할당 하지 않으면 컴파일 오류
	// - 생성자 초기값을 줄 수 없음.
	// final 함수 사용
	// - 매개 변수 값을 변경하지 못하게 할때.
	
	public final static double PI = 3.141592;
	public final static int X;
	
	static { // static 초기화 블록에서 final static 변수 초기화
		X=100;
	}
	
	final int b= 10; // 인스턴스 final 변수
	final int c;
	
	public Test10() {
		// X=100; // final static 변수는 생성자에서 초기화 불가능
		c = 100; // 인스턴스 final 변수 초기화
		
	}
	
	public void disp() {
		//c=200; //컴파일 오류
		System.out.println(b + " : " + c);
	}
	
	public int sum(final int n) {
		
		//n=10; //final 매개변수는 변경 불가
		int s =0;
		for(int i=1; i<=n; i++) {
			s+=i;
		}
		return s;
	}
	
}