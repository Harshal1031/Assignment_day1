package com.oops3;

public class BankAcct {
    private String accountNumber;
    private double balance;

    public BankAcct(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    class Interest {
        private double rate;

        public Interest(double rate) {
            this.rate = rate;
        }

        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("Interest Rate: " + rate + "%");
            double interestEarned = balance * rate / 100.0;
            System.out.println("Interest Earned: " + interestEarned);
        }
    }

}
