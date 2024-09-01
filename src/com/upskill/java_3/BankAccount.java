package com.upskill.java_3;

class BankAccount {
    String name;
    double amount;

    // Constructor to initialize account name and initial amount
    public BankAccount(String name, double initialAmount) {
        this.name = name;
        this.amount = initialAmount;
    }

    // Method to deposit money into the account
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Method to withdraw money from the account
    public void withdraw(double withdrawAmount) {
        amount -= withdrawAmount;
    }

    // Method to get the current account balance
    public double getAmount() {
        return amount;
    }

    // Method to get the account name
    public String getName() {
        return name;
    }
}

// Savings account class inheriting from BankAccount
class Savings extends BankAccount {
    public Savings(double initialAmount) {
        super("Savings", initialAmount);
    }
}

// Checking account class inheriting from BankAccount
class Checking extends BankAccount {
    public Checking(double initialAmount) {
        super("Checking", initialAmount);
    }
}



