package com.advanced.banking_transaction;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw (double amount) throws InsufficientBalanceException{
        if (amount > balance){
            throw new InsufficientBalanceException();
        }
        balance -= amount;
    }
}
