package com.qakj.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.springboot.dao.AccountDao;
import com.qakj.springboot.service.AccountService;
@Transactional
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public void transferAccounts(String user1, String user2, int money) {
		accountDao.sub(user1, money);
		int i = 10 / 0;
		accountDao.add(user2, money);
	}

}
