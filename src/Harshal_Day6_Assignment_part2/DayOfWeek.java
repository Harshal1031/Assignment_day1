package Harshal_Day6_Assignment_part2;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Month");
        int month = sc.nextInt();
		System.out.println("Enter Day");
        int day = sc.nextInt();
		System.out.println("Enter Year");
        int year = sc.nextInt();
        dayOfWeek(month,day,year);

	}
    private static void dayOfWeek(int m, int d, int y) {
        y = y-(14-m)/12;
        int x = y+(y/4)-(y/100) + (y/400);
        m= m+12*((14-m)/12)-2;
        d=(d+x+(31*m)/12)%7;
      switch (d){
          case 0:
              System.out.println("Sunday");
              break;
          case 1:
              System.out.println("Monday");
              break;
          case 2:
              System.out.println("Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Thrushday");
              break;
          case 5:
              System.out.println("Firday");
              break;
          case 6:
              System.out.println("Saturday");
              break;
      }
    }
}
