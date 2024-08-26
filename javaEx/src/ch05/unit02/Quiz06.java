package ch05.unit02;

public class Quiz06 {

	public static void main(String[] args) {
		
		char[][]c= new char[4][4];
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				//영문자를 난수로 이용하여 발생하는 방법 두가지.
				//c[i][j] = (char)((Math.random()*26)+'A');
				c[i][j] = (char)((Math.random()*26)+65);
				
				//영문자 중복 검사
				gogo:
				for(int a=0; a<=i; a++) {
					//for(int b=0; b<4; b++) {}
					//위 처럼 써도 됨
					for(int b=0; b<c[a].length; b++) {
						if(a==i && b>=j) {
							break gogo;
						}
						if(c[a][b] == c[i][j]) {
							j--;
							break gogo;
						} 
					}//for(int b=0_end
				} //for(int a=0_end
				
			}//for(int j=0_end
						
		}//for(int i=0_end
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.printf("%5c", c[i][j]);
			}
			System.out.println();
		}
		
	}

}
