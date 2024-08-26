package ch04.unit03.whileExMe;

public class Exx17 {
	// 1~10까지의 정수의 합을 출력하는 프로그램
	// while(true)문 사용. if문, break문을 이용하여 작성
	public static void main(String[] args) {
		
		int n=0,s=0;
		
		while(true) {
			n++;
			s+=n;
			if(n>=10) {
				break;
			}
		}
		System.out.println("결과 :"+s);
		
	}

}