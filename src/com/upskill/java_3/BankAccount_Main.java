package com.upskill.java_3;

public class BankAccount_Main {
    public static void main(String[] args) {
        // Create a savings account with an initial amount of 10000
        Savings savingsAccount = new Savings(10000);
        System.out.println("a. Account name: " + savingsAccount.getName());
        System.out.println("b. Initial amount: " + savingsAccount.getAmount());

        // Deposit 5000 into the savings account
        savingsAccount.deposit(5000);
        System.out.println("c. New amount after deposit: " + savingsAccount.getAmount());

        // Create a checking account with an initial amount of 20000
        Checking checkingAccount = new Checking(20000);
        System.out.println("d. Account name: " + checkingAccount.getName());
        System.out.println("e. Initial amount: " + checkingAccount.getAmount());

        // Deposit 6000 into the checking account
        checkingAccount.deposit(6000);
        System.out.println("f. New amount after deposit: " + checkingAccount.getAmount());

        // Withdraw 3000 from the checking account
        checkingAccount.withdraw(3000);
        System.out.println("g. New amount after withdrawal: " + checkingAccount.getAmount());
    }
}
