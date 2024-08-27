package ch08.unit01;

public class Ex01 {

	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		obj.disp();
		System.out.println(obj.c);
		obj.print();
		
	}

}

class Test1 {// 상위 클래스: object

	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;
	
	public void print() {
		System.out.println(a+":"+b+":"+c+":"+d);
	}
	
}


//자바: 단일 상속만 지원
class Demo1 extends Test1 {
	
	int x = 100;
	
	public void disp() {
		//System.out.println(a); //컴파일 오류. 상위 private 접근 불가
		System.out.println("물려받은 필드 : "+ b+","+c+","+d);
		System.out.println(x);
	}
	
	public void write() {
		print(); //상위 메소드 호출
	}
	
}