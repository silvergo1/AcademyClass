package com.util;

public class Ex_DateUtil {

	public static void main(String[] args) {

		DateUtil util = new DateUtil();
		
		String s = "200a-10-10";
		boolean b = util.isVaildDate(s);
		System.out.println(b);
		
	}

}
