package com.oops2;

import java.util.Scanner;

public class Circle {
    private int radius;
    public void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the radius:");
    	this.radius=sc.nextInt();
    }
	public int getRadius() {
		return radius;
	}

}
