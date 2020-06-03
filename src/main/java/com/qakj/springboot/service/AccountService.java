package com.qakj.springboot.service;

public interface AccountService {
	//转账,user1向user2转账 money
	void transferAccounts(String user1,String user2,int money);
}
