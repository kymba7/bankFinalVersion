package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankMember kymbrlee = new BankMember();


        kymbrlee.deposit("checking",70000);
        kymbrlee.withdrawal("checking",60000);

        kymbrlee.deposit("savings",70000);
        kymbrlee.withdrawal("savings",90);

        System.out.println(kymbrlee);
    }

}
