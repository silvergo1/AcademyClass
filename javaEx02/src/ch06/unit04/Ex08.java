package ch06.unit04;

public class Ex08 {

	public static void main(String[] args) {

		Test8 t = new Test8();
		
		t.numberD();
		
		System.out.println("년도를 인수로 넘겨 받아 띠 구하기");
		t.year(200);
		
		System.out.println("문자를 인수로 넘겨 받아 ASCII 코드 구하기");
		t.lettercode('f');
		
		System.out.println("ASCII 코드를 인수로 넘겨 받아 ASCII 코드에 해당하는 문자 구하기");
		t.codeNumber(100);
		
		System.out.println("로또 1게임을 반환하는 메소드");
		t.lotto();
		
	}

}

class Test8{
	
	//서로 다른 3자리 수 만들기 102~987
	public void numberD () {
		
		//자리수 비교.. 1의자리 10의자리 100의자리
		//한자리씩 비교한다면...?
		//if문을.. 여러개?
		//배열.. 3개... 3자리..?
		
	}
	
	//년도를 인수로 넘겨 받아 띠 구하기
	public void year(int y) {
		
		String[]tti = new String[] {"원숭이","닭","개", "돼지", "쥐", "소", "호랑이","토끼","용","뱀","말","양"};
		
		System.out.println(y+"년은 "+tti[y%12]+"띠 입니다\n");
		
	}
	//정수를 인수로 넘겨받아 정수 길이 구하기
	public void numberLength(int n) {
		
		//길이..length...
		//3자리수 4자리수..
		//얘도 배열로..?
		//배열로 어떻게? eq[0], eq[1], eq[2]...하게 되면..
		// eq+1이 자리수..?
		//길이를.. 어떻게.. 구하지....
		
	}
	
	//문자를 인수로 넘겨 받아 ASCII 코드 구하기
	public void lettercode(char l) {
		
		int n = (char)l;
		
		System.out.println(n+"\n");
		
	}
	
	//ASCII 코드를 인수로 넘겨 받아 ASCII 코드에 해당하는 문자 구하기
	public void codeNumber(int c) {
		
		if((c>=65 && c<=90)||(c>=97&&c<=122)) {			
			System.out.printf("%c\n\n",c);
		}else {
			System.out.println("65~90, 97~122 사이의 숫자를 입력하세요\n");
		}
		
		
	}
	
	//로또 1게임을 반환하는 메소드
	public void lotto() {
		
		int[] num = new int[6];
		
		for(int i=0; i<6; i++) {
			num[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--; 
					break;
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(num[i] + " ");
		}
		
	}
	
	
}
