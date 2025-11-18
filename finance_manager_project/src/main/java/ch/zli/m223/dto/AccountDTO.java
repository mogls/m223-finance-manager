package ch.zli.m223.dto;

public class AccountDTO {
    public String accountName;
    public String accountType;
    public double balance;
    public long userId;

    public AccountDTO(String accountName, String accountType, double balance, long userId) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance = balance;
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}