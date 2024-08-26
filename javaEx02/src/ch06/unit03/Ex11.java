package ch06.unit03;

public class Ex11 {

	public static void main(String[] args) {
		
		// int < long (성립)
		// 기본 자료형은 상호 간 크기를 비교 할 수 있음
		// Integer < Long (성립 안됨)
		// 클래스는 상호 간 크기를 비교 할 수 없음
		byte b = 10;
		char c = 'A';
		int i = 100;
		short s = 20; 	//기본자료형
		Short ss = 25; 	//클래스
		long l = 1000;
		//Long ll = 1500; //클래스 컴파일 오류
		Long ll = 1500L;
		
		// 메소드를 호출할 때 넘겨주는 실인수는 메소드의 매개변수보다 적거나 같아야한다.
		Test11 t = new Test11();
		
		t.print();	// 결과 값 = 인자없는 print
		t.print(b); // 결과 값 = short : 10 //(같은 자료형에서)메소드의 매개변수가 같거나 큰것중 가장 작은것
		t.print(c);	// 결과 값 = int : 65
		t.print(s);	// 결과 값 = short : 20
		t.print(ss);// 결과 값 = short : 25
		t.print(i);	// 결과 값 = int : 100
		t.print(l);	// 결과 값 = long : 1000
		t.print(ll);// 결과 값 = long : 1500
		System.out.println();
		
		t.write(b);	// 결과 값 = int : 10
		t.write(c);	// 결과 값 = int : 65  //char(양수)형이랑 short형(음수양수)은 비교할 수 없음.
		t.write(s);	// 결과 값 = int : 20
		t.write(ss);// 결과 값 = Short : 25
		t.write(i);	// 결과 값 = int : 100
		t.write(l);	// 결과 값 = Long : 1000
		t.write(ll);// 결과 값 = Long : 1500
		System.out.println();
		
		Integer a = 10;
		t.sub(a); // Integer는 long가 전달 받을 수 있음.
		//t.sub2(a); // 컴파일 오류 // Integer < Long(x)
		
	}

}

// method overloading
class Test11 {
	
	public void print() {
		System.out.println("인자없는 print");
	}
	
	/*
	// 컴파일 오류: 리턴 타입은 overloading 조건을 충족하지 못함
	public void print() {
		return 1;
	}
	*/
	
	public void print(short val) {
		System.out.println("short : " + val);
	}
	
	public void print(int val) {
		System.out.println("int : " + val);
	}
	
	public void print(long val) {
		System.out.println("long : " + val);
	}
	
	//------------------------------------------------
	// Wrapper class : 기본 데이터를 객체 단위로 처리할 수 있도록 클래스를 제공
	// Character, Integer, Long, Float, Double, Byte, Short, Boolean 등
	public void write(Short val) {
		System.out.println("Short : " + val);
	}
	
	public void write(int val) {
		System.out.println("int : " + val);
	}
	
	public void write(Long val) {
		System.out.println("Long : " + val);
	}
	
	//----------------------------------------------------
	public void sub(long val) {
		System.out.println("long : " + val);
	}
	
	public void sub2(Long val) {
		System.out.println("Long : " + val);
	}
	
}
