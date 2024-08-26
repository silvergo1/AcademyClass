package ch06.unit02;

public class Ex05 {

	public static void main(String[] args) {
		
		Test5.disp(); //class 메소드 호출
		
		Test5 t = new Test5();			// 결과 값 = 20
		t.write(); // 인스턴스 메소드 호출	// 결과 값 = 0 : 10 : 20

	}

}

class Test5 {
	
	//인스턴스 변수 : 객체를 생성해야 메모리 할당
	int a;
	int b = 10;
	
	//class 변수 : 클래스가 로딩 될 때 메모리 할당
	static int c = 20;
	
	//인스턴스 메소드 : 객체를 생성해야 호출 가능
	public void write() {
		System.out.println(a + " : " + b + " : " + c);
	}
	
	//class 메소드: 객체 생성과 상관 없이 호출
	public static void disp() {
		//System.out.println(a); //컴파일 오류
		System.out.println(c);
	}
}
