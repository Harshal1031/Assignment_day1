package com.oops;

public class TV {
    private String brand;
    private int size; 
    private double price;

    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculateDiscount() {
        if (size >= 32) {
            return 0.25 * price;
        } else {
            return 0; 
        }
    }

  
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Original Price: Rs.:" + price);
        double discount = calculateDiscount();
        System.out.println("Discounted Price: Rs.:" + (price - discount));
    }

}