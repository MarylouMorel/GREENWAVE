package com.back.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenwaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenwaveApplication.class, args);
		System.out.println("doc swagger disponible sur http://localhost:8080/swagger-ui/index.html");
	}

}
