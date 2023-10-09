package com.oops3;

import Harshal_Day5_Assignment_part2.Utility;

class Rectangle implements Shape {
    private double length;
    private double width;

    @Override
    public void input() {
    	System.out.println("Enter the Length::");
         length = Utility.scannerdouble(); 
     	System.out.println("Enter the Width::");
        width = Utility.scannerdouble();
    }

    @Override
    public double area() {
        return length * width;
    }

}
