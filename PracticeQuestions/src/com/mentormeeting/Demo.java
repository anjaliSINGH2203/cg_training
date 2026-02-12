package com.mentormeeting;

import java.util.Arrays;
import java.util.List;

//"aaditya", "vidushi", "aman", "Anjali"
public class Demo {
	List<String>list= Arrays.asList("aaditya", "vidushi", "aman", "Anjali");
	
	List<String> res= list.stream().map(s-> s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()).toList());

}
