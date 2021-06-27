package com.incluctab.tddClasses.bankApplication;


public class BankAccount {
    private static int accountAssigner;
    private double myAccountBalance;
    private final int accountNumber;
    private String accountName;
    private int pin;


    public BankAccount() {
        accountAssigner++;
        accountNumber = accountAssigner;
    }


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

    public String getAccountName() {
        return accountName;
    }


    public void changePin(int oldPin, int newPin) {
        confirmPin(oldPin);
        setPin(newPin);
        confirmPin(newPin);
    }

    public void loadAirtime(double airtimeAmount, String phoneNumber) {
        if(phoneNumber.length() == 11) {
            this.withdraw(airtimeAmount);
            System.out.println("Airtime has been purchased for " + phoneNumber);
        }
    }


    public int getAccountNumber() {
        return accountNumber;
    }
}
