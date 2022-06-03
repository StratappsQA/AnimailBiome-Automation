package com.automation.animalbiome;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(App.class);

	      logger.debug("Debug Message Logged !!!");
	      logger.info("Info Message Logged !!!");
	      logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
	}
	

}
