package ch08.unit05;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] num = {20, 15, 60,75, 85, 10, 60,40,50};
		
		System.out.println("정렬 전 : "+Arrays.toString(num));
		
		//SortInt ss = new SelectionSort();
		SortInt ss = new BubbleSort();
		ss.sort(num);
		
		System.out.println("정렬 후 : "+Arrays.toString(num));
		
	}

}

abstract class SortInt {
	
	private int[] value;
	
	// abstract : 추상 메소드
	// 하나의 추상 메소드가 있으면 무조건 class 는 추상 class가 되어야함.
	protected abstract void sorting();
	
	// 오버라이딩..한거..
	public void sort(int[] value) {
		this.value = value;
		sorting();
	}
	
	// 배열의 길이
	protected int length() {
		int n = -1;
		if(value != null) {
			n = value.length;
		}
		return n;
	}
	
	// 두 정수 비교
	protected final int compare(int i, int j) {
		return value[i]-value[j];
	}
	
	// 두 배열의 값 교환
	protected final void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}
	
	
}

class SelectionSort extends SortInt {

	@Override
	protected void sorting() {
		for(int i=0; i<length(); i++) {
			for(int j=0; j<length(); j++) {
				if(compare(i, j)> 0) {
					swap(i, j);
				}
			}
		}
	}
	
}

class BubbleSort extends SortInt {

	@Override
	protected void sorting() {
		boolean flag = true;
		
		for(int i=1; flag; i++) {
			flag = false;
			
			for(int j=0; j<length()-i; j++) {
				if(compare(j, j+1) > 0) {
					swap(j, j+1);
					flag = true;
				}
			}
		}
	}
	
}
