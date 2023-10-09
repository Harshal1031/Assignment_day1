package com.oops3;

import Harshal_Day5_Assignment_part2.Utility;

public class RectangleArea {
    public static void area(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of the Rectangle: " + area);
    }

    public static void main(String[] args) {

        System.out.print("Enter the length : ");
        double length = Utility.scannerdouble();
        System.out.print("Enter the breadth : ");
        double breadth = Utility.scannerdouble();
        area(length, breadth);
    }
}
