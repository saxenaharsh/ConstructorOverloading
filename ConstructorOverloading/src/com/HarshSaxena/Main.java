package com.HarshSaxena;

import java.util.AbstractCollection;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Account account = new Account();
//        System.out.println(account.getCustomerName());
//        System.out.println(account.getCustomerPhone());
//        System.out.println(account.getCustomerEmail());
//        System.out.println(account.getNumber());
//        System.out.println(account.getBalance());
//
//        account.withdraw(200.00);
//        account.deposit(200.00);
//        account.withdraw(200.00);

//        Account tomsAccount = new Account("Tom Cruise", "+01-888-12345",
//                "tc@gmail.com", 7789651.0, 100);
//        System.out.println(tomsAccount.getCustomerName());
//        System.out.println(tomsAccount.getCustomerPhone());
//        System.out.println(tomsAccount.getCustomerEmail());
//        System.out.println(tomsAccount.getNumber());
//        System.out.println(tomsAccount.getBalance());
//
//        tomsAccount.withdraw(240);
//        tomsAccount.deposit(350.0);
//        tomsAccount.withdraw(240);
        
        Account jillsAccount = new Account("Jill Jenson", "01-222-987654", 
                "jj@gmail.com");
        System.out.println(jillsAccount.getCustomerName());
        System.out.println(jillsAccount.getCustomerPhone());
        System.out.println(jillsAccount.getCustomerEmail());
        System.out.println(jillsAccount.getNumber());
        System.out.println(jillsAccount.getBalance());

        jillsAccount.withdraw(200.00);
        jillsAccount.deposit(300.0);
        
    }
}
