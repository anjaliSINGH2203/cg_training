package com.junit_basics.Employees;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestEmp {

    @Test
    void validateNameValidTest1() {
        boolean result = Validator.validateName("Sam Johns");
        assertTrue(result);
    }
    @Test
    void validateNameInvalidTest1() {
    	boolean result= Validator.validateName("Jonathan");
    	assertFalse(result);
    }
    @Test
     void validateAgeValidTest1() {
    	boolean result= Validator.validateAge(18);
    	assertTrue(result);
    }
    @Test
    void validateAgeInValidTest1() {
   	boolean result= Validator.validateAge(17);
   	assertFalse(result);
   }
    
    @Test
    void validateInvalidNameTest() throws InvalidNameException{
    	assertThrows(InvalidNameException.class,()->{
    		Validator.validate("Maria", 2000, 25);
    	});
    }
    
    @Test
    void validateInvalidAgeTest() throws InvalidNameException{
    	assertThrows(InvalidNameException.class,()->{
    		Validator.validate("Maria", 2000, 25);
    	});
    }
    @Test
    void calculateAnnualSalaryValidTest1()  {
    		Employee emp = new Employee("Maria Francis", 2000,18 );
    		double annualSalary= emp.calculateAnnualSalary();
    		assertEquals(25440.0, annualSalary);
    		}
	
}
