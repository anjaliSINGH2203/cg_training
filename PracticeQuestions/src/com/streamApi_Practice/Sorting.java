package com.streamApi_Practice;
import java.util.*;
/*Given: [5, 1, 2, 3, 4]
Return only first 2 numbers after sorting.*/

public class Sorting {
	public static void main(String args[]) {
		List<Integer>list= List.of(5, 1, 2, 3, 4);
		
		List<Integer> sortedList= list.stream().sorted().limit(2).toList();
		
		System.out.println(sortedList);
		
	}

}
