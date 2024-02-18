package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 1. Develop a Spring Boot Application to print the following message; 
***********WELCOME TO SPRING BOOT *************** */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("**********WELCOME TO SPRING BOOT ***************");
	}

}
