package Harshal_Day5_Assignment_part2;

import java.util.Scanner;

public class Utility {
    public static String scannerString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }
    public static int scannerint(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }
    public static char scannerchar(){
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        return x;
    }
    public static double scannerdouble(){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        return x;
    }

}
