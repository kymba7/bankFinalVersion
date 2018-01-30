package com.company.Model;

import com.company.BankAccount;

public class Checking extends BankAccount {
    public double OVERDRAFT_FEE = 35;


    public Checking ( String name, int id,String type,double balance ) {
        super(name,id, type,balance);
    }

    @Override

    public void withdrawal ( double amount ) {
        if (this.balance < amount) {
            balance = (balance - amount) - OVERDRAFT_FEE;
            System.out.println("Overdraft fee of " + OVERDRAFT_FEE);
            System.out.println("Your new checking account balance is " + balance);

        } else {
            System.out.println("Your new checking account balance is  " + (this.balance - amount));
        }
    }
}
