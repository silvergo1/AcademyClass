package ch04.unit03.whileExMe;

public class Exx15 {
	// 1~100까지 수중 홀수를 한 줄에 5개씩 출력하고 마지막에 홀수 합을 출력하는 프로그램
	public static void main(String[] args) {
		
		int n=0, s=0, cnt=0;
		
		while(n<100) {
			n++;
			if(n%2!=0) {
				System.out.print(n + "\t");
				s+=n;
				
				cnt++;
				if(cnt%5==0) {
					System.out.println();
				}
			}
			s++;
		}
		
		System.out.println("합 결과 : " + s); //왜.. 2600이 나오는걸까요.....
		
	}

}