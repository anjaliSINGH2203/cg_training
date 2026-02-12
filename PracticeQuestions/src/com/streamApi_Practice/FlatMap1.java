package com.streamApi_Practice;
/*Flatten this:

List<List<String>> list = List.of(
    List.of("a", "b"),
    List.of("c", "d")
);*/

import java.util.*;

public class FlatMap1 {
	public static void main(String args[]) {
		List<List<String>> list=List.of(
				 List.of("a", "b"),
				    List.of("c", "d")
				);
		
		System.out.println(list.stream()
				.flatMap(l->l.stream())
				.toList()
				);
		
		
		List<String> data = List.of("1,2", "3,4", "5");
		System.out.println(data.stream().flatMap(l->Arrays.stream(l.split(","))).toList());
		
		
		/*Given:

List<Optional<Integer>> list =
    List.of(Optional.of(1), Optional.empty(), Optional.of(3));
Output:

[1, 3]*/
		
		
		List<Optional<Integer>> list2= List.of(Optional.of(1), Optional.empty(), Optional.of(3));
		
		List<Integer> res= list2.stream().flatMap(Optional :: stream).toList();
		System.out.println(res);

				
	}

}
