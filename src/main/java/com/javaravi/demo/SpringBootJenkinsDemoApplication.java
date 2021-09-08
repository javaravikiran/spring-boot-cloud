package com.javaravi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.javaravi.*")
public class SpringBootJenkinsDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsDemoApplication.class, args);
	}

}
