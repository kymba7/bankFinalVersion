package com.company.Model;

import com.company.BankAccount;

public class Savings extends BankAccount {
    public Savings ( String name, int id, String type, double balance ) {
        super(name, id, type, balance);
    }

    @Override
    public void withdrawal ( double amount ) {
        System.out.println("Withdrawal amount: $" + amount);
        if (balance < amount) {
            System.out.println("Insufficient funds.");

        } else {
            System.out.println("New Savings account balance: $" + (balance - amount));
        }
    }
}
