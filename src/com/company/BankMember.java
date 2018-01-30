package com.company;

import com.company.Model.Checking;
import com.company.Model.Savings;

public class BankMember {
    Checking checkingAcount;
    Savings savingsAccount;
    boolean ask = true;
    boolean ask1 = false;

    public BankMember () {
        this.checkingAcount = new Checking("Kymbrlee", 1234, "Checking Account", 0);
        this.savingsAccount = new Savings("Kymbrlee", 1234, "Saving Account", 0);

    }

    public void deposit ( String type, double amount ) {
        if (type.equals("checking")) {
            checkingAcount.deposit(amount);
        } else if (type.equals("savings")) {
            savingsAccount.deposit(amount);
        }
    }

    public void withdrawal ( String type, double amount ) {
        if (type.equals("checking")) {
            checkingAcount.withdrawal(amount);
        } else if (type.equals("savings")) {
            savingsAccount.withdrawal(amount);
        }

    }




    @Override
    public String toString () {
        return checkingAcount.name + "'s account : " + checkingAcount.id + " " + checkingAcount.balance;

    }


}

