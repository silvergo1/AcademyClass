package com.di;

public class User {
	
	private UserVO[] list;
	private int count;
	
	public User( ) {
		allocation(10);
	}
	
	private void allocation(int capcity) {
		
		UserVO[] temp = new UserVO[capcity];
		
		if(list != null && count > 0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		
		list = temp;
		
	}
	
	public int getCount() {
		return count;
	}
	
	public int append(UserVO vo) {
		if(count >= list.length) {
			allocation(list.length + 10);
		}
		list[count++] = vo;
		
		return count;
	}
	
	public UserVO[] listUser() {
		return list;
	}
	
}
