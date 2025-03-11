package com.test.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiApplication {

	/**
	 * Launches the Spring Boot application.
	 *
	 * <p>This method serves as the main entry point for the application; it initializes the Spring context
	 * using AiApplication as the configuration class and passes any command-line arguments to it.</p>
	 *
	 * @param args the command-line arguments for the application
	 */
	public static void main(String[] args) {
		SpringApplication.run(AiApplication.class, args);
	}

}
