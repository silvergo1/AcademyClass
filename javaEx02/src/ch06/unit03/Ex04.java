package ch06.unit03;

public class Ex04 {

	public static void main(String[] args) {

		Test4 obj = new Test4();
		
		obj.disp();
		
		Test4.print();

	}

}

class Test4 {
	
	// 인스턴스 변수
	int a;
	int b = 10;
	
	// 클래스 변수
	static int c = 100;
	
	// 인스턴스 메소드
	public int sub(int n) {
		
		int s = 0;
		
		a = 100;
		s = n+50;
		
		return s;
		
	}
	
	// 인스턴스 메소드
	public void disp() {
		System.out.println(a+":"+b);
		
		int x = sub(5);
		System.out.println(x+":"+a+":"+b);
		
		System.out.println(c);
		
	}
	
	// 클래스 메소드
	public static void write() {
		System.out.println("write");
	}
	
	// 클래스 메소드
	public static void print() {
		
		System.out.println(c);
		write();
		
		//System.out.println(a); //컴파일 오류.
		//disp(); //컴파일 오류.
		
		//클래스 메소드에서는 인스턴스변수나 인스턴스메소드를 호춣하기 위해서는 객체를 생성해야한다
		Test4 t = new Test4();
		System.out.println(t.a);
		t.disp();
		
	}
	
}