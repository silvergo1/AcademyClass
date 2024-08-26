package ch04.unit03.whileEx;

public class Ex04 {

	public static void main(String[] args) {
		/*
		// 1 ~ 100 까지 합
		int s, n;
		
		s  = n = 0;
		
		while(n<100) {
			n++;
			s+=n;
		}
		System.out.println("결과 : " + s); //결과 값 = 5050
		*/
		
		/*
		int s, n;
		
		s  = n = 0;
		
		while(n++<100) {
			s+=n;
		}
		System.out.println("결과 : " + s); //결과 값 = 5050
		*/
		
		int s, n;
		
		s  = n = 0;
		
		while(++n<=100) {
			s+=n;
		}
		System.out.println("결과 : " + s); //결과 값 = 5050
		
	}

}
