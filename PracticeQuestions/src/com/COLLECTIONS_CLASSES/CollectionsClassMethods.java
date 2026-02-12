package com.COLLECTIONS_CLASSES;

import java.util.*;

public class CollectionsClassMethods {
    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 1, 4, 5, 5)); // mutable

        for (Integer i : list) {
            int f = Collections.frequency(list, i);
            System.out.println(i + " - " + f);
        }

        System.out.println("Min: " + Collections.min(list));

        Collections.sort(list); // sort separately
        System.out.println("Sorted: " + list);

        int key = 4;
        int index = Collections.binarySearch(list, key);
        System.out.println("Index of " + key + ": " + index);
        
        Map<Integer,Integer>  map= new HashMap<>();
        for(int i: list) {
        	map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
