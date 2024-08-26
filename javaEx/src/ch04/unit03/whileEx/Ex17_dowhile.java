package ch04.unit03.whileEx;

public class Ex17_dowhile {

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("while...");
		n=10;
		while(n<10) {// 처음 조건이 거짓이므로 한번도 실행 안함.
			n++;
			System.out.println("in : "+n);
		}
		System.out.println("out : "+n); //10
		System.out.println();
		
		//do~while는 적어도 한번은 실행한다.
		System.out.println("do~while...");
		n=10;
		do {
			n++;
			System.out.println("in : "+n);
		} while(n<10);
		System.out.println("out : "+n);

	}

}
