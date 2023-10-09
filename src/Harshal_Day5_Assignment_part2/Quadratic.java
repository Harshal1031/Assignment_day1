package Harshal_Day5_Assignment_part2;

public class Quadratic {
	public static void main(String[] args) {
        int num1 = Utility.scannerint();
        int num2 = Utility.scannerint();
        int num3 = Utility.scannerint();
        quadratic(num1,num2,num3);
    }

    private static void quadratic(int a, int b,int c) {
        double delta= (b*b) -(4*a*c);
        double square=Math.sqrt(delta);
        double root1 = -(b + square)/2*a;
        double root2= -(b - square)/2*a;

        System.out.println("Roots are : "+root1+"\n            "+root2);
    }
}
