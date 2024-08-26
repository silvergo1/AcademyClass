package ch04.unit03.whileExMe;

public class Exx05 {
	// 1~100 까지 정수의 짝수 합을 계산하여 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=0, s=0;
		
		while(n<100) {
			n+=2;
			s+=n;
		}
		System.out.println(s);
	}

}
