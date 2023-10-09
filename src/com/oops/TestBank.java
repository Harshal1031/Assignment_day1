package com.oops;

public class TestBank {

	public static void main(String[] args) {
         BankAccount b=new BankAccount();
         b.setAccountDetails(b);
         b.getAccountDetails(b);
         b.deposit(b);
         b.withdraw(b);
         BankAccount b2=new BankAccount();
         b2.setAccountDetails(b2);
         b2.getAccountDetails(b2);
         b2.deposit(b2);
         b2.withdraw(b2);
        // b.getAccountDetails(b);

	}
}
