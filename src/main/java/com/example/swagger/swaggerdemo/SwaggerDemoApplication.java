package com.example.swagger.swaggerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello Swagger!");
		SpringApplication.run(SwaggerDemoApplication.class, args);
	}
}
