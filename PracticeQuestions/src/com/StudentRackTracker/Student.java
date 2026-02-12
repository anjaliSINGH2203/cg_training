package com.StudentRackTracker;

public class Student {
	private int id;
	private String name;
	private int m1, m2, m3;
	
	public void setId(int id) {
		this.id= id;
		}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getTotal() {
		// TODO Auto-generated method stub
		return m1+m2+m3;
	}
	
	

}
