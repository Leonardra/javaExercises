package com.incluctab.tddClasses.bankApplication;

import com.incluctab.tddClasses.Account;

public class BankAccount {
    private double myAccountBalance;
    private int pin;
    private String accountName;

    public void deposit(double amountToDeposit) {
        boolean notTrue = amountToDeposit < 0;

        if (notTrue) {
            System.out.print("0");
        } else {
            myAccountBalance = myAccountBalance + amountToDeposit;
        }
    }

    public void setPin(int myPin) {
        if (myPin >= 1000 && myPin <= 9999) {
            pin = myPin;
            System.out.println("Pin has been set successfully");
        }
    }

    public void withdraw(double amountToWithdraw) {

        if (amountToWithdraw < 0.0) {
            System.out.println("Unable to withdraw");
            if (amountToWithdraw > myAccountBalance) {
                System.out.print("Insufficient cash");
            }
        } else{
            if(amountToWithdraw <= myAccountBalance){
                myAccountBalance = myAccountBalance - amountToWithdraw;
            }
        }

    }

    public boolean confirmPin(int enterPin) {
        return pin == enterPin;
    }




    public double getAccountBalance() {
        return myAccountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void transferFunds(BankAccount beneficiary, double amountToTransfer) {

        if(myAccountBalance >= amountToTransfer || myAccountBalance == amountToTransfer) {
            beneficiary.deposit(amountToTransfer);
            this.withdraw(amountToTransfer);
        }
    }

    public void changePin(int oldPin, int newPin) {
        confirmPin(oldPin);
        setPin(newPin);
        confirmPin(newPin);
    }

    public void loadAirtime(double airtimeAmount, String phoneNumber) {
        this.withdraw(airtimeAmount);
        System.out.println("Airtime has been purchased for "+phoneNumber);
    }
}
