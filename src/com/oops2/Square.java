package com.oops2;

import java.util.Scanner;

public class Square {
    private int side;
    public void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the side:");
    	this.side=sc.nextInt();
    }
	public int getSide() {
		return side;
	}

}
