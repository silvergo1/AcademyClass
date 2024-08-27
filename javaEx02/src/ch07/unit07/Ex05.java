package ch07.unit07;

import java.text.MessageFormat;

public class Ex05 {

	public static void main(String[] args) {

		String str = "이름 : {0}\t 전화 : {1}\t 나이 : {2}";
		Object[] obj = {"이자바", "010-1111-1111", 20};
		String s = MessageFormat.format(str, obj);
		System.out.println(s);
		System.out.println();
		
		// MessageFormat 에서 홑따옴표는 escape 이므로 '를 출력하기 위해서는 ''
		String sql = "INSERT INTO demo VALUES(''{0}'', ''{1}'', ''{2}'')";
		//String sql = "INSERT INTO demo VALUES('{0}', '{1}', '{2}')";
		Object[][] objs = {
				{"이자바", "010-1234-1234", 20},
				{"가자바", "010-0980-5675", 25},
				{"나자바", "010-0987-1234", 22}
		};
	for(int i=0; i<objs.length; i++) {
		String s2 = MessageFormat.format(sql, objs[i]);
		System.out.println(s2);
	}
	}

}
