package ch05.unit02;

import java.util.Scanner;

/*
	-	인원수(1이상)를 입력 받아 입력 받은 인원수 만큼의
		이름, 국어, 영어, 수학 점수를 입력 받아 총점, 평균, 석차 구하기
	
*/

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		String[]name;
		int[][] score;
		//score 안에 tot과 rank 할당 가능..
		//하지만 지금 시점에서 계산이 복잡해져서 밖으로 뺌.
		int[] tot;
		int[] rank;
		String[] title = new String[] {"국어", "영어", "수학"};
		
		do {
			System.out.print("인원 수 ? ");
			count=sc.nextInt();
		} while(count<1);
		
		//메모리 할당
		name = new String[count];
		score = new int[count][3];
		tot = new int[count]; //평균만 계산하면 총점 안잡아도 되는데 석차를 계산할려면 총점이 필요.
		rank = new int[count];
		
		//데이터 입력 및 총점 계산
		for(int i=0; i<count; i++) {
			
			System.out.print("이름 ? ");
			name[i]=sc.next();
			
			for(int j=0; j<score[i].length; j++) {
				System.out.print(title[j] + "?");
				score[i][j] = sc.nextInt();
				
				tot[i] += score[i][j];
			}
			
		}
		
		//석차 계산 (석차 계산 할때는 초기값 무조건 1. 1등은 항상 존재)
		for(int i=0; i<count; i++) {
			rank[i] = 1;
		}
		
		for(int i=0; i<count-1; i++) {
			for(int j=i+1; j<count; j++) {
				if(tot[i]>tot[j]) {
					rank[j]++;
				}else if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
		}
		
		
		//출력
		for(int i=0; i<count; i++) {
			
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(tot[i]+"\t");		//총점
			System.out.print((tot[i]/3)+"\t");	//평균
			System.out.println(rank[i]);		//석차
		}
		
		sc.close();

	}

}
