package com.junit_basics.Employees;

 class Validator {
	public static boolean validateName(String name) {
		return name.length()>8;
	}
	public static boolean validateAge(int age) {
		if(age>=18 && age<=60) {
			return true;
		}
		return false;
		
	}
	public static boolean validate(String name, double monthlySalary, int age)
	        throws InvalidNameException, InvalidAgeException {

	    if (!validateName(name)) {
	        throw new InvalidNameException("Name is invalid");
	    }

	    if (!validateAge(age)) {
	        throw new InvalidAgeException("Age is invalid");
	    }

	    return true;
	}


}
