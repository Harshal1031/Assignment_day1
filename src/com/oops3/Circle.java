package com.oops3;

import Harshal_Day5_Assignment_part2.Utility;

public class Circle implements Shape {
    private double radius;

	@Override
	public void input() {
		System.out.println("Enter the Radius::");
		radius = Utility.scannerdouble();		
	}

	@Override
	public double area() {
		
        return Math.PI * radius * radius;
	}

}
