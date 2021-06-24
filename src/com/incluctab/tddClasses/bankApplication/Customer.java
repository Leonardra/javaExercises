package com.incluctab.tddClasses.bankApplication;

import com.incluctab.tddClasses.Account;

public class Customer {
    private BankAccount newAccount = new BankAccount();
    private String firstName;
    private String lastName;
    private double accountBalance;

    public void setAccount(BankAccount newAccount) {
        this.newAccount = newAccount;
    }

    public BankAccount getAccount() {
        return newAccount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void deposit(double amountToDeposit) {
        newAccount.deposit(amountToDeposit);
    }

    public void withdraw(double amountToWithdraw) {
        newAccount.withdraw(amountToWithdraw);
    }

    public double getAccountBalance() {
        return newAccount.getAccountBalance();
    }


    public void loadAirtime(double airtime, String phoneNumber) {
        newAccount.loadAirtime(airtime, phoneNumber);
    }
}
