package ch06.unit03;

public class Ex08 {

	public static void main(String[] args) {
		
		Test8 t = new Test8();
		t.write(5); // 결과 값 = 1 2 3 4 5
		System.out.println(); 

	}

}


class Test8 {
	
	// 재귀 호출 (recursion): 자신이 자신을 부르는 호출
	//  : 재귀 호출은 종료 조건을 주지 않으면 StackOverflowError 이 발생
	//  : STACK에 정보를 임시 저장
	// STACK : LIFO(Last In First Out) 구조
	public void write(int n) {
		
		if(n>1) {
			write(n-1);
		}
		
		System.out.print(n+" ");
		
	}
	
}