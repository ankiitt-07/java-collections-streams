package com.banking;
import com.custom_exceptions.InsufficientBalanceException;

public class Transaction {
    public static void withdraw(double amount, double balance) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException(amount, balance);
        }
        if(amount < 0){
            throw new IllegalArgumentException("Invalid amount");
        }
        amount = amount - balance;
    }
}
