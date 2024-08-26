package ch06.unit03;

public class Ex01 {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		int result;
		
		result = t.sub(5);
		System.out.println(result);
		
		t.sub(10);

	}

}


// 메소드 : 기능을 구현
// 접근제어 리턴타입 메소드명([매개변수타입 매개변수명]) {}
// 지역변수(매개변수)는 메소드를 호출할 때 메모리를 할당 받고 메소드를 빠져나갈때 메모리 해제
class Test1 {
	public int sub(int n) {// n : 매개변수(지역변수: 스택메모리에 메모리 할당)
		int s=0; // s : 지역변수(스택메모리에 메모리 할당)
		
		s=n+5;
		for(int i=0; i<s; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		return s; // 반환 값을 가지고 호출한 곳으로 돌아감
	}
}
