package ch04.unit03.whileEx;

public class Quiz09 {

	public static void main(String[] args) {

		//피보나치수열
		//0+1+1+2+3+5+8+13+21
		
		int a=0, b=1, c;
		int s=0;
		
		int n = 0;
		
		while(n<9) {
			//System.out.print(a);
			s+=a;
			c = a+b;
			a=b;
			b=c;
			n++;
		}
		System.out.println("결과 : " + s);
	}

}
