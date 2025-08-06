package com.satishlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstbootcicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstbootcicdApplication.class, args);
		System.out.println("Hello , Spring Boot CI/CD Pipeline...");
	}

}
