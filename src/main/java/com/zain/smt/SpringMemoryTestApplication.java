package com.zain.smt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMemoryTestApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringMemoryTestApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Application started");
		SpringApplication.run(SpringMemoryTestApplication.class, args);
	}

}
