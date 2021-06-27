package com.incluctab.tddClasses.bankApplication;

import java.util.ArrayList;

public class Bank {
    private static final String bankName = "Aurora Bank";
    private static ArrayList<com.incluctab.tddClasses.bankApplication.Customer> bankCustomers = new ArrayList<com.incluctab.tddClasses.bankApplication.Customer>();

    public Bank() {
    }

    public static String assignBankName() {
        return bankName;
    }

    public static void createAccountWith(Customer newCustomer)
    {
        bankCustomers.add(newCustomer);
    }

    public static ArrayList<Customer> getCustomerList(){
        return bankCustomers;
    }

    public static boolean isLogIn(int accountNumber, int pin){
        for (Customer customer : bankCustomers) {
            if(customer.getAccountBalance() == accountNumber){
                customer.confirmPin(pin);
                return true;

            }
        }
        return false;
    }

    public static void transfer(int myacctNo, int beneficiaryAccountNo, double amount){
            for (Customer beneficiary : bankCustomers) {
                if(beneficiary.getAccountNumber() == beneficiaryAccountNo){
                    if(getCustomer(myacctNo).getAccount().getAccountBalance() > amount){
                        getCustomer(myacctNo).withdraw(amount);
                        beneficiary.deposit(amount);
                    }
                }

            }
    }

    private static Customer getCustomer(int accountNumber) {
        for (Customer customer : bankCustomers) {
            if (customer.getAccountNumber() == accountNumber) {
                return customer;
            }

        }
        throw new NullPointerException("Account not found");
    }


}
