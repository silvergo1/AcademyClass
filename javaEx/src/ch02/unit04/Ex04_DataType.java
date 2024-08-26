package ch02.unit04;

public class Ex04_DataType {

	public static void main(String[] args) {
		
		//byte < short < int < long < float < double
		//		 char  < int < long < float < double
		
		// float : 단정도형 실수
		
		float f;
		
		f = 0; // int 리터널을 float에 대입
		System.out.println(f); // 결과 값 = 0.0
		
		f = 0.5f;
		System.out.println(f); // 결과 값 = 0.5
		
		f = 1.2e04f;
		System.out.println(f); // 결과 값 = 12000.0
		
		f = 'A';
		System.out.println(f); // 결과 값 = 65.0
		
		//f = 0.0; //컴파일 오류. 0.0은 배정도형 리터널
		
		//double : 배정도형 타입
		
		double d;
		
		d = 0.5; // 배정도형 리터널
		System.out.println(d); // 결과 값 = 0.5
		
		d = 0.5D;
		System.out.println(d); // 결과 값 = 0.5
		
		d = 1.2e04;
		System.out.println(d); // 결과 값 = 12000.0
		
	}

}
