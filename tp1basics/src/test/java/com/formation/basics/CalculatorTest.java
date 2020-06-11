package com.formation.basics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.formation.customer.service.Calculator;

public class CalculatorTest {
	
	private static int  x;
	private static int  y;
	
	@BeforeAll
	// 1 Setup
	public static void init(){
		//init  All
		System.out.println("Before All init() method called");
		x = 18;
		y = 27;
	}
	
	
	@Test
	@DisplayName("Add operation test")
	public void addNumber() {
		
		//Init //local
		//TODO 
		System.out.println("Init for   addNumber() ...");
		
		//Call  Service // reponse
		//2.  Run  Exercise
		System.out.println("Call Service / Response  ...");
		int resultactual = Calculator.add(x, y);
		
		//Assertions.assertEquals(expected ,resultactual , "Message");
		System.out.println("Assertions  Add...");
		// 3.  Verify
		Assertions.assertEquals(45,resultactual , "18 + 27 should equal 45");
	}
	
	
	@Test
	@DisplayName("Multiply operation test")
	public void multiplyNumber() {
		
		//Init //local
		//TODO
		System.out.println("Init for   multiplyNumber() ...");
		
		//Call  Service // reponse
		//2.  Run  Exercise
		System.out.println("Call Service / Response  ...");
		int resultactual = Calculator.multiply(x, y);
		
		//Assertions.assertEquals(expected ,resultactual , "Message");
		System.out.println("Assertions  Add...");
		// 3.  Verify
		Assertions.assertEquals(486,resultactual , "18 * 27 should equal 486");
	}
	
	
	
	//TODO  / Test  subtract x, y
	@Test
	@DisplayName("Subtract operation test")
	public void subtractNumber() {
		
		//Init //local
		//TODO
		System.out.println("Init for   Subtract() ...");
		
		//Call  Service // reponse
		//2.  Run  Exercise
		System.out.println("Call Service / Response  ...");
		int resultactual = Calculator.subtract(x, y);
		
		//Assertions.assertEquals(expected ,resultactual , "Message");
		System.out.println("Assertions  Subtract...");
		// 3.  Verify
		//Assertions.assertEquals(expected ,resultactual , "Message");
		Assertions.assertEquals(-9,resultactual , "18 - 27 should equal -9");
	}
	
	@AfterAll
	public static void cleanUp(){
		//4. Clean  Terndown
		System.out.println("After All cleanUp() method called");
	}


}
