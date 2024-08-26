package ch04.unit03.whileExMe;

public class Exx21 {
	// do~while
	// 다음의 실행 결과는 ? a=10,b=11
	public static void main(String[] args) {
		
		int a=10, b=10;
		while(a<10) {
			a++;
		}
		System.out.println("a : " + a);
		
		do {
			b++;
		} while(b<10);
		System.out.println("b : " + b);
		
	}

}