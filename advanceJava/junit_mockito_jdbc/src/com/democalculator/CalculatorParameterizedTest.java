package com.democalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParameterizedTest {
	static Calculator c ;
	
	@BeforeAll
	static void init() {
		 c=  new Calculator();
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,2,3",
		"5,5,10",
		"10,20,30"
	})
	void testAddition(int a, int b, int expected){
		assertEquals(expected, c.add(a, b));
	}
	
	
	@ParameterizedTest
	@CsvSource({
		"20,10,10",
		"5,3,2"
	})
	void testSubtraction(int a, int b, int expected){
		assertEquals(expected, c.subtract(a, b));
	}
	

}
