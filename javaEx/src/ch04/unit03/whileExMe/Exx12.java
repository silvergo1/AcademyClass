package ch04.unit03.whileExMe;

public class Exx12 {
	// 1~100까지의 합을 구하는 프로그램을 작성하되
	// 1~10까지의 합, 1~20까지의 합, 1~30까지의 합...1~100까지 합 처럼
	// 수가 10의 배수가 될 때마다 합을 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=0, s=0;
		
		while(n<100) {
			n++;
			s+=n;
			
			if(n%10 == 0) {				
				System.out.println("1 ~ "+n+" 까지 합 : "+s);
			}
		
		}
	}
}
