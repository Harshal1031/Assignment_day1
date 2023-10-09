package com.oops2;
//Enter length and breadth of the rectangle as input.--done
//After that we create an object of that class and pass the reference variable to two different methods.
//Now we calculate the area for two different objects and return them to the main method. 
//Hence we get two different areas as output.
import java.util.Scanner;

public class Rectangle {
    private int length;
    private int breadth;
    public void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the lenght:");
    	this.length=sc.nextInt();
    	this.breadth=sc.nextInt();
    }
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
}
