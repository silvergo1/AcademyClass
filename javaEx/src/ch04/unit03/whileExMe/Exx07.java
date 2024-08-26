package ch04.unit03.whileExMe;

public class Exx07 {
	// 다음의 실행 결과는? a: 11 s: 55
	public static void main(String[] args) {
		
		int a=0, s=0;
		while (a++ <= 9) {
			s+=a;
		}
		System.out.println("a: "+a+"s: "+s);
	}

}
