package ch08.unit07;

public class Ex02 {

	public static void main(String[] args) {

		//Test2.User2 uu = new Test2().User2(); //컴파일 오류.
		Test2 t = new Test2();
		Test2.User2 uu = t.new User2(); //가능하지만 잘 하지 않음.
		uu.write();
	}

}

class Test2 {
	
	int a = 10;
	static int b = 20;
	
	//내부 클래스
	//: 외부 클래스의 객체가 생성되어야 객체를 생성할 수 있는 클래스
	class User2 {
		int x = 100;
		
		public void write() {
			System.out.println(a+":"+b+":"+x);
			//disp(); //가능
		}
	}
	
	public void disp() {
		User2 u = new User2();
		u.write();
	}
}
