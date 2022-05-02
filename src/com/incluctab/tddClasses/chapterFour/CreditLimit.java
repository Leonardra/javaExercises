package com.incluctab.tddClasses.chapterFour;

public class CreditLimit {
    private int accountNumber;
    private int balance;
    private int itemCharged;
    private int allCredit;
    private int allowedCredit;

    public CreditLimit() {

    }

    public CreditLimit(int accountNumber, int balance, int itemCharged, int allCredit, int allowedCredit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.itemCharged = itemCharged;
        this.allCredit = allCredit;
        this.allowedCredit = allowedCredit;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;

    }

    public void balance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setItemChargedPerMonth(int itemCharged) {
        this.itemCharged = itemCharged;
    }

    public int getItemChargedPerMonth() {
        return itemCharged;
    }

    public void setAllCredit(int allCredit) {
        this.allCredit = allCredit;
    }

    public int getAllCredit() {
        return allCredit;
    }

    public void setAllowedCredit(int allowedCredit) {
        this.allowedCredit = allowedCredit;
    }

    public int getAllowedCustomer() {
        return allowedCredit;
    }

    public int calculateNewBalance() {
        return balance + itemCharged - allCredit;
    }

    public boolean isCreditLimitExceeded() {
        int newBalance = calculateNewBalance();
        return newBalance > allowedCredit;
    }
}
