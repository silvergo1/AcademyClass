package ch04.unit03.whileExMe;

public class Exx06 {
	// 1~100 까지 정수의 홀수 합을 계산하여 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=1, s=0;
		
		while(n<100) {
			s+=n;
			n+=2;
		}
		System.out.println(s);
	}

}
