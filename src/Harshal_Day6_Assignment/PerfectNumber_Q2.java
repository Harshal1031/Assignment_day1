package Harshal_Day6_Assignment;

import java.util.Scanner;

public class PerfectNumber_Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        perfectNumber(number);
    }

    public static void perfectNumber(int num) {

        int sum = 0; 

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
            	sum=sum+i;
            }
    }
        if(sum==num) {
        	System.out.println(num+" is a Perfect Number");
        }else {
        	System.out.println(num +" is Not a Perfect Number");
        }

}
}
