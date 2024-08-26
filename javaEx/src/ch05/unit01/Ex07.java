package ch05.unit01;

public class Ex07 {

	public static void main(String[] args) {

		// 1~10까지 난수를 100개를 발생하여 한줄에 10개씩 출력하고
		// 마지막에 1~10까지 수가 각각 몇번씩 나왔는지 출력
		
		// a=(int)(Math.random()*100)+1
		
		int[]a = new int[10];
		int n;
		
		for(int i=1; i<=100; i++) {
			
			n = (int)(Math.random()*10)+1;
			
			System.out.printf("%5d", n);
			
			if(i%10==0) {
				System.out.println();
			}
			a[n-1]++;
			//0방에 1 1방에2 2방에3 3방에4 ... 1 몇개? 2몇개? count 세는것.
		}
		for(int i=0; i<a.length; i++) {
			System.out.println((i+1) + " : " + a[i]);
		}

	}

}
