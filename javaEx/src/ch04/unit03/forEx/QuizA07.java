package ch04.unit03.forEx;

public class QuizA07 {

	public static void main(String[] args) {
		
		for(int n=1; n<=9; n++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.printf("%d * %d = %d\n", dan, n, dan*n);
			}
		}
		
	}
}
