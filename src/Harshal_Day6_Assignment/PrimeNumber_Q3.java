package Harshal_Day6_Assignment;

import java.util.Scanner;

public class PrimeNumber_Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
      boolean isPrime = primeNumber(number);
      if(isPrime) {
      	System.out.println(number+" is a Prime  Number");
    }else {
     	System.out.println(number +" is Not a Prime  Number");
     }
        

	}

	private static boolean primeNumber(int number) {
           	for(int i=2;i*i<=number;i++) {
           		if(number%i==0) {
           			return false;
           		}
           	}
           	return true;
	}

}
