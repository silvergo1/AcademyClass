package ch05.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int t, max, min;
		
		t=0;
		//for 문 안에서 합계 구할 수 있음.
		for(int i=0; i<score.length; i++) {
			
			do {
				System.out.print((i+1) + "번째 점수 : ");
				score[i] = sc.nextInt();
			} while(score[i] < 0 || score[i] > 10);
			
			t +=score[i];
			
		}
		
		//
		max = min = score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}else if(min > score[i]) {
				max = score[i];
			}
		}
		
		t = t - max - min;
		
		System.out.print("점수 리스트 : ");
		for (int n:score) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("취득 점수 : " + t);
		
		sc.close();

	}
}
