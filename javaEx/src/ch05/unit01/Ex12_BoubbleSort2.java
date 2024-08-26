package ch05.unit01;

public class Ex12_BoubbleSort2 {

	public static void main(String[] args) {
		
		// 개선된 Bubble Sort
		
		int []a = new int[] {20, 10, 8, 13, 17, 19, 16, 11, 22, 12};
		int t;
		
		System.out.print("source Data : ");
		for(int n:a) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		boolean flag = true;
		for(int i=1; flag; i++) {
			flag=false;
			for(int j=0; j<a.length-i; j++) {
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
				flag=true;
			}
		}
		
		System.out.print("Sort Data : ");
		for(int n:a) {
			System.out.print(n + " ");
		}
		System.out.println();
		
	}

}
