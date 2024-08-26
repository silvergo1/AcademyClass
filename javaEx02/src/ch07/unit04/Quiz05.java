package ch07.unit04;

public class Quiz05 {

	public static void main(String[] args) {

		String s;
		
		s = generatePwd();
		System.out.println(s);
		
		s = generatePwd();
		System.out.println(s);
		
	}
	
	// 대문자, 소문자, 숫자, 특수 문자등을 조합하여 10자리 패스워드 만들기
	public static String generatePwd() {
		
		//패스워드에는 공백이 들어가면 안됌
		
		StringBuilder sb = new StringBuilder();
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*_abcdefghijklmnopqrstuvwxyz";
		int n;
		
		for(int i=1; i<=10; i++) {
			
			n = (int)(Math.random()*s.length());
			sb.append(s.charAt(n));
			
		}
		
		return sb.toString();
		
	}

}
