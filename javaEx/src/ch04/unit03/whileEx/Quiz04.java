package ch04.unit03.whileEx;

public class Quiz04 {

	public static void main(String[] args) {
		
		//3 또는 5 배수의 합과 평균
		int n, s, cnt;
		
		n = s = cnt = 0;
		
		while(n < 100) {
			n++;
			
			if(n%3==0 || n%5==0) {
				
				s += n; // 3 또는 5의 배수의 합
				cnt++; // 3 또는 5의 배수의 개수
				
			}
		}
		
		System.out.println("합 : " + s);
		System.out.println("평균 : " + (s/cnt));
	}

}
