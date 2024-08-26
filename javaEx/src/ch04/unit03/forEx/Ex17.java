package ch04.unit03.forEx;

public class Ex17 {

	public static void main(String[] args) {
		
		int size = 9; //줄 수. 짝수는 안됨
		int n;
		
		n = size/2;
		
		for(int i=0; i<size; i++) { //줄 수
			
			for(int j=0; j<(size-n); j++) { //공백 또는 * 찍는 소스
				
				System.out.print((j >= n)? "*":" "); //자리가 공백인지 *인지
				
			}
			
			n=i < (size/2) ? n-1:n+1; // 감소식
			System.out.println();
		}
		
	}

}