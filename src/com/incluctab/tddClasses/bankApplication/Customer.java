package com.incluctab.tddClasses.bankApplication;

import com.incluctab.tddClasses.Account;

public class Customer {
    private BankAccount newAccount = new BankAccount();
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int myPin;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Customer(){

    }

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

    public void setPin(int customerPin) {
        this.myPin = customerPin;
    }

    public boolean confirmPin(int enterPin) {
        return myPin == enterPin;
    }


    public void transferFunds(BankAccount beneficiaryAccount, double amountToTransfer) {
        newAccount.transferFunds(beneficiaryAccount, amountToTransfer);
    }

    public int getAccountNumber(){
        return newAccount.getAccountNumber();
    }
}
