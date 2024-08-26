package ch04.unit03.forEx;

public class Ex10 {

	public static void main(String[] args) {

		// for문의 증감에 float를 사용할 수 지만 사용하면 안됨
		
		int s = 2000000000;
		int count = 0;
		
		for(float f=s; f<s+50; f++) {
			count++;
		}
		System.out.println(count); //결과 값 = 0 / 원래는 5가 나와야함.
	}
}
