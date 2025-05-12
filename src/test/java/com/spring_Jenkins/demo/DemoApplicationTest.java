package com.spring_Jenkins.demo;

import com.spring_Jenkins.demo.model.Client;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationTest {


	public static Logger logger = LoggerFactory.getLogger(DemoApplicationTest.class);

	@Test
	@Order(1)
	void contextLoads() {
		logger.info("*************** test case 1 is execution ");
		Client c = new Client();
		c.setId(100);
		System.out.println("Client ID: " + c.getId());
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


	@Test
	@Order(6)
	void contextLoads6() {
		logger.info("*************** test case 6 is execution ");
		assertEquals(true,true);
	}

	@Test
	@Order(7)
	void contextLoads7() {
		logger.info("*************** test case 7 is execution ");
		assertEquals(true,true);
	}

	@Test
	@Order(8)
	void contextLoads8() {
		logger.info("*************** test case 8 is execution ");
		assertEquals(true,true);
	}


	@Test
	@Order(9)
	void contextLoads9() {
		logger.info("*************** test case 9 is execution ");
		assertEquals(true,true);
	}

	@Test
	@Order(10)
	void contextLoads10() {
		logger.info("*************** test case 10 is execution ");
		assertEquals(true,true);
	}

	@Test
	@Order(11)
	void contextLoads11() {
		logger.info("*************** test case 11 is execution ");
		assertEquals(true,true);
	}


	@Test
	@Order(12)
	void contextLoads12() {
		logger.info("*************** test case 12 is execution ");
		assertEquals(true,true);
	}
}
