package com.oops;

public class Shirt {
    private String size;
    private String color;
    private double price;

    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;
        if (size.equalsIgnoreCase("XL")) {
            discount = 0.1 * price;
        } else if (size.equalsIgnoreCase("L")) {
            discount = 0.05 * price;
        }
        return discount;
    }

    public void printDetails() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Original Price: Rs." + price);
        double discount = calculateDiscount();
        System.out.println("Discounted Price: Rs." + (price - discount));
    }

}
