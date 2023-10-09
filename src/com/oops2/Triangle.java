package com.oops2;

import java.util.Scanner;

public class Triangle {
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
