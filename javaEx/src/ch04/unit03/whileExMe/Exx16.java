package ch04.unit03.whileExMe;

public class Exx16 {
	// 1~100까지 수중 3또는 5의 배수를 제외한 수를 한 줄에 5개씩 출력하고 마지막에 홀수 합을 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=0, s=0, cnt=0;
		
		while(n<100) {
			
			n++;
			
			if(n%3!=0 && n%5!=0) {
				s+=n;
				System.out.print(n + "\t");
				
				cnt++;
				if(cnt%5==0) {
					System.out.println();
				}
			}
			s++;
		}
		
	}

}