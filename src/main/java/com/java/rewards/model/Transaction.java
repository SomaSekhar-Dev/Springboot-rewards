package com.java.rewards.model;

import java.time.LocalDate;

public class Transaction {

    private Long id;
    private String customerId;
    private double amount;
    private LocalDate transactionDate;

    // Constructors, getters, and setters


    public Transaction(Long id, String customerId, double amount, LocalDate transactionDate) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }

}
