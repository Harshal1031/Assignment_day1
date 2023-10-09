package Harshal_Day6_Assignment_part2;

import Harshal_Day5_Assignment_part2.Utility;

public class Sqrt {

	public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        double c = Utility.scannerint();
        sqrt(c);
	}

	private static void sqrt(double c) {
        if (c<0){
            System.out.println("Invaliad Input");
        }
         double t = c;
        double epsilon=1e-15;

        while (Math.abs(t - c/t) > epsilon*t){
            t = (c/t+t)/2;
        }

        System.out.println("Square Root of "+c+" is = "+t);
		
	}

}
