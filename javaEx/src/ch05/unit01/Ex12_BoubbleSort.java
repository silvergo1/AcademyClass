package ch05.unit01;

public class Ex12_BoubbleSort {

	public static void main(String[] args) {
		
		// Bubble Sort
		
		int []a = new int[] {20, 10, 8, 13, 17, 19, 16, 11, 22, 12};
		int t;
		
		System.out.print("source Data : ");
		for(int n:a) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// for 문장으로 소스 짜야됨.
		// 10개: 9회전
		// 1회전 : (1번째:2), (2번째:3),...(9번째:10)
		// 순서 값  (0:1), (1:2)...(8:9)
		// 2회전 : (1번째:2), (2번째:3),...(8번째:9)
		// 순서 값  (0:1), (1:2)...(7:8)
		// 2회전 : (1번째:2), (2번째:3),...(7번째:8)
		// 순서 값  (0:1), (1:2)...(6:8)
		
		//for(int i=1; i<ia.length; i++) {} // i=1~9
		
		for(int i=1; i<a.length; i++) {
			for(int j=0; j<a.length-i; j++) {
				if(a[j] > a[j+1]) {
					t=a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		
		System.out.print("Sort Data : ");
		for(int n:a) {
			System.out.print(n + " ");
		}
		System.out.println();
		
	}

}
