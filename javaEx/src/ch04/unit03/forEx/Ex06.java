package ch04.unit03.forEx;

public class Ex06 {

	public static void main(String[] args) {
		/*
		int n, s;
		s=0;
		
		for(n=1; n<=10; n++) {
			s+=n;
			System.out.print(n + ":" + s); //결과 값 = 
		}
		System.out.println("\n결과 : " + s);// 결과 값 = 55
		*/
		/*
		int s, n;
		for(n=1, s=0;n<=10;s+=n, n++);
		System.out.println("\n결과 : " + s);
		*/
		
		//잘못된 코딩 예
		int n,s;
		s=0;
		
		for(n=1; n<=10; n++);
			s+=n;
			
		System.out.print(n + "," + s);//결과 값 11,11
		
	}

}
