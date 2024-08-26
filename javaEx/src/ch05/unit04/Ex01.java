package ch05.unit04;

public class Ex01 {
	
	/*
		
		명령행 인수
		1) 자바 실행 (명령행 인수 x)
			cmd > java Ex01
			
		2) 자바 실행 : 명령행 인수
			cmd > java Ex01 a b c
			
			args[0] <- "a"
			args[1] <- "b"
			args[2] <- "c"
			
		public static void main(String[] args) {}
							   (String[] args) ==> 명령행 인수
	*/

	public static void main(String[] args) {
		
		System.out.println("명령행 인수 개수 : " + args.length);
		
		System.out.println("명령행 인수 값");
		for(String s:args) {
			System.out.println(s);
		}

		
		
	}

}
