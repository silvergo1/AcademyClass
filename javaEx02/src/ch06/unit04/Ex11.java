package ch06.unit04;

public class Ex11 {

	public static void main(String[] args) {
		
		//Test11 t = new Test11(); //컴파일 오류. 생성자가 private 이기 때문에
		
		Test11 t1 = Test11.getInstance();
		Test11 t2 = Test11.getInstance();
		// 객체 한번 생성.
		// why? t1 에서 getInstance() 실행. tt 초기값 null
		// 따라서 if문 실행. tt = null 값이 아니게 됨.
		// t2는 tt = null 이 아니므로 if문 실행 x
		// 따라서 객체 생성이 되지 않음.
		
		t1.add();
		t1.add();
		t1.add();
		
		int n = t2.add();
		System.out.println(n); // 결과 값 = 4
		
	}

}
// singleton 패턴 : 하나의 객체만 생성
class Test11 {
	
	private static Test11 tt = null;
	
	private int num = 0;
	
	private Test11() {
		
	}
	
	public static Test11 getInstance() {
		if(tt == null) {
			tt = new Test11();
		}
		return tt;
	}
	
	public int add() {
		return ++num;
	}
	
	public int sub() {
		return --num;
	}
	
}
