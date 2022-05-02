package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class CreditLimitApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int accNumber = input.nextInt();

        System.out.println("Enter balance at the beginning of the month: ");
        int beginningBalance = input.nextInt();

        System.out.println("Enter total items:");
        int totalItems = input.nextInt();

        System.out.println("Enter total credit applied to you this month: ");
        int appliedCredit = input.nextInt();

        System.out.println("Enter credit limit: ");
        int creditLimit = input.nextInt();

        CreditLimit newCreditLimit = new CreditLimit(accNumber, beginningBalance, totalItems, appliedCredit, creditLimit);
        int newBalance = newCreditLimit.calculateNewBalance();
        System.out.println("Your new balance is "+ newBalance);
        if(newCreditLimit.isCreditLimitExceeded()){
            System.out.println("Credit Limit Exceeded");
        }



    }
}
