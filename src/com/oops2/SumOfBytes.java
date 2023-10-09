package com.oops2;

import java.util.Scanner;

public class SumOfBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first byte value: ");
        byte b1 = scanner.nextByte();
        System.out.print("Enter the second byte value: ");
        byte b2 = scanner.nextByte();
        int sum = (int) b1 + (int) b2;
        System.out.println("Sum of " + b1 + " and " + b2 + " is: " + sum);
    }

}
