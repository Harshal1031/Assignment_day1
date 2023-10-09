package com.oops3;

public class Outer {
   static int outerVar=10;
    static class Inner{
    	int innerVar=100;
    	public void show() {
            System.out.println("Outer Static Variable in inner class: " + outerVar);
            System.out.println("Inner Variable:  "+ innerVar);
    	}
    }
	public void show() {
        System.out.println("Outer Static Variable: " + outerVar);

	}

}
