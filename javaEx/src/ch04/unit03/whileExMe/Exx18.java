package ch04.unit03.whileExMe;

public class Exx18 {
	// 2~9단 까지의 구구단을 출력하는 프로그램
	public static void main(String[] args) {
		
		int dan, n;
		dan = 1;
		
		while(dan < 9) {
			dan++;
			System.out.println("-----"+dan+"단"+"-----");
			
			n=0;
			while(n<9) {
				n++;
				System.out.printf("%d * %d = %2d\n", dan, n, dan*n);
			}
			System.out.println();
		}

		
	}

}