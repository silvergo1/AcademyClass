package ch06.unit03;

public class Ex05 {

	public static void main(String[] args) {
		
		Test5 t = new Test5();
		int[] aa = {1,3,5};
		int a = 5;
		
		t.sub1(a);
		System.out.println("sub1() 호출 후 a:" + a); // 결과 값 = sub1() 호출 후 a:5
		
		t.sub2(t); //리퍼런스 변수. 참조(주소) 값을 가지고 있음
		System.out.println(t.x); // 결과 값 = 110
		
		t.sub3(t);
		System.out.println(t.x); // 결과 값 = 110
		
		t.sub4(aa);
		System.out.println(aa[1]); // 결과 값 = 103
		
	}

}

//파라미터 전달 방법
class Test5 {
	
	int x = 10;
	
	// call by value
	public void sub1(int a) {
		a+=10;
	}
	
	// call by reference(객체)
	public void sub2(Test5 tt) {
		tt.x += 100;
	}
	
	// call by value
	public void sub3(Test5 tt) {
		tt = null;
	}
	
	// call by reference(배열)
	public void sub4(int[] n) {
		n[1]+=100;
	}
	
}
