package com.oops3;

public class TestShape {

	public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.input();
        System.out.println("Area of Circle: " + circle.area());

        rectangle.input();

        System.out.println("Area of Rectangle: " + rectangle.area());

	}

}
