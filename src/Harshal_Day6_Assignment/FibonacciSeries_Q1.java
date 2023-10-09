package Harshal_Day6_Assignment;

import java.util.Scanner;

public class FibonacciSeries_Q1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series::");
        int num=sc.nextInt();
        fibonacciSeries(num);
        
	}

	private static void fibonacciSeries(int num) {
      int a=1;
      int b=1;
      int c=0;
      System.out.println("Fibonacci Series ::");
      System.out.print(a+" ");
      System.out.print(b+" ");
      for(int i=num-2;i>0;i--) {
    	  c=a+b;
    	  System.out.print(c+" ");
    	  a=b;
    	  b=c;
      }

	}

}
