package ch06.unit02;

public class Ex06 {
	
	int r;
	static double PI = 3.141592;
	
	//인스턴스 메소드
	public double area() {
		return r * r * PI;
	}
	
	//인스턴스 메소드
	public double length() {
		return r * 2 * PI;
	}
	
	public static void main(String[] args) {
		
		//r = 10; //컴파일 오류. 객체 생성이 안됌. 또한 main class가 String 임
		
		Ex06 obj = new Ex06();
		obj.r=10;
		
		double a, b;
		a = obj.area();
		b = obj.length();
		
		System.out.println("반지름 : " + obj.r);	// 결과 값 = 반지름 : 10
		System.out.println("넓이 : " + a);		// 결과 값 = 넓이 : 314.1592
		System.out.println("둘레 : " + b);		// 결과 값 = 둘레 : 62.83184
		
		
	}

}
