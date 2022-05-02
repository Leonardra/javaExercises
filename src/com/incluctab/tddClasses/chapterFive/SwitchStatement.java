package com.incluctab.tddClasses.chapterFive;


import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        int userInput = 0;
        int sentinelValue = 6;

        Scanner input = new Scanner(System.in);
        do {

            System.out.printf("Enter 1 for deposit;%nEnter 2 for withdraw;%nEnter 3 to view All account;%n" +
                    "Enter 4 to transfer;%nEnter 5 to view your details;%nEnter 6 to exit;%n");

            userInput = input.nextInt();

            if (userInput == 1) {
                System.out.println("Deposit");
            } else {
                if (userInput == 2) {
                    System.out.println("Withdraw");
                } else {
                    if (userInput == 3) {
                        System.out.println("View all account");
                    } else {
                        if (userInput == 4) {
                            System.out.println("Transfer");
                        } else {
                            if (userInput == 5) {
                                System.out.println("View your details");
                            } else {
                                System.out.println("Invalid Option");
                            }

                        }

                    }
                }
            }

        }

        while(userInput != sentinelValue);

    }
}


