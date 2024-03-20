package com.qa.labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabsApplication.class, args);
	}

	@GetMapping("/hello")
	public String greeting() {
		return "Hello, World!";
	}




}
