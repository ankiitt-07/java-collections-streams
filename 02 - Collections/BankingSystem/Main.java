package collections.BankingSystem;

import collections.BankingSystem.account.*;
import collections.BankingSystem.bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account = new Account("201", "Savings");
        Account account2 = new Account("3442", "Salary");
        Account account3 = new Account("532", "Savings");

        bank.addAccount(account, 1000);
        bank.addAccount(account2, 33100);
        bank.addAccount(account3, 5000);

        bank.requestWithdrawal(account, 500);
        bank.requestWithdrawal(account, 600);

        bank.processWithdrawalRequests();
    }
}

