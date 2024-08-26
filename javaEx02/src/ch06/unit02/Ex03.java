package ch06.unit02;

public class Ex03 {

	public static void main(String[] args) {

		//필드(인스턴스변수)는 new 한 객체 만큼 메모리를 할당 받는다. 
		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		Test3 t3 = new Test3();
		Test3 t4 = t1; //할당 받은 것이 아니라 주소를 가지고 있는 것임.
		//방은 하나인데 이름이 t1, t4 두개이다.
		
		t1.b = 20;
		
		System.out.println(t1.a + " : " + t1.b); // 결과 값 = 10 : 20
		System.out.println(t2.a + " : " + t2.b); // 결과 값 = 10 : 0
		System.out.println(t3.a + " : " + t3.b); // 결과 값 = 10 : 0
		
		System.out.println(t1 == t4); // 결과 값 = true	"=="는 주소를 비교함. 동일한 주소
		System.out.println(t2 == t3); // 결과 값 = false	"=="는 주소를 비교함. 상이한 주소
		
		t4.a = 100;
		System.out.println(t1.a + " : " + t4.a); // 결과 값 = 100 : 100
		
		// class명@해쉬코드
		// 해쉬코드 : JVM에서 객체를 빠르게 검색하기 위해 사용
		// 같은 객체는 해쉬코드가 같지만 해쉬코드가 같다고 같은 객체는 아니다.
		System.out.println(t1); // 결과 값 = ch06.unit02.Test3@54a097cc
		System.out.println(t2); // 결과 값 = ch06.unit02.Test3@36f6e879
		System.out.println(t3); // 결과 값 = ch06.unit02.Test3@5a61f5df
		System.out.println(t4); // 결과 값 = ch06.unit02.Test3@54a097cc
		
	}

}

class Test3 {

	int a =10;
	int b;
	
	public void pirnt() {
		System.out.println(a + " : " + b);
	}
	
}
