package ch06.unit03;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		int s;
		
		s = t.sum(10);
		System.out.println("결과 : " + s); // 결과 값 = 결과 : 55
		
		System.out.println(t.isEven(10)); // 결과 값 = true
		System.out.println(t.isEven(11)); // 결과 값 = false
		
		System.out.println(t.isOdd(10)); // 결과 값 = false
		System.out.println(t.isOdd(11)); // 결과 값 = true
		
		char a='a', b=t.upper(a);
		System.out.println(a); // 결과 값 = a
		System.out.println(t.isUpper('c')); // 결과 값 = false
		
		t.gugudan(8);
		
	}

}

class Test2 {
	
	// 정수 n 까지의 합
	public int sum(int n) {
		
		int s=0;
		
		for(int i=1; i<=n; i++) {
			s+= i;
		}
		
		return s;
		
	}
	
	// 짝수인지 아닌지 판별
	public boolean isEven(int n) {
		return n%2==0;
	}
	
	// 홀수인지 아닌지 판별
	public boolean isOdd(int n) {
		return n%2==1;
	}
	
	// 문자가 대문자이면 ture, 그렇지 않으면 false
	public boolean isUpper(char c) {
		return c >= 'A' && c <= 'Z';
	}
	
	// 문자가 소문자이면 ture, 그렇지 않으면 false
	public boolean isLower(char c) {
		return c >= 'a' && c <= 'z';
	}
	
	// 문자가 소문자이면 대문자로 변환하고 그렇지 않으면 그대로 반환
	public char upper(char c) {
		return isLower(c) ? (char) (c-32) : c;
	}
	
	//년도가 윤년이면 true, 그렇지 않으면 false
	public boolean isLeap(int year) {
		return (year%4 == 0 && year%100 != 0) || year%400 == 0;
	}
	
	// 두 수(a, b) 중 적은수에서 큰수까지의 합
	public int sumOfTwoNumber(int a, int b) {
		
		int s = 0;
		int t;
		
		if(a>b) {
			t=a; a=b; b=t;
		}
		
		for(int i=a; i<=b; i++) {
			s+=i;
		}
		
		return s; 
		
	}
	
	// 두 수 중 큰 값 반환
	public int max(int a, int b) {
		return a > b ? a : b;
	}
	
	//두 수 중 적은 값 반환
	public int min(int a, int b) {
		return a > b ? b : a;
	}
	
	// 점수에 따른 평점(95~100: 4.5, 90~94: 4.0 ... 0~59:0)
	public double grade(int score) {
		
		double result = 0.0;
		
		if(score >= 95) {result = 4.5;}
		else if(score >= 90) {result=4.0;}
		else if(score >= 85) {result=3.5;}
		else if(score >= 80) {result=3.0;}
		else if(score >= 75) {result=2.5;}
		else if(score >= 70) {result=2.0;}
		else if(score>= 65) {result=1.5;}
		else if(score>= 60) {result=1.0;}
		else {result=0.0;}
		
		return result;
	}
	
	// 구구단 출력
	// void 리턴 타입 : 매소드를 실행 후 결과를 되돌려 줄 값이 없는 경우
	public void gugudan(int dan) {
		if(dan < 1 || dan > 9) {return;}
		for(int i=1; i<=9; i++) {			
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		return; //생략 가능(void 리턴 타입에서는 생략 가능)
	}
	
	public String hakjeom(int score) {
		return switch(score/10) {		
			case 10 -> "A";
			case 9 -> "A";
			case 8 -> "B";
			case 7 -> "C";
			case 6 -> "D";
			default -> "F";
		};
	}
	
}
