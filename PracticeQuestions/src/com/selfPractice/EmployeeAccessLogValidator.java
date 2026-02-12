package com.selfPractice;

import java.util.Scanner;

public class EmployeeAccessLogValidator {
	//EMP-<3 digits>#NAME:<employeeName>@DEPT:<department>&IN:<time>

	public boolean inputValidator(String input) {
		String data[]= input.split("[#@&]");
		if(data.length==4) return true;
		return false;
	}
	public boolean validateId(String idPart) {
		if(idPart!= null && idPart.startsWith("EMP-")) {
			String id= idPart.substring(4);
			if(id.matches("\\d{3}")) return true;
		}
		return false;
	}
	
	public boolean validateName(String namePart) {
		if(namePart!= null && namePart.startsWith("NAME:")) {
			String name= namePart.substring(5);
			if(name.matches("^[a-zA-Z]{4,}$")) return true;
		}
		return false;
	}
	
	public boolean validateDept(String deptPart) {
		if(deptPart!= null && deptPart.startsWith("DEPT:")) {
			String dept= deptPart.substring(5);
			if(dept.matches("^(HR|SALES|IT|FINANCE|ADMIN)$")) return true;
		}
		return false;
	}
	
	public boolean validateInTime(String inPart) {
		if(inPart!= null && inPart.startsWith("IN:")) {
			String in= inPart.substring(3);
			if(in.matches("^([01][0-9]|2[0-3]):[0-5][0-9]$")) return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine().trim();  //EMP-102#NAME:Anjali@DEPT:IT&IN:09:45
		
		EmployeeAccessLogValidator ob = new EmployeeAccessLogValidator();
		if(ob.inputValidator(input)) {
			String data[]= input.split("[#@&]");
			if(ob.validateId(data[0])) { //for id
				System.out.println("Employee Id :"+ data[0].substring(4));
			}else {
				System.out.println("Invalid Access Log");
				return;
			}
			
			if(ob.validateName(data[1])) { //for name
				System.out.println("Name :"+ data[1].substring(5));
			}else {
				System.out.println("Invalid Access Log");
				return;
			}
			
			if(ob.validateDept(data[2])) { //for dept
				System.out.println("Department :"+ data[2].substring(5));
			}else {
				System.out.println("Invalid Access Log");
				return;
			}
			
			if(ob.validateInTime(data[3])) { //for in time
				System.out.println("In Time :"+ data[3].substring(3));
			}else {
				System.out.println("Invalid Access Log");
				return;
				
			}
			
		}else {
			System.out.println("Invalid Access Log");
			return;
		}
		sc.close();
		
	}

}
