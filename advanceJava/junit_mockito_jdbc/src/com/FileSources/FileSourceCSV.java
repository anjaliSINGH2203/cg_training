package com.FileSources;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.democalculator.Calculator;

public class FileSourceCSV {
	static Calculator c;
	
	@BeforeAll
	static void init() {
		c= new Calculator();
		
	}
	@ParameterizedTest
	@CsvFileSource(resources= "/addTestCases.csv",numLinesToSkip=0 )
	void checkAdd(int a, int b, int expected) {
		assertEquals(expected, c.add(a, b));
	}
	

}
