package com.advanced.banking_transaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp(){
        bankAccount = new BankAccount();
    }

    @Test
    void testGetBalance(){
        Assertions.assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(100);
        Assertions.assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() throws InsufficientBalanceException {
        bankAccount.deposit(200);
        bankAccount.withdraw(100);
        Assertions.assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void testWithdrawWithInsufficientBalance() {
        Assertions.assertThrows(InsufficientBalanceException.class, () -> bankAccount.withdraw(100));
    }
}
