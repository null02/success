package com.qakj.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qakj.springboot.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTx {
	@Autowired
	private AccountService accountService;
	@Test
	public void test(){
		accountService.transferAccounts("tom", "jerry", 50);
	}
}
