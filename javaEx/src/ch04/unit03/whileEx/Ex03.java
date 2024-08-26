package ch04.unit03.whileEx;

public class Ex03 {

	public static void main(String[] args) {
		/*
		char c = 64;
		
		while(c++ < 'Z') {
			System.out.print(c + " "); //결과 값 = A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		}
		System.out.println();
		*/
		/*
		char c = 'A';
		
		while(c < 'Z') {
			c++;
			System.out.print(c + " "); //결과 값 = B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
		}
		System.out.println();
		*/
		/*
		char c = 'A';
	
		int n = 0;
		
		while(c < 'Z') {
			System.out.print(c + " ");
			
			//한 줄에 7개씩 결과 값을 보이게
			n++;
			if(n >=7) {
				n = 0;
				System.out.println();
			}
			
			c++;
		}
		System.out.println();
		*/
		
		char c = 'A';
		
		int n = 0;
		
		while(c < 'Z') {
			n++;
			System.out.print(c + (n%7==0?"\n":" "));
			c++;
		}
		System.out.println();

	}

}
