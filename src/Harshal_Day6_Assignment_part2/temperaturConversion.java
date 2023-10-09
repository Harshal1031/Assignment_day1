package Harshal_Day6_Assignment_part2;

import java.util.Scanner;

public class temperaturConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 1: for Celsius to Fahrenheit");
            System.out.println("Enter the 2: for Fahrenheit to Celsius");
            int num=sc.nextInt();
            switch(num) {
            case 1:
            	celsiusToFahrenheit();
            	break;
            case 2:
            	fahrenheitToCelsius();
            	break;
            	
            	default:
            		System.out.println("Invalid input");;
            	

            }


	}

	private static void fahrenheitToCelsius() {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit");
		double fahrenheit=sc.nextDouble();
		double celsius=(fahrenheit-32) * 5/9 ;
;
		System.out.println("the temperature in Celsius::"+celsius);

		
	}

	private static void celsiusToFahrenheit() {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius");
		double celsius=sc.nextDouble();
		double fahrenheit=(celsius * 9/5) + 32 ;
		System.out.println("the temperature in Fahrenheit::"+fahrenheit);

	}

}
