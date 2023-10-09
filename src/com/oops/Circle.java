package com.oops;

public class Circle {
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

	public static void main(String[] args) {
		
        Circle circle = new Circle(5.0);

        double area = circle.calculateArea();
        System.out.println("Area of the circle is: " + area);

        double circumference = circle.calculateCircumference();
        System.out.println("Circumference of the circle is: " + circumference);

	}

}
