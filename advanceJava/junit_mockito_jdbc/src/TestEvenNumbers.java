import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
//import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.democalculator.Calculator;

public class TestEvenNumbers {
	static TestEvenNumbers c;
	
	@BeforeAll
	 static void init() {
		c= new TestEvenNumbers();
	}
	
	
	@ParameterizedTest
	@ValueSource(ints= {2,3,4,5,6})
	void checkEvenNumbers(int num) {
		assertTrue(c.checkEvenNumbers(num)) ;
	}

}
