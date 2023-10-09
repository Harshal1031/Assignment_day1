package com.oops;

public class Phone {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }
    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
    }
    public double calculatePrice() {
        double basePrice = 20000.0; 
        double pricePerGB = 100;        
        return basePrice + (storage * pricePerGB);
    }


}
