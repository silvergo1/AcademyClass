package ch06.unit02;

public class Ex07 {

	public static void main(String[] args) {
		
		/*
		 	
			Test7 t;
			t.name = "김자바";
			
			컴파일 오류. t가 초기화 되지 않음.
			
			------------------------------------------------
			
			Test7 t = null;
			t.name = "김자바";
			
			런타임 오류. t는 null로 초기화. null은 메모리가 할당 되지 않은 상태
			NullPointerException = 메모리가 할당 되지 않은 상태
			
		*/
		
		//객체 배열
		Test7 []tt = new Test7[5]; // class는 new 다음에는 생성자가 와야함. 생성자가 오지 않으면 메모리 할당이 되지 않음.
		// 위 소스는 변수 5개를 생성한 것과 마찬가지.
		// Test7 t1=null, t2=null, t3=null, t4=null, t5=null; 과 유사
		
		//tt[0].name = "홍길동";
		
		//System.out.println(tt[0].name + " : " + tt[0].age); // 결과 값 = 런타임 오류 NullPointerException
		// 클래스는 생성자를 통해서만 메모리 할당을 받는다
		
		//객체 배열 메모리 할당
		for(int i=0; i<tt.length; i++) {
			tt[i] = new Test7();
		}
		
		tt[0].name = "홍길동";
		tt[0].age = 20;
		
		System.out.println(tt[0].name + " : " + tt[0].age); // 결과 값 = 홍길동 : 20
		System.out.println(tt[1].name + " : " + tt[1].age); // 결과 값 = null : 0

	}

}

class Test7 {
	
	String name;
	int age;
	
	public void disp() {
		System.out.println(name + " : " + age);
	}
	
}
