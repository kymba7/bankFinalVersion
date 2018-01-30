package com.company;

public class BankAccount {
   public String name;
   public int id;
   public double balance;
   public String type;


    public BankAccount ( String name, int id, String type,double balance ) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("New balance: " + balance);
    }
    public void withdrawal(double amount){
        this.balance -= amount;
        System.out.println("New balance: " + balance);
    }

    @Override
    public String toString () {
        return name+ "'s account : " + id +" "+ type + this.balance;
    }
}
