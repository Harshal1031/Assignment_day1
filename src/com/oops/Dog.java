package com.oops;

public class Dog {
    private String breed;
    private int age;
    private double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateAgeInHumanYears() {
        int humanAge;

        if (age <= 1) {
            humanAge = age * 15;
        } else if (age <= 2) {
            humanAge = 15 + (age - 1) * 9;
        } else {
            humanAge = 24 + (age - 2) * 5;
        }

        return humanAge;
    }

    public void printInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years (" + calculateAgeInHumanYears() + " in human years)");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Labrador", 3, 25.5);

        myDog.printInfo();
    }
}
