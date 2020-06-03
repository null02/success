package com.qakj.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLog {
	Logger logger = LoggerFactory.getLogger(TestLog.class);
	@Test
	public void test(){
		
		//日志的级别；
		//由低到高   trace<debug<info<warn<error
		//SpringBoot默认给我们使用的是info级别的
		logger.trace("这是trace的日志");
		logger.debug("这是debug的日志");
		logger.info("这是info的日志");
		logger.warn("这是warn的日志");
		logger.error("这是error的日志");
		
	}

}
