package com.Factorialpalindrome;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FactorialPalindromeTest {
	static FactorialPalindrome fp;
	
	@BeforeAll
	static void init() {
		fp= new FactorialPalindrome();
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"abcba","malyalam"})
	void testPalindrome(String s) {
		assertTrue(fp.checkPalindromeString(s));
	}
	

	@Test
	void testPalindromeStr() {
	    boolean res = fp.checkPalindrome(121);
	    assertTrue(res);
	}
	@Test
	void testNotPalindrome() {
	    boolean res = fp.checkPalindrome(123);
	    assertFalse(res);
	}
	
	@Test
	void testLoginValidaion() {
		boolean res= fp.loginValidation("anjali","Anjali@123");
		assertEquals(true,res);
		
	}


}
