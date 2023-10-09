package com.oops;

import java.util.Scanner;

public class BankAccount {
	private String name;
	private double balance;
//   private int accountNumber;
	static int accountNumber = 100;
	private int accountNumberOG = 0;

	public void setAccountDetails(BankAccount bank) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Account Holder Name::");
		bank.name = sc.next();
		System.out.println("Enetr the Amount to Deposit ::");
		bank.balance = sc.nextDouble();
		bank.accountNumberOG = ++BankAccount.accountNumber;
		// System.out.println("Account Number ::"+BankAccount.accountNumb);

	}

	public void getAccountDetails(BankAccount bank) {
		System.out.println("Account Holder Name::" + bank.name);
		System.out.println("Balance ::" + bank.balance);
		System.out.println("Account Number ::" + bank.accountNumberOG);

	}

	public void deposit(BankAccount bank) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr the Amount to Deposit ::");
		double amount = sc.nextDouble();
		bank.balance = bank.balance + amount;
		System.out.println("updated balance ::" + bank.balance);

	}

	public void withdraw(BankAccount bank) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr the Amount to Withdraw ::");
		double amount = sc.nextDouble();
		if (amount < bank.balance) {
			bank.balance = bank.balance - amount;
			System.out.println("updated balance ::" + bank.balance);

		} else {
			System.out.println("Insufficient Balance");
		}

	}

}
