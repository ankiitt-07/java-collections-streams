package com.custom_exceptions;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(double amount, double balance) {
        super("Insufficient Balance! "+ (balance-amount));
    }
}
