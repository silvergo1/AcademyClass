package ch04.unit03.whileExMe;

public class Exx13 {
	//1+(1+2)+(1+2+3)...(1+2+3...10)의 연산 결과를 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=0, s=0,ss=0;
		
		while(n<10) {
			n++;
			s+=n;
			ss+=s;
		}
		System.out.println(ss);
		
	}

}
