package com.incluctab.tddClasses.chapterTwo;

import com.incluctab.tddClasses.Account;

import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account newAccount = new Account();
        int userInput;

        System.out.println("Welcome to the bank of the people.");

        System.out.println("What's your first name:");
        String firstName = input.next();
        newAccount.setAccountName(firstName);

        System.out.printf("Hi %s, Enter a 4 digit code to set your pin%n", firstName);
        int accountPin = input.nextInt();
        newAccount.setPin(accountPin);

        do {
            String menu = """
                    -> Enter 1 to Deposit
                    -> Enter 2 to Withdraw
                    -> Enter 3 to Check Balance
                    -> Enter 4 to transfer
                    -> Enter 5 to change pin
                    -> Enter 6 to Exit Application
                    """;

            System.out.println(menu);

             userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter amount to Deposit");
                    double amountToDeposit = input.nextDouble();
                    newAccount.deposit(amountToDeposit);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    double amountToWithdraw = input.nextDouble();
                    System.out.println("Enter pin to withdraw: ");
                    accountPin = input.nextInt();
                    newAccount.withdraw(amountToWithdraw, accountPin);
                    break;
                case 3:
                    System.out.println(newAccount.getAccountBalance());
                    break;
                case 4:
                    System.out.println("Enter beneficiary's username to transfer: ");
                    String beneficiaryName = input.next();
                    Account beneficiaryAccount = new Account();
                    beneficiaryAccount.setAccountName(beneficiaryName);
                    System.out.println("Enter amount to transfer: ");
                    double amountToTransfer = input.nextDouble();
                    System.out.println("Enter your pin: ");
                    int userPin = input.nextInt();
                    newAccount.transferFunds(beneficiaryAccount, amountToTransfer, userPin);
                    break;
                case 5:
                    System.out.println("Enter old pin: ");
                    int oldPin = input.nextInt();

                    System.out.println("Enter new pin: ");
                    int newPin = input.nextInt();
                    newAccount.changePin(oldPin, newPin);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid input, try again.");
                    break;
            }
        }
        while (userInput != 6);
    }
}
