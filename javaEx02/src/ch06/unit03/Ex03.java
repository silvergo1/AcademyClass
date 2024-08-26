package ch06.unit03;

public class Ex03 {
	
	// 클래스 메소드 => 클래스 메소드에서는 인스턴스 메소드를 부를 수 없다.
	// 왜냐. 인스턴스 메소드는 선언을 해야 사용할 수 있음.
	public static void main(String[] args) {
		
		Test3 t = new Test3();
		
		int[]a = new int[] {1,3,5,7,9};
		int s;
		
		System.out.println("a배열");
		disp(a); // 결과 값 = 1 3 5 7 9 
		
		s = t.total(a);
		System.out.println(s); // 결과 값 = 25
		
		int[]b = t.random();
		System.out.println("난수");
		disp(b); // 결과 값 = 난수 10개
		
		b = t.random(); //b = t.random(n); n=숫자. 난수 발생 시킬 숫자.
		System.out.println("\n난수");
		disp(b); // 결과 값 = 난수 n개
		
	}
	
	public static void disp(int[] num) {
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}

class Test3 {
	
	// 인자로 넘어온 정수형 배열의 합 구하기
	
	public int total(int[] num) {
		
		int s=0;
		
		for(int n:num) {
			s+=n;
		}
		
		return s;
		
	}
	
	// 난수 발생 10개
	public int[] random() {
		int[]a = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random() * 100)+1;
		}
		
		return a;
	}
	
	// 난수 발생 count개
	public int[] random(int count) {
		
		if(count < 1) {
			return null;
		}
		
		int []a = new int[count];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random() * 100)+1;
		}
		
		return a;
		
	}
	
}