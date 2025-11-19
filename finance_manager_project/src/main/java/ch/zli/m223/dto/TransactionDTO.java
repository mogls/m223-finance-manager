package ch.zli.m223.dto;

public class TransactionDTO {
    public double amount;
    public String transactionType;
    public String transactionDate;
    public String description;
    public long accountId;
    public long categoryId;
    public long userId;

    public TransactionDTO(double amount, String transactionType, String transactionDate, String description,
            long accountId, long categoryId, long userId) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.description = description;
        this.accountId = accountId;
        this.categoryId = categoryId;
        this.userId = userId;

    }

    // public TransactionDTO(double amount, String transactionType, String transactionDate,
    //         long accountId, long categoryId, long userId) {
    //     this.amount = amount;
    //     this.transactionType = transactionType;
    //     this.transactionDate = transactionDate;
    //     this.description = "";
    //     this.accountId = accountId;
    //     this.categoryId = categoryId;
    //     this.userId = userId;

    // }

}
