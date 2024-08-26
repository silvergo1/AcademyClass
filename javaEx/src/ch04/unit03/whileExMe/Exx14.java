package ch04.unit03.whileExMe;

public class Exx14 {
	// 1/2+2/3+3/4...+9/10 의 연산 결과를 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=0;
		double s=0;
		
		while(n<9) {
			n++;
			s+=(double)n/(n+1);
		}
		System.out.println(s);
	}

}