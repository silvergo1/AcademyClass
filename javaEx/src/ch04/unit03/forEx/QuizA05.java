package ch04.unit03.forEx;

public class QuizA05 {

	public static void main(String[] args) {
		
		int cnt=0;
		boolean b;
		
		for(int i=2; i<=100; i++) {
			
			b = false;
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					b = true;
					break;
				}
			}
			
			if(!b) {
				System.out.printf("%d\t", i);
				cnt++;
				if(cnt%10==0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n소수의 개수 : " + cnt);
	}
}
