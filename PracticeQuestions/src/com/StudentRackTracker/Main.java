package com.StudentRackTracker;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		List<Student> students= new ArrayList<>();
		StudentService service= new StudentService();
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Anjali");
		s1.setM1(85);
		s1.setM2(90);
		s1.setM3(88);
		
		//Student s2 = new Student();
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Bobby");
		s2.setM1(90);
		s2.setM2(92);
		s2.setM3(89);

		Student s3 = new Student();
		s2.setId(103);
		s2.setName("Lucky");
		s2.setM1(100);
		s2.setM2(92);
		s2.setM3(89);
		
		List<Student> list =new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		service.addStudents(students,s1);
		 service.addStudents(students, s2);
	        service.addStudents(students, s3);
	        
	        int n=2;
	        List<Student> topStudent= service.getTopN(students, n);
	        System.out.println("Tiop "+n+ " Students:");
	        for(Student s: topStudent) {
	        	System.out.println("ID: "+s.getId()+
	        			", Name: "+ s.getName()+
	        			", Total: "+ s.getTotal()
	        			);
	        }
		


		
	}

}
