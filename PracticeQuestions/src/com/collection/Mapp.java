package com.collection;
import java.util.*;
import java.util.stream.Collectors;

public class Mapp {
	public static void main(String args[]) {
		List<Integer> list= Arrays.asList(10,8,8,5,20,30,78,90);
		Map<Integer,Integer> map= new HashMap<>();
		for(Integer l :list) {
			map.put(l, map.getOrDefault(l,0)+1);
			
		}
		System.out.println(map);
		System.out.println(map.entrySet() );
		System.out.println(map.keySet());
		//System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue.getKey()));
		System.out.println(
			    Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey()
			);
		
		Map<Integer,Integer> map1= list.stream().collect(Collectors.toMap(
				n->n,
				n->1,
				Integer::sum));
		System.out.println(map1);
	}
	

}
