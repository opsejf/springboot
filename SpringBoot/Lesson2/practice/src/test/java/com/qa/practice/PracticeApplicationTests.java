package com.qa.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PracticeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void divideByThree(){
		Number number = new Number();
		for(int n=3; n<=100; n=n+3){
			assertEquals(number.label(n), "Fizz");

		}
//        if(i%3==0){
//            assertEquals(message="Fizz");
//        }


	}

}
