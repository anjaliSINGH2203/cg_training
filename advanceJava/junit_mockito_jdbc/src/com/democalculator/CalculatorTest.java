package com.democalculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculatorTest {
	static Calculator calculator;
	
	@BeforeAll
	static void init() {
		 calculator= new Calculator();
	}
	
	@Test
	void TestAdd() {
		
		int result= calculator.add(2, 3);
		assertEquals(5,result);
		
		
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,2,3",
		"5,5,10",
		"10,20,30"
	})
	void testAddition(int a, int b, int expected){
		assertEquals(expected, calculator.add(a, b));
	}
	
	@Test
	void shouldThrowExceptionWhenDividingByZero() {
		assertThrows(IllegalArgumentException.class,()->{
			calculator.divide(10,0);
		});
	}
	@Test
	void TestSubtract() {
		
		int result= calculator.subtract(5, 3);
		assertEquals(2,result);
		
		
	}
	@Test
	void TestDivide() {
		
		int result= calculator.divide(15, 3);
		assertEquals(5,result);
		
		
	}
	
	@Test
	void TestMultiply() {
	
		int result= calculator.multiply(2, 3);
		assertEquals(6,result);
		
		
	}
	

}
