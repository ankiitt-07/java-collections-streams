package com.advanced.banking_transaction;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance!!");
    }
}
