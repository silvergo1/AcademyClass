package ch07.unit01;

import java.util.Scanner;
// 정적인 멤버를 클래스 이름으로 명시하지 않고 접근 가능하도록 import
import static java.lang.Math.*;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		double s;
		
		System.out.print("각도 ? ");
		a = sc.nextInt();
		
		s = cos(PI*a/180.0);
		System.out.println(a+"각도의 cos 값 : " + s);
		
		sc.close();
		
	}

}
