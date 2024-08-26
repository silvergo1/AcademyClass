package ch04.unit03.whileExMe;

public class Exx20 {
	// do~while
	// 1~100까지 수의 합을 계산하여 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=0, s=0;
		
		do {
			n++;
			s=+n;
		} while(n<100);
		
		System.out.println("결과 : " + s); //왜.. 결과가 100일까요..
		
	}

}