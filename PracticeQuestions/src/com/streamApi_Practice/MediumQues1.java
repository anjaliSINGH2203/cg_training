package com.streamApi_Practice;

/*Write stream code for:

Input: [1,2,3,4,5,6]

Output: [40, 60]

Rule:
✅ keep only even numbers → multiply by 10 → keep only values > 30*/

import java.util.*;

public class MediumQues1 {
	public static void main(String args[]) {
		List<Integer> list= List.of(1,2,3,4,5,6);
		
		List<Integer> manipulatedList= list.stream().filter(n-> n%2==0).map(n-> n*10).filter(n->n>30).toList();
		
		System.out.println(manipulatedList);
		
		List<List<Integer>> list1 = List.of(
			    List.of(1, 2),
			    List.of(3, 4)
			);
		System.out.println(list1.stream()
	    .map(l -> l.stream().map(n->n).toList())  //without flatMap
	    .toList()
);
	


	}

}
