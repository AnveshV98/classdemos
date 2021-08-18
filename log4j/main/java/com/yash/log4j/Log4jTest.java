package com.yash.log4j;

import org.apache.log4j.Logger;

public class Log4jTest {

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(Log4jTest.class);
		logger.debug("This is debug :" + "parameter/exception object");
		logger.info("This is debug :" + "parameter/exception object");
		logger.warn("This is debug :" + "parameter/exception object");
		logger.error("This is debug :" + "parameter/exception object");
		logger.fatal("This is debug :" + "parameter/exception object");
		
	
	
	}

}
