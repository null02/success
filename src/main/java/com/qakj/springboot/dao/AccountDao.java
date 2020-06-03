package com.qakj.springboot.dao;

public interface AccountDao {
	//加钱
	void add(String username,int money);
	//减钱
	void sub(String username,int money);
}
