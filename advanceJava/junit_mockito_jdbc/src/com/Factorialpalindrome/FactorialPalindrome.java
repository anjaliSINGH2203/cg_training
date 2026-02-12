package com.Factorialpalindrome;

public class FactorialPalindrome {
	
	public boolean checkPalindrome(int num) {
		String s= num+ "";
		String rev= new StringBuilder(s).reverse().toString();
		return s.equals(rev);
	}
	
	public boolean checkPalindromeString(String s) {
		
		String rev= new StringBuilder(s).reverse().toString();
		return s.equals(rev);
	}
	
	
	public int factorial(int num) {
		int f=1;
		while(num!=0) {
			f*=num;
			num--;
		}
		return f;
	}
	
	public boolean loginValidation(String username, String password) {
		return ((username.equals("anjali")&& password.equals("Anjali@123")));
	}

}
