package com.incluctab.tddClasses;

public class Account {

    private double myAccountBalance;
    public void deposit(double amountToDeposit) {
        boolean notTrue = amountToDeposit < 0;


        if(notTrue)
        {
            System.out.print("0");
        } else
            myAccountBalance = amountToDeposit;
    }


    public void withdraw(int amountToWithdraw) {
        boolean notTrue = amountToWithdraw < 0;

        int myAccountBalance = 500;

        if(amountToWithdraw>myAccountBalance){
            System.out.println("Insufficient cash");
        }

        if(notTrue) {
            System.out.print("Unable to withdraw");
        }
        else
            myAccountBalance = amountToWithdraw ;






    }
    public double getAccountBalance() {

        return myAccountBalance;
    }

}


