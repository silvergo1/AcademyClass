package ch03.unit03;

public class Ex05 {

	public static void main(String[] args) {
		
		int a, b;
		int key = 7788;
		
		a = 23;
		b = a ^ key;
		System.out.println(b); //암호와 되는 것. 결과 값 = 7803
		
		b = b ^ key;
		System.out.println(b); //복호화 되는 것. 결과 값 = 23
		
	}

}
