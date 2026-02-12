package com.COLLECTIONS_CLASSES;

import java.util.*;;

public class EmployeeComparator implements Comparable<EmployeeComparator> {
	String name;
	int id;
	
	public EmployeeComparator( int id,String name) {
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		return "ID: "+ id+ ", NAME: "+name;
	}

	
	public int compareTo(EmployeeComparator e) {
		return this.id- e.id;
	}
	
	public static void main(String args[]) {
		List<EmployeeComparator> list= Arrays.asList(
				new EmployeeComparator(1, "Puru"),
				new EmployeeComparator(5, "Lomad"),
				new EmployeeComparator(3, "Prateek"),
				new EmployeeComparator(2, "Patanjali")
				);
		Collections.sort(list);
		Iterator<EmployeeComparator> it= list.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());   // prints EmployeeComparator using toString()
		}
		System.exit(0);

		
	}
	
}
	
	


