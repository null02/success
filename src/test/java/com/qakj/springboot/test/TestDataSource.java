package com.qakj.springboot.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDataSource {
	@Autowired
	private DataSource dataSource;
	@Test
	public void test() throws Exception{
		System.out.println("-----"+dataSource.getClass());
	}
	
	
}
