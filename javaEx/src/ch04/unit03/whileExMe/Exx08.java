package ch04.unit03.whileExMe;

public class Exx08 {
	// 10!(팩토리얼, factorial: 1*2*3...*10)의 연산 결과를 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=1, s=1;
		
		while (n<10) {
			n++;
			s*=n;
		}
		System.out.print(s);
	}

}
