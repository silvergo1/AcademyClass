package ch06.unit04;

public class Ex02 {

	public static void main(String[] args) {

		Test2 t = new Test2();
		t.disp();
		
		//Demo2 d = new Demo2(); //컴파일 오류. 인자가 없는 생성자가 존재하지 않음
		Demo2 d = new Demo2(10);
		d.disp();
		
	}

}

class Test2 {
	
	// 생성자가 없는 경우에만 컴파일 일때 default 생성자를 만들어준다
	// default 생성자 => public Test2(){} 를 생성
	private int a = 5;
	public void disp() {
		System.out.println(a);
	}
	
}

class Demo2 {
	
	private int a;
	
	// 생성자가 있으면 디폴트 생성자를 만들어 주지 않는다.
	public Demo2(int n) {
		a = n;
		System.out.println("인자가 하나인 생성자");
	}
	
	public void disp() {
		System.out.println(a);
	}
	
}
