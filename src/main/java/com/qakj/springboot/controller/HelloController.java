package com.qakj.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		
		String sql = "insert into users(username,password) values(?,?)";
		jdbcTemplate.update(sql, "李四","123456");
		
		return "helloWorld";
	}
}
