package ch05.unit03;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		//System.arrayCopy() : 배열의 내용을 다른 배열에 복사 (주소 복사 x)
		
		int[]a= new int[] {10, 20, 30};
		int[]b= new int[a.length];
		int[]c= a;
		
		/*
		//a의 값을 b에게 복사
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		*/
		
		System.arraycopy(a, 0, b, 0, a.length);
		//System.arraycopy(원본, 원본의 시작 위치, 복사할 곳, 복사 시킬 시작 위치, 복사시킬개수)
		
		System.out.println(Arrays.toString(b)); // 결과 값 = [10, 20, 30]
		System.out.println(a == b); // 주소 비교. 결과 값 = false
		
		//System.arraycopy(a, 0, b, 1, a.length-1);
		//System.out.println(Arrays.toString(b)); 결과 값 = [0, 10, 20]
		
		//b[1] = 50;
		//System.out.println(a[1] + " : " + b[1]); // 결과 값 = 20 : 50
		//System.out.println(a == b); // 주소 비교. 결과 값 = false 
		
		c[1]= 100;
		System.out.println(a[1] + " : " + c[1]); // 결과 값 = 100 : 100
		System.out.println(a == c); // 주소 비교. 결과 값 = true 
		
	}

}
