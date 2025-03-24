package collections.BankingSystem.bank;



import collections.BankingSystem.account.*;
import java.util.*;

public class Bank {
    private final HashMap<Account, Integer> accounts;
    private final Queue<WithdrawalRequest> withdrawalRequests;

    public Bank() {
        this.accounts = new HashMap<>();
        this.withdrawalRequests = new LinkedList<>();
    }

    public HashMap<Account, Integer> getAccounts() {
        return accounts;
    }

    public Queue<WithdrawalRequest> getWithdrawalRequests() {
        return withdrawalRequests;
    }

    public void addAccount(Account account, int balance) {
        this.accounts.put(account, balance);
    }

    public void displaySorted(){
        TreeMap<Integer, List<Account>> sorted = new TreeMap<>();

        for (Map.Entry<Account, Integer> entry : this.accounts.entrySet()) {
            if (sorted.containsKey(entry.getValue())) {
                sorted.get(entry.getValue()).add(entry.getKey());
            } else{
                List<Account> list = new ArrayList<>();
                list.add(entry.getKey());
                sorted.put(entry.getValue(), list);
            }
        }

        for (Map.Entry<Integer, List<Account>> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void requestWithdrawal(Account account, int amount) {
        this.withdrawalRequests.add(new WithdrawalRequest(account.getAccountNo(), amount));
    }

    public void processWithdrawalRequests() {
        while (!withdrawalRequests.isEmpty()) {
            WithdrawalRequest req = withdrawalRequests.poll();

            Account target = null;
            for (Account acc : accounts.keySet()) {
                if (acc.getAccountNo().equals(req.getAccountNumber())) {
                    target = acc;
                    break;
                }
            }

            if (target == null) {
                System.out.println("Account not found: " + req.getAccountNumber());
                continue;
            }

            int balance = accounts.get(target);
            if (req.getAmount() <= balance) {
                accounts.put(target, balance - req.getAmount());
                System.out.println("Withdrawal of " + req.getAmount() + " from " + target.getAccountNo());
            } else {
                System.out.println("Insufficient funds for: " + target.getAccountNo());
            }
        }
    }
}