package com.ExceptionTest;

public class AgeValidator {
	public static boolean validateAge(int age) {
		if(age>=18 && age<=60) {
			return true;
		}
		if(age<0) {
			throw new IllegalArgumentException("chup rho");
		}
		return false;
		
	}

}
