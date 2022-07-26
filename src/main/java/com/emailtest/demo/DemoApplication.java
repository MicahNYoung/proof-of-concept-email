package com.emailtest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}

	public static void main(String[] args) {
		SendGridEmail.sendEmail("You didn't do your habit today.... X(");
	}

}
