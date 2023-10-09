package com.oops3;

public class TestBank {

	public static void main(String[] args) {
        BankAcct acc = new BankAcct("8446555270", 10000.0);
        BankAcct.Interest in = acc.new Interest(5.0); 
            in.displayAccountInfo();

	}

}
