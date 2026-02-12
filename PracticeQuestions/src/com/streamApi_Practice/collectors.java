package com.streamApi_Practice;
import java.util.*;
import java.util.stream.Collectors;

public class collectors {
	public static void main(String args[]) {
		List<Integer> nums = List.of(1,2,2,3,3,3);
		
		Map<Integer,Integer> mapList= nums.stream().collect(Collectors.toMap(
				n->n,
				n->1,
				Integer :: sum));
		
		System.out.println(mapList);
		
		/*✅ Practice 2
Input:

List<String> names = List.of("Anjali","Aman","Riya","Rohit");
Group by first letter.

*/
		
		List<String> names = List.of("Anjali","Aman","Riya","Rohit");
		
		Map<Character, List<String>> res= names.stream().collect(Collectors.groupingBy(w-> w.charAt(0)));
		System.out.println(res);
		

	}

}
