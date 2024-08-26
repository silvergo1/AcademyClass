package ch02.unit04;

/*
	
	정수 타입
	
*/

public class Ex01_DataType {

	public static void main(String[] args) {
		
		byte b1;		//변수 선언 (-128 ~ 127)
		byte b2 = 10;	// 변수 선언과 동시에 초기화
		//byte b3 = 130;	// 에러. 표현 범위를 벗어남
		
		//System.out.println(b1); // 컴파일 오류. 초기화하지 않는 변수는 연산에 사용 불가

		System.out.println(b2); // 결과 값 = 10
		
		b2 = 30;	//프로그램 실행 중 값 변경. 이전 값은 기억 불가
		
		System.out.println(b2); // 결과 값 = 30
		
		short s1, s2 = 10; 	//short 타입: -32768 ~ 32767
							//  short 타입은 한번에 두가지 변수를 선언할 수 있으며, s1은 초기화 되지 않는 상태 s2는 10으로 초기화 된 상태이다
		s1 = 'A'; // 65, 문자는 ASCII 코드로 저장되며 숫자 자료형에 대입 가능
		System.out.println(s1 + "," + s2); //결과 값 = 65,10
		
		int i1 = 200;
		int i2 = 'a'; // 97
		int i3;
		
		i3 = '1' + '2'; // 49 + 50 
						// '1':문자로 ASCII 코드값이 49
		System.out.println(i1 + "," + i2 + "," + i3); //결과 값 = 200,97,99
		
		//b1 = i1; // 컴파일 오류.
		//byte < int 이며, 큰 자료형의 값을 적은 자료형에 대입 불가
		
		b1 = (byte)i1; 	// int 형을 byte 형으로 변환하여 대입
						// 200은 byte에 대입할 수 없으며,  overflow가 발생
						// 200 : 1100 1000 => 가장 앞 1은 부호, 음수를 의미
		
		System.out.println(b1); // 결과 값 = -56
		
		long l1, l2;
		l1 = 100; 	// int 리터널을 long 형 변수에 대입
					// int < long 이므로 적은 자료형의 값은 큰 자료형에 대입 가능
		//l2 = 2200000000; 	// 컴파일 오류
							//int 리터널에는 2200000000 이 없음
		l2 = 22000000000L; // long 형 리터널
		
		System.out.println(l1 + "," + l2);
		
		
		
	}

}
