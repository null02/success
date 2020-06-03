package com.qakj.springboot.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.qakj.springboot.dao.AccountDao;
@Repository
public class AccountDaoImpl implements AccountDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(String username,int money) {
		String sql = "update account set balance=balance+? where username=?";
		jdbcTemplate.update(sql, money,username);
	}

	@Override
	public void sub(String username,int money) {
		String sql = "update account set balance=balance-? where username=?";
		jdbcTemplate.update(sql, money,username);
	}

}
