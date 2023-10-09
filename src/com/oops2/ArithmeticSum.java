package com.oops2;

public class ArithmeticSum {
    public static void main(String[] args) {
        System.out.println("Sum of two numbers: " + sum(5, 10));
        System.out.println("Sum of three numbers: " + sum(5, 10, 15));
        System.out.println("Sum of four numbers: " + sum(5, 10, 15, 20));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

}
