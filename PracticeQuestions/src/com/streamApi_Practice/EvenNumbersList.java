package com.streamApi_Practice;

import java.util.*;

/*Given: [3, 10, 7, 8, 2]
Make a list of even numbers only.*/

public class EvenNumbersList {
	public static void main(String args[]) {
		List<Integer> list= List.of(3,10,7,8,2);
		
		List<Integer>evenList=list.stream().filter(x-> x%2==0).toList();
		
		System.out.println(evenList);
	}

}
