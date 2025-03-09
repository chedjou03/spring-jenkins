package com.spring_Jenkins.demo;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {


	public static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	@Order(1)
	void contextLoads() {
		logger.info("*************** test case 1 is execution ");
		assertEquals(true,true);
	}

	@Test
	@Order(2)
	void contextLoads2() {
		logger.info("*************** test case 2  is execution ");
		assertEquals(true,true);
	}

	@Test
	@Order(3)
	void contextLoads3() {
		logger.info("*************** test case 3  is execution ");
		assertEquals(true,true);
	}

	@Test
	@Order(4)
	void contextLoads4() {
		logger.info("*************** test case 4  is execution ");
		assertEquals(true,true);
	}

	@Test
	@Order(5)
	void contextLoads5() {
		logger.info("*************** test case 5 is execution ");
		assertEquals(true,true);
	}
}
