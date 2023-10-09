package com.oops2;

import java.util.Scanner;

//1. Java Program to create a calculator and Return a Value from a Method.
//Explanation:
//We make a method named input which is used to get input from the user. We also make a method named add which is used 
//to perform addition and 
//return the result back to input method where we finally print the result.
public class Calculator {

	public static void main(String[] args) {
            input();
	}

	private static void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number1::");
        int num1=sc.nextInt();
        System.out.println("Enter the number2::");
        int num2=sc.nextInt();
        int ans=0;
        System.out.println("Enter :-1:Add\n2:Sub\n3:Mul\n4:Div");
        int action=sc.nextInt();
        switch(action) {
        case 1: ans=add(num1,num2);
        break;
        case 2: ans=Sub(num1,num2);
        break;
        case 3: ans=Mul(num1,num2);
        break;
        case 4: if(num2!=0) {
        	ans=Div(num1,num2);
        }else {
        	System.out.println("Invalid input");
        }
        break;
        default : System.out.println("Invalid entery");

        }
        System.out.println("Answer :"+ans);
        

	}

	private static int Div(int num1, int num2) {
		return num1/num2;
	}

	private static int Mul(int num1, int num2) {
		return num1*num2;
	}

	private static int Sub(int num1, int num2) {
		return num1/num2;
	}

	private static int add(int num1, int num2) {
		return num1+num2;
	}

}
