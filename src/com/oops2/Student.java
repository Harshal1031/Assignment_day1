package com.oops2;

public class Student {
	private int id;
	private String name;
	static int counter=0;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		counter++;
	}
	

}
