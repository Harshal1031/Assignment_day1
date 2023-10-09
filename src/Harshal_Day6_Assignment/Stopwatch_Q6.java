package Harshal_Day6_Assignment;

import java.util.Scanner;

public class Stopwatch_Q6 {
    public static long start1;
    public static void start(){
        start1 =System.currentTimeMillis();
        System.out.println("Time is Started");
    }

    public static long stop(){
        long stop1= System.currentTimeMillis()-start1;
        System.out.println("Time is Stop");
        return stop1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter (1:-start) (2:-stop)");
            int x = sc.nextInt();
            switch (x){
                case 1:
                    start();
                    System.out.println("Start Timing :- 0 millisecond");
                    break;
                case 2:
                    stop();
                    long elcapsedtime = stop();
                    System.out.println("End Timing is : "+elcapsedtime+ " millisecond");
                    System.exit(0);
            }
        }

    }

}
