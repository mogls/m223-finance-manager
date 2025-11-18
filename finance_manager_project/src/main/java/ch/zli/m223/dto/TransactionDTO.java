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

    public TransactionDTO(double amount, String transactionType, String transactionDate,
            long accountId, long categoryId, long userId) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.description = "";
        this.accountId = accountId;
        this.categoryId = categoryId;
        this.userId = userId;

    }

    public long getAccountId() {
        return accountId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public double getAmount() {
        return amount;
    }

    public long getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

}
