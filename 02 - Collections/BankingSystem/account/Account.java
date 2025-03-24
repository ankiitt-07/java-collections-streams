package collections.BankingSystem.account;

public class Account {
    private String accountNo;
    private String accountType;

    public Account(String accountNo, String accountType) {
        this.accountNo = accountNo;
        this.accountType = accountType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", accountType=" + accountType + "]";
    }
}
