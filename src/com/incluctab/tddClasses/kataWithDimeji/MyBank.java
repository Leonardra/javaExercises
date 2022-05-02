package com.incluctab.tddClasses.kataWithDimeji;

import java.util.ArrayList;

public class MyBank {
    private static final String bankName = "Aurora Borealis";
    ArrayList<MyBankCustomers> listOfCustomers;

    public void register (MyBankCustomers customer){
        listOfCustomers.add(customer);
    }

    public boolean isLogIn(int accountNumber, int pin){
        for (MyBankCustomers customer : listOfCustomers) {
            if(customer.getCustomerAccountNumber() == accountNumber){
                if(customer.getPin() == pin) {
                    return true;
                }
            }
        }
        return false;
    }

    public void transfer(int myacctNo, double beneficiaryAccountNo, double amount, int pin){
        if(isLogIn(myacctNo, pin)){
            for (MyBankCustomers beneficiary : listOfCustomers) {
                if(beneficiary.getCustomerAccountNumber() == beneficiaryAccountNo){
                    if(getCustomer(myacctNo).getNewAccount().getAccountBalance() > amount){
                        getCustomer(myacctNo).withdraw(amount,pin);
                        beneficiary.deposit(amount);
                    }
                }

            }
        }
    }

    private MyBankCustomers getCustomer(int accountNumber) {
        for (MyBankCustomers customer : listOfCustomers) {
            if (customer.getCustomerAccountNumber() == accountNumber) {
                return customer;
            }

        }
        throw new NullPointerException("Account not found");
    }



}
