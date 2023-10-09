package Harshal_Day6_Assignment;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumber_Q5 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        coupon(n);
    }

    private static void coupon(int n) {
        int count=0;
        Set set=new HashSet<>();
        Random r = new Random();
        while (set.size() <n) {
            count++;
            int x = r.nextInt(n);
            if (!set.contains(x)){
                set.add(x);

                System.out.println("The Unique Coupon  number is :- " + x);
            }

        }
        System.out.println("Total Coupon Number Genetrated :- "+count);

    }

}
