package ch07.unit03;

public class Ex07 {

	public static void main(String[] args) {
		
		// System.out.println(2/0); // 런타임 오류
		
		System.out.println(2.0 % 0); // 결과 값 = NaN (Not a Number = 숫자가 아니다)
		// System.out.println(0 / 0); // 런타임 오류 (실수랑 정수랑 다름)
		System.out.println(0.0 / 0.0); // 결과 값 = NaN
		
		System.out.println(2.0 / 0.0); // 결과 값 = Infinity (무한대 또는 숫자가 아니에요 라는 뜻)
		
		if(Double.isNaN(0.0 / 0.0)) {
			System.out.println("NaN...");
		}
		
		if(Double.isInfinite(2.0 / 0.0)) {
			System.out.println("Infinite...");
		}
		
	}

}
