package com.junit_basics.Employees;

 class Employee {
String name;
double monthlySalary;
int age;
public Employee(String name, double monthlySalary, int age) {
	super();
	this.name = name;
	this.monthlySalary = monthlySalary;
	this.age = age;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the monthlySalary
 */
public double getMonthlySalary() {
	return monthlySalary;
}
/**
 * @param monthlySalary the monthlySalary to set
 */
public void setMonthlySalary(double monthlySalary) {
	this.monthlySalary = monthlySalary;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}

	public double calculateAnnualSalary() {
		double annualSalary=getMonthlySalary()*12;
		if(age>=18 && age<= 50) {
			 annualSalary+=(0.06* annualSalary);
		}
		if(age>=51 && age<=60) {
			annualSalary+=(0.07* annualSalary);
		}
		return annualSalary;
	}

}
