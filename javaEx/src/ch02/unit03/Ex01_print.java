package ch02.unit03;

/*
 	
 	- System.out.print(인수)
 	  : 인수의 내용을 출력 장치를 통해 출력
 	  : 인수는 생략할 수 없다.
 	  : 출력하고 라인을 넘기지 않는다.
 	
*/

public class Ex01_print {

	public static void main(String[] args) {
		
		//System.out.print(); //컴파일 오류. 괄호안에 출력할 내용 없음. 출력할 내용이 없으면 오류
		System.out.print("HTML 5, ");
		System.out.print("javascript, ");
		System.out.print("CSS 3");
		System.out.print("\n"); // \n: 라인을 넘김(코드: 10)
		
		System.out.print("JAVA\nJSP\n");
		System.out.print("Spring");
		System.out.print("\nOracle\n\n");
		
		System.out.print("국어\t"); // \t: tab 간격
		System.out.print("영어\t");
		System.out.print("수학\n");
		System.out.print(80 + "\t");
		System.out.print(85 + "\t");
		System.out.print(90 + "\n");

	}

}
