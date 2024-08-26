package ch05.unit02;

public class Quiz05 {

	public static void main(String[] args) {
		
		int[][]a = new int[5][5];
		int n=0;
		
		int k;
		for(int i=0; i<9; i++) { //대각선 수 9
			for(int j=0; j<5; j++) {//대각선에 최대 많은 수 5
				k=i-j; //1 2 3 4 5 4 3 2 1 대각선에 있는 수 개수
				if(k<0||k>4) {
					continue;
				}
				a[j][k] = ++n;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
		
	}

}
