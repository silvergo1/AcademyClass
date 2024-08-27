package com.di;

import java.util.Scanner;

// DI: Dependency Injection(의존성 주입)
public class UserUI {

	private Scanner sc = new Scanner(System.in);
	
	// 객체에 null 값을 넣거나, 장기간 사용하지 않을때 끝남
	private User user = new User();
	
	private UserDisplay disp;
	
	public UserUI() {
		// 생성자를 이용한 의존성 주입
		disp = new UserDisplay(user);
		
	}
	
	public void menu() {
		
		int ch;
		
		while(true) {
			do {
				System.out.print("1.입력 2.출력 3. 종료 => ");
				ch = sc.nextInt();
			} while(ch < 1|| ch>3);
			
			if(ch==3) {
				return;
			}
			
			switch(ch) {
			case 1: input(); break;
			case 2: print(); break;
			}
		}
		
	}
	
	public void input() {
		
		System.out.println("\n데이터 입력");
		
		UserVO vo = new UserVO();
		
		System.out.print("이름 ?");
		vo.setName(sc.next());
		
		System.out.print("나이 ?");
		vo.setAge(sc.nextInt());
		
		user.append(vo);
		
		System.out.println("입력 완료\n");
		
	}
	
	protected void print() {
		
		System.out.println("\n데이터 출력");
		
		disp.printAll();
		
		System.out.println();
		
	}
	
}
