package com.oops;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;
        if (material.equalsIgnoreCase("wooden")) {
            discount = 0.1 * price;
        } else if (material.equalsIgnoreCase("metal")) {
            discount = 0.05 * price;
        }
        return discount;
    }

    public void printDetails() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Original Price: Rs." + price);
        double discount = calculateDiscount();
        System.out.println("Discounted Price: Rs." + (price - discount));
    }

}
