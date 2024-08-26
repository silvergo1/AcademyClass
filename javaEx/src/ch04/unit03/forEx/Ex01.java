package ch04.unit03.forEx;

public class Ex01 {

	/*
	 	- for (초기식; 조건식; 증감식){
	 		실행문
	 	}
	 	
	 	- 조건식: true 또는 false, false 면 for 문을 빠져나감
	 	- 실행순서
	 	  초기식 -> 조건식 (참) -> 실행문
	 	  		  증감식 -> 조건식 (참) -> 실행문
	 	  		  증감식 -> 조건식 (참) -> 실행문
 	
	 */
	
	public static void main(String[] args) {
		/*
		int n;
		
		for(n=1; n<=10; n++) {
			
			System.out.print(n + " "); //결과 값 = 1 2 3 4 5 6 7 8 9 10
			
		}
		System.out.println("\n밖  : " + n); //결과 값 = 11
		*/
		/*
		for(int n=1; n<=10; n++) { //for 문에서 변수 선언 가능
			
			System.out.print(n + " "); //결과 값 = 1 2 3 4 5 6 7 8 9 10
			
		}
		//System.out.println("\n밖  : " + n); //컴파일 오류
		
		//for() 문에서 선언한 변수는 for() 문 안에서만 사용 가능
		*/
		
		int n;
		for(n=10; n<=1; n++) { //처음 조건식을 만족하지 않으면 한번도 실행 안함
			System.out.print(n + " ");
		}
		System.out.println("\n밖  : " + n); //결과 값 = 10
	}

}
