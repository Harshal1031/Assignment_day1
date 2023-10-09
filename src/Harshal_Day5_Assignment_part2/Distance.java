package Harshal_Day5_Assignment_part2;

public class Distance {
    public static void main(String[] args) {
        int point1 = Utility.scannerint();
        int point2= Utility.scannerint(); 
        distance(point1,point2);
    }

    private static void distance(int x, int y) {
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("Distance from origin: "+distance);
    }

}
