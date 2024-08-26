package ch05.unit01;

public class Ex06 {

	public static void main(String[] args) {
		
		// 1~100까지 수중 서로 다른 난수 10개를 발생하여 출력하기
		// a=(int)(Math.random()*100)+1
		
		//배열 선언 및 메모리 할당
		int[] a = new int[10];
		
		//난수 10개 발생 (중복 숫자 나올 수 없음)
		for(int i=0; i<10; i++) {
			a[i]=(int)(Math.random()*100)+1;
			
			for(int j=0; j<i; j++ ) {
				if(a[i] == a[j]) {
					i--;
				}
			}
		}
		
		//난수 출력
		for(int n:a) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
	}

}
