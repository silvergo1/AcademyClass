package ch04.unit03.forEx;

public class Ex02 {

	public static void main(String[] args) {
		
		int n;
		
		/*
			1) n <- 1
			2) n < 10 : 참
			3) System.out.print(n + " "); 실행
			4) n++ : n <- 2 
			5) n < 10 : 참
			6) System.out.print(n + " "); 실행
			
			7) n++ : n <- 3 
			8) n < 10 : 참
			9) System.out.print(n + " "); 실행
			10) if(n%3==0) {n+=5;} 실행
			11) n+=5 : n <- 8
			
			12) n++ : n <- 9
			13) n < 10 : 참
			14) System.out.print(n + " "); 실행
			15) if(n%3==0) {n+=5;} 실행
			16) n+=5 : n <- 14
			17) n++ : n <- 15
			18) n < 10 : 거짓
			19)  for()문 나감
		*/
		for(n=1; n<=10; n++) {
			System.out.print(n + " "); // 결과 값 = 1 2 3 9
			
			if(n%3==0) {
				n+=5;
				//반복 횟수에 사용된 변수위 값을 변경하면 반복 횟수가 변한다.
			}
		}
		System.out.println("\n밖 : " + n); // 결과 값 = 15
	}

}
