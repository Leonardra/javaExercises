package com.incluctab.tddClasses.kataWithDimeji;

public class MyBankAccount {
    private static int accountAssigner;
    private String accountName;
    private final int accountNumber;
    private double accountBalance;
    private int pin;

    public MyBankAccount() {
        accountAssigner++;
        accountNumber = accountAssigner;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
