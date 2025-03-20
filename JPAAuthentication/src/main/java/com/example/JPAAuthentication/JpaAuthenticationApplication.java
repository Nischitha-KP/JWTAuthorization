package com.example.JPAAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.JPAAuthentication")
public class JpaAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAuthenticationApplication.class, args);
	}

}
