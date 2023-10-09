package com.oops3;

public class ConstructorChaining {
    private int x;
    private int y;

    public ConstructorChaining() {
        this(20);
    }
    public ConstructorChaining(int x) {
        this.x = x;
        System.out.println("Value of x: " + x);
    }
    public ConstructorChaining(int x, int y) {
        this();
        this.x = x;
        this.y = y;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Sum of x and y: " + (x + y));
    }

}
