package ch08.unit07;

public class Ex01 {

	public static void main(String[] args) {
		//외부에서 static 중첩 클래스의 객체를 생성
		Test1.User1 ob = new Test1().User1();
		ob.write();
		
	}

}

class Test1 {
	
	int a; //인스턴스 함수
	static int b = 0;
	
	//static 중첩 클래스
	//: 외부 클래스(Test1)의 객체 생성 없이 객체를 생성 할 수 있는 클래스
	//: 컴파일 하면 Test1@User1.class 파일이 생성
	static class User1 {
		
		int x = 100;
		public void write() {
			//System.out.println(a); //컴파일 오류. 객체 생성이 되지 않음.
			System.out.println(b); //객체 생성 하지 않아도 쓸 수 있는 함수.
		}
		
		public void disp() {
			Test1 t = new Test1();
			System.out.println(t.a);
			
			//print(); //컴파일 오류
			t.print();
		}
		
	}
	
	public void print() {
		System.out.println(a+":"+b);
	}

	public User1 User1() {
		// TODO Auto-generated method stub
		return null;
	}
	
}