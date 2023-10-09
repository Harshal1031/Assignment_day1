package com.oops;

public class TestPhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone("OnePlus", "Nord 3", 128);

        myPhone.printDetails();

        double price = myPhone.calculatePrice();
        System.out.println("Price: Rs. :" + price);
    }


}
