package ch06.unit04;

public class Ex06 {

	public static void main(String[] args) {

		Test6 t = new Test6("김자바");
		t.print(); // 결과 값 = 인자 두개의 생성자 / 인자 하나의 생성자 / 김자바,0
		
	}

}

class Test6 {
	
	private String name;
	private int age;
	
	public Test6() {
		System.out.println("인자 없는 생성자");
	}
	
	public Test6(String name) {
		// Test6(name, 0); // 컴파일 오류. 생성자는 new 없이 선언할 수 없음.
		this(name, 0); // 중복정의된 다른 생성자 호출. 선두에 한번만 가능
		//this 위에는 아무 소스도 올 수 없음.
		
		System.out.println("인자 하나의 생성자");
	}
	
	public Test6(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("인자 두개의 생성자");
	}
	
	public void print() {
		System.out.println(name+","+age);
	}
	
}
