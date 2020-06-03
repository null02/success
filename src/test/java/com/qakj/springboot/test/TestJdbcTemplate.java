package com.qakj.springboot.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJdbcTemplate {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Test
	public void test(){
		//配置了那个数据源就默认用那个数据源,可以获取数据源
		System.out.println(jdbcTemplate.getDataSource().getClass());
	}
	/*
	 * 相关方法:
	 * 				update(String sql,Object... args):更新的方法
					batchUpdate(String sql,List<Object[]> batchArgs):批量更新的方法	
					queryForObject(String sql, RowMapper rowMapper, Object... args):查询一条记录
					query(String sql, RowMapper rowMapper, Object... args) :查询多条记录
					queryForObject(String sql, Class requiredType):查询单值
	 */
	@Test
	public void test2(){
		String sql = "insert into users(username,password) values(?,?)";
		jdbcTemplate.update(sql, "张三","123456");
	}
	@Test
	public void test3(){
		String sql = "insert into users(username,password) values(?,?)";
		List<Object[]> list=new ArrayList<Object[]>();
		list.add(new Object[]{"ad","123"});
		list.add(new Object[]{"aa","223"});
		list.add(new Object[]{"bb","134323"});
		
		jdbcTemplate.batchUpdate(sql, list);
	}
	@Test
	public void test4(){
		String sql="select * from users where id=?";
		User user=jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
		System.out.println(user);
	}

	@Test
	public void test5(){
		String sql="select * from users where id > ?";
		List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class),1);
		System.out.println(users);
	}
	
	@Test
	public void test6(){
		String sql="select count(*) from users";
		Integer count=jdbcTemplate.queryForObject(sql, int.class);
		System.out.println(count);
	}
	
	
}
