package com.batson_java_course_2021.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.batson_java_course_2021.Week_07.Calculator;

class CalculatorTest {

	//STATIC OBJECT AND VARIABLES FIRST
	//OBJECT REFERENCE THAT IS STATIC AND CREATED OUTSIDE THE CLASS SO IT CAN BE USED ANYWHERE
	static Calculator c0 = null; //OBJECT REFERENCE THAT POINTS TO NULL
		
	@BeforeAll
	static void setUpBeforeClass () throws Exception {
		c0 = new Calculator();  //CONSTRUCTOR CREATES THE OBJECT
		
	}
	
	@Test
	//<method>_should<what it returns>_Given<what it accepts>
	void add_ShouldReturnInt_Given_TwoInts() {
		assertEquals(c0.add(Integer.MIN_VALUE, Integer.MAX_VALUE), -1); 
		
	}
	
	@Test
	//<method>_should<what it returns>_Given<what it accepts>
	void subtract_ShouldReturnInt_Given_TwoInts() {
		int num1 = 4, num2 = 111;
		assertEquals(c0.subtract(num1,  num2), -107);
		
	}
	
	@Test
	
	void subtract_ShouldReturnInt_GivenTwoInts() {
		assertEquals(2, c0.subtract(4,  2));
	}
	
	@Test
	void compare_ShouldReturnBoolean_GivenTwoInts() {
		assertTrue(c0.compare(1 ,  1));
	}
}	
	
