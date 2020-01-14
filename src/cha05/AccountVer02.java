package cha05;

public class AccountVer02 {

    private String accountNo;
    private int balance;
    private AccountType accountType;

    public AccountVer02(String aNo, AccountType aType) {
        this.accountNo = aNo;
        this.accountType = aType;
    }

    private int getBalance() {
        return this.balance;
    }

    private String getAccountNo() {
        return this.accountNo;
    }

    private AccountType getAccountType() {
        return this.accountType;
    }

    private void deposit(int money) {
        this.balance += money;
        System.out.println("残高チャージしました");
    }

    private void minus(int money) {
        this.balance -= money;
        System.out.println("残高を減額しました");
    }

    @Override
    public String toString() {
        return "Account (accountNo=" + this.accountNo + "accountType=" + this.accountType + ")";
    }
}
