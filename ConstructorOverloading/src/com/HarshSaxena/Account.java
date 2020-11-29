package com.HarshSaxena;

public class Account {
    public String customerName;
    public String customerPhone;
    public String customerEmail;
    public double number;
    public double balance;

    public Account(){
        this("Bobby Brown", "+01-888- 123456", "bb@gmail.com", 7896543.0, 100.00);
        System.out.println("Empty constructor called");
    }

    public Account(String customerName, String customerPhone, String customerEmail, double number, double balance) {
        System.out.println("Account constructor called");
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.number = number;
        this.balance = balance;
    }

    public Account(String customerName, String customerPhone, String customerEmail){
        this(customerName, customerPhone, customerEmail, 7896543.0, 700 );
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;


    }

    public void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Withdrawal cannot be processed due to insufficient balance");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("The withdrawal amount is " + withdrawAmount + "₹" + "\n"
            + "The new balance is " + this.balance + "₹");
        }
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Amount deposited is " + depositAmount + "₹" + "\n" +
                "The new balance is " + this.balance + "₹");
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public double getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
