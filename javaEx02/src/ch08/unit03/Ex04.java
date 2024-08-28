package ch08.unit03;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		
		Object obj = "korea"; // up-casting
		
		//System.out.println(obj.length()); // 컴파일 오류
		System.out.println(((String)obj).length()); // down-casting
		
		Object n1 = 10;
		Object n2 = 10;
		//Object n3 = n1+n2; //컴파일 오류
		Integer n3 = (Integer)n1 + (Integer)n2; // down-casting
		System.out.println(n3);
		
		//Object[] oo = {"seoul", 90, 90, "korea"};
		//Arrays.sort(oo); //런타임 오류
		
		Object[] oo = {"seoul", "jeoju", "korea"};
		Arrays.sort(oo);
		System.out.println(Arrays.toString(oo));
		
	}

}
