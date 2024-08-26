package ch05.unit02;

public class Ex02 {

	public static void main(String[] args) {
		
		int[][]a= new int[5][4];
		
		int n=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=++n;
			}
		}
		
		for(int i=0; i<a.length; i++) { //행
			for(int j=0; j<a[i].length; j++) {//열
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------------\n");
		
		//향상된 for문 
		//for(자료형 변수명:배열명){}
		//for(자료형 한 단계 아래의 자료형의 변수명 : 배열명){}
		for(int []x:a) {
			for(int y:x) {
				System.out.printf("%5d", y);
			}
			System.out.println();
		}

	}

}
