package ch06.unit03;

public class Ex07 {

	public static void main(String[] args) {
		
		Test7 t = new Test7(); 	// t의 필드 a <- 0, b <- 0 메모리 할당
		Test7 t2 = new Test7(); // t2의 필드 a <- 0, b <- 0 메모리 할당
		
		t.sub(5); // t의 필드 a <- 100, b <- 200
		System.out.println(t.a + ":" + t.b); // 결과 값 = 100:200
		
		//t2.sub(5); //호출하지 않았기 때문에 초기값으로 출력됨.
		System.out.println(t2.a + ":" + t2.b); // 결과 값 = 0:0
		
		
		
	}

}


class Test7 {
	
	int a; // 필드(인스턴스 변수)
	int b; // 필드(인스턴스 변수)
	
	public void sub(int x) { // x: 매개변수(지역변수)
		
		int s = 10; // 지역 변수
		
		a = 100; // 필드 : sub() 메소드를 호출한 객체것
		b = 200; // 필드 : sub() 메소드를 호출한 객체것
		
		System.out.println(s + ":" + x);
		
	}
	
}