package com.spring_Jenkins.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {


	public static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("*************** test case is execution ");
		assertEquals(true,true);
	}

	@Test
	void contextLoads1() {
		logger.info("*************** test case 1  is execution ");
		assertEquals(true,true);
	}

	@Test
	void contextLoads2() {
		logger.info("*************** test case 2  is execution ");
		assertEquals(true,true);
	}

}
