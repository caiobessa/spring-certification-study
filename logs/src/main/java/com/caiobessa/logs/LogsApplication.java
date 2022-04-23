package com.caiobessa.logs;


import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class LogsApplication implements CommandLineRunner {


	Logger logger = Logger.getLogger(LogsApplication.class.getSimpleName());

	public static void main(String[] args) {
		SpringApplication.run(LogsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("MY INFO LOG TEST");
	}
}
