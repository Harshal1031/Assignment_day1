package Harshal_Day6_Assignment;

import java.util.Scanner;

public class ReverseNumber_Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
		 int temp=number;
		 int num2=0;
		 while(number>0) {
			 
			 int n=number%10;
			 num2=n+num2*10;
			 number=number/10;
			 
		 }
		System.out.println("Reverse of Number::"+num2);

		}

	}


