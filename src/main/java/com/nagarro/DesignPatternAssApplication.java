package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins="http://localhost:4200") 
@SpringBootApplication
@EnableScheduling
public class DesignPatternAssApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternAssApplication.class, args);
	}

}
