package ch07.unit07;

import java.text.ChoiceFormat;

public class Ex04 {

	public static void main(String[] args) {
		
		double[] limits = {60,70,80,90}; // 적은 수에서 큰 수 순
		String[] grads = {"D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(limits, grads);
		System.out.println("95 : " + cf.format(95));
		System.out.println("85 : " + cf.format(85));
		System.out.println("55 : " + cf.format(55));
		System.out.println();
		
		double[] limits2 = {0,60,70,80,90}; // 적은 수에서 큰 수 순
		String[] grads2 = {"F","D","C","B","A"};
		ChoiceFormat cf2 = new ChoiceFormat(limits2, grads2);
		System.out.println("95 : " + cf2.format(95));
		System.out.println("85 : " + cf2.format(85));
		System.out.println("55 : " + cf2.format(55));
		System.out.println();
		
		//String p = "0#F|60#D|70#C|80#B|90#A";
		String p = "60#D|70#C|80<B|90#A";
		ChoiceFormat cf3 = new ChoiceFormat(p);
		System.out.println("95 : " + cf3.format(95));
		System.out.println("85 : " + cf3.format(85));
		System.out.println("80 : " + cf3.format(80));
		System.out.println("55 : " + cf3.format(55));
		System.out.println();
		
		// 95-> 4.5 / 90 -> 4.0 / 60 -> 1.0 / 0.0
		double[] limits3 = {0,60,65,70,75,80,85,90,95}; // 적은 수에서 큰 수 순
		String[] grads3 = {"0.0","1.0","1.5","2.0","2.5","3.0","3.5","4.0","4.5"};
		ChoiceFormat cf4 = new ChoiceFormat(limits3, grads3);
		System.out.println("95 : " + cf4.format(95));
		System.out.println("85 : " + cf4.format(85));
		System.out.println("55 : " + cf4.format(60));
		System.out.println("40 : " + cf4.format(40));
		System.out.println();
		
	}

}
