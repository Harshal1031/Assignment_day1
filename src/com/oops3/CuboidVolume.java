package com.oops3;

import Harshal_Day5_Assignment_part2.Utility;

public class CuboidVolume {
    public static double calculateCuboidVolume() {
    	System.out.println("Enter the Lenght::");
        double length = Utility.scannerdouble(); 
    	System.out.println("Enter the Breadth::");
        double breadth = Utility.scannerdouble();
    	System.out.println("Enter the Height::");
        double height = Utility.scannerdouble();  

       
        double volume = length * breadth * height;

        return volume;
    }

}
