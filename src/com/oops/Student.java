package com.oops;
//Write a Java program to create a class called "Student" with instance variables "name," "age," and "ID."
//Include a method to print the name and age of the student.
public class Student {
private String name;
private int age;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
   public void print(Student st) {
	System.out.println("Name of Strudent::"+st.name);
	System.out.println("Age of Strudent::"+st.age);
	System.out.println("Id of Strudent::"+st.id);
	//System.out.println("Name of Strudent::"+st.name);

}
}
