package ch04.unit01;

public class Ex01_if {

	public static void main(String[] args) {
		
		int n;
		String s;
		
		/*
			n = 10;
			
			if(n%2 == 0) {
				s = "짝수";
			}		
			System.out.println(n + "->" + s); //컴파일 오류. s가 초기화 되지 않음
		 */
		
		n = 10;
		s = "홀수";
		
		if(n%2 == 0) { //if((n&1) == 0) -> 같은 조건
			s = "짝수";
		}
		
		System.out.println(s);
		
	}

}
