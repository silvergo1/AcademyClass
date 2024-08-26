package ch06.unit04;

public class Ex09 {

	public static void main(String[] args) {

		Test9 t1;
		//클래스가 로딩되는 시점 : 객체를 처음 생성 하거나 클래스변수, 클래스메소드를 처음 사용할때
		System.out.println(Test9.x+":"+Test9.y);
		
		t1 = new Test9();
		t1.disp();
		
		Test9 t2 = new Test9();
		t2.disp();
		
	}

}

/*

	클래스가 로딩 될 때 한번 실행
	
	1. 클래스변수 메모리 할당 - 메소드 영역(static 영역)
	2. 클래스변수를 default 값으로 초기화
	3. 초기화 수식을 실행
	4. static 초기화 블록 실행
	
	객체가 생성 될 때
	
	1. new Test9();
	   객체를 위한 메모리 할당 - 인스턴스변수 메모리 할당
	2. 모든 인스턴스변수 default 값으로 초기화
	3. 초기화 수식이 존재하는 경우 초기화 수식을 실행
	4. 초기화 블록이 존재하면 실행
	5. 생성자 몸체를 실행

*/
class Test9 {
	
	private int a;
	private int b=1;
	private int c;
	private int d;
	
	// d=5; //컴파일 오류.
	//선언부에서는 값을 줄 수 없음.
	
	// 모든 객체들이 공동으로 사용할 때  static 변수 씀
	public static int x = 10;
	public static int y;
	
	static {
		y = 5;
		
		System.out.println("static 초기화 블록");
	}
	
	{
		//인스턴스 초기화 블럭(사용할 일이 거의 없음)
		d = 5;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	public Test9() {
		c=10;
		System.out.println("생성자");
	}
	
	public void disp() {
		System.out.println(a+" : " + b + " : " + c + " : " + d);
	}
	
}