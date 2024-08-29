package ch08.unit07;

public class Ex03 {

	public static void main(String[] args) {
		
		Demo3 d = new Demo3();
		d.sub();
		
		Object ob1 = new Object();
		System.out.println(ob1); //클래스이름@해쉬코드
		
		//익명 클래스
		Object ob2 = new Object() {
			@Override
			public String toString() {
				return "자바 어렵다.";
			}
		};
		System.out.println(ob2); //클래스이름@해쉬코드
	}

}


interface Test3 {
	
	public void dips();
	
}

class Demo3 {
	public void sub() {
		//Test3 t = new Test3(); //컴파일 오류
		
		// anonymous class
		//: 컴파일 하면 Demo3$1.class 형식으로 생성
		//: $ 뒤의 숫자는 번호순으로
		Test3 t = new Test3() {
			
			@Override
			public void dips() {
				System.out.println("print");
			}
		};
		
		t.dips();
	}
}