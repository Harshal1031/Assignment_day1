package com.oops3;

public class TestInheritance {

	public static void main(String[] args) {
        SubClass sub = new SubClass(" Super Class", " Sub Class");
        System.out.println("Superclass : " + sub.getSuperString());
        System.out.println("Subclass : " + sub.getSubString());

	}

}
