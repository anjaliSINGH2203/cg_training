package com.junit_basics.Employees;

public class Main {
	public static void main(String args[]) {
		Employee emp= new Employee("Maria Francis",2000,18);
		Validator v= new Validator();
		try {
			if(v.validate("Maria Francis",2000,18)) {
				System.out.println("Employee Details:\nName: "+emp.name+"\nMonthlySalary: "+ emp.monthlySalary+ "\nAge: "+emp.age+ "\nAnnualSalary: ");
				System.out.print(emp.calculateAnnualSalary());
			}else {
				
			}
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		finally {
			return ;
			}
	}

}
