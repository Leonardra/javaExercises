package com.incluctab.tddClasses;

public class Account {

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

    public void withdraw(double amountToWithdraw, int enterPin) {

        if ((amountToWithdraw < myAccountBalance || amountToWithdraw == myAccountBalance) && enterPin == pin) {
            myAccountBalance = myAccountBalance - amountToWithdraw;
            confirmPin(enterPin);
        } else {
            if (amountToWithdraw > myAccountBalance) {
                System.out.println("Insufficient cash");
            } else {
                if (amountToWithdraw < 0) {
                    System.out.print("Unable to withdraw");
                }
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

    public void transferFunds(Account beneficiary, double amountToTransfer, int userPin) {

        if(myAccountBalance >= amountToTransfer || myAccountBalance == amountToTransfer) {
            beneficiary.deposit(amountToTransfer);
            this.withdraw(amountToTransfer, userPin);
        }
    }

    public void changePin(int oldPin, int newPin) {
        confirmPin(oldPin);
        setPin(newPin);
        confirmPin(newPin);
    }

}


