package com.streamApi_Practice;
import java.util.*;
/*Given: ["java", "spring", "sql"]
Convert all to uppercase.*/

public class ConverToUppercase {
	public static void main(String args[]) {
		List<String> list=  Arrays.asList("java", "spring", "sql");
		
		List<String> upperCaseList= list.stream().map(str-> str.toUpperCase()).toList();
		
		System.out.println(upperCaseList);
	}
	

}
