package ch04.unit04;
/*
public class Ex04 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) {
					break;
				}
				System.out.println("i: " + i + ",j : " + j);
			}
		}

	}

}
*/

public class Ex04 {

	public static void main(String[] args) {
		gogo:
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) {
					break gogo;
				}
				System.out.println("i: " + i + ",j : " + j);
			}
		}

	}

}