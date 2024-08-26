package ch05.unit02;

public class Ex03 {

	public static void main(String[] args) {

		/*
			
			1 6 11 16
			2 7 12 17
			3 8 13 18
			4 9 14 19
			5 10 15 20
			
		*/
		
		int [][]a = new int[5][4];
		int n=0;
		
		// 컴퓨터는 항상 1부터 순서대로 감.
		// 컴퓨터는 왼쪽에서 오른쪽으로, 상단에서 하단으로 내려감.
		// 상단에서 하단으로 왼쪽에서 오른쪽으로 결과값 추출 못함.
		// 열 먼저 결과 값 추출 한 다음 행 추출.
		// 따라서 위 처럼 결과를 나오겠끔 하려면 열 먼저 처리를 해야됨. 
		
		for(int i=0; i<4; i++) {//열
			for(int j=0; j<5; j++) {
				a[j][i]=++n;
			}
		}

		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
	}

}
