package ch04.unit03.forEx;

public class Ex09 {

	public static void main(String[] args) {

		// 무한루프 (for 문으로 하지 않는거 권장)
		// 무한루프 쓰려면 while 문으로 작성 권장
		
		int s,n;
		s=n=0;
		
		for(;;) {//무한루프. 가운데 부분에 아무것도 기술하지 않거나 true 이면 무한루프
			n++;
			s+=n;
			if(n<10) {
				break;
			}
		}
		System.out.println(s);
		
	}
}
