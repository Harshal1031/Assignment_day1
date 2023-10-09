package com.oops2;

import java.util.Scanner;

public class Cuboid {
    private int length;
    private int breadth;
    private int hight;
    public void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the lenght:");
    	this.length=sc.nextInt();
    	this.breadth=sc.nextInt();
    	this.hight=sc.nextInt();
    }
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	public int getHight() {
		return hight;
	}


}
