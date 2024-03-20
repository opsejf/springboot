package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping("/action")
	public String Action(){
		return "THIS IS AN <h2> ACTION </h2>";
	}

	@GetMapping("/calculator")
	public int Calculator(){
		int a = 10;
		int b = 5;
		return a*b;
	}


	@GetMapping("/action/{number}")
	public String Action(@PathVariable int number){
		return "THIS IS <h2>" + (number*2) + " </h2>";
	}


//	@GetMapping("/action/{entry}")
//	public String Action(@PathVariable String entry){
//		return "THIS IS <h2>" + entry + " </h2>";
//	}

}
