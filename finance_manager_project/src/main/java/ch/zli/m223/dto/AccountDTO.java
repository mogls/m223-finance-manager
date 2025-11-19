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
}