package com.incluctab.tddClasses.bankApplication;

import com.incluctab.tddClasses.Account;

import java.util.Scanner;

public class BankApp<newCustomer> {

    private static Scanner inputCollector = new Scanner(System.in);
    private static Customer newCustomer = new Customer();

    public static void main(String[] args) {
        displayBankName();
        displayLineBreak();
        collectMainMenuInput();

    }
    public static void displayBankName(){
        String welcomeMessage = "Welcome to Aurora Bank!";
        System.out.println(welcomeMessage);
    }
    public static void displayMainMenu(){
        String mainMenu = """
                Enter 1 for STAFF login
                Enter 2 for CUSTOMER login
                Enter 3 to EXIT
                """;
        System.out.println(mainMenu);

    }
    public static void displayLineBreak(){
        String lineBreak = "_______________________________________________________";
        System.out.println(lineBreak);
    }

    public static void collectMainMenuInput(){
        int mainInput;
        do {
            displayMainMenu();
            mainInput = inputCollector.nextInt();
            switch (mainInput) {
                case 1:
                    displayStaffMenu();
                    break;
                case 2:
                    displayCustomerEntryPoint();
                    break;
                case 3:
                    break;
            }
        }while(mainInput != 3);

    }

    public static void displayStaffMenu(){
        String staffMenu = """
                Enter 1 to view all bank account
                Enter 2 to delete account
                Enter 3 to Logout
                """;
        System.out.println(staffMenu);
    }

    public static void displayEmptySpace(int numberOfSpaces){
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.println(" ");
        }
    }

    public static void displayCustomerEntryPoint(){
        int collectCustomerInput;
        do {
            String entryPoint = """
                    Enter 1 to REGISTER
                    Enter 2 to LOGIN
                    Enter 3 to go to MAIN MENU
                    """;
            System.out.println(entryPoint);

            collectCustomerInput = inputCollector.nextInt();

            switch (collectCustomerInput) {
                case 1 -> displayCustomerMenu();
                case 2 -> {
                    loginCustomer();
                    displayCustomerMenu();
                }
            }
        }while(collectCustomerInput != 3);
    }

    public static void loginCustomer(){
        System.out.println("Enter account no: ");
        int collectAccountNumber = inputCollector.nextInt();

        System.out.println("Enter your pin: ");
        int collectPin = inputCollector.nextInt();
    }

    public static void displayCustomerMenu(){
        int customerMenuInput;
        do {
            String customerMenu = """
                    Enter 1 to DEPOSIT
                    Enter 2 to WITHDRAW
                    Enter 3 to TRANSFER
                    Enter 4 to LOAD AIRTIME
                    Enter 5 to LOGOUT
                    """;
            System.out.println(customerMenu);
            customerMenuInput = inputCollector.nextInt();
            switch (customerMenuInput) {
                case 1:
                    System.out.println("DEPOSIT");
                    displayEmptySpace(2);
                    displayLineBreak();
                    System.out.println("Enter amount to Deposit");
                    double amountToDeposit = inputCollector.nextDouble();
                    newCustomer.deposit(amountToDeposit);
                    break;
                case 2:
                    System.out.println("WITHDRAW");
                    displayEmptySpace(2);
                    displayLineBreak();
                    System.out.println("Enter amount to withdraw");
                    double amountToWithdraw = inputCollector.nextDouble();
                    newCustomer.withdraw(amountToWithdraw);
                    break;
                case 3:
                    System.out.println("TRANSFER");
                    displayEmptySpace(2);
                    displayLineBreak();
                    break;
                case 4:
                    System.out.println("LOAD AIRTIME");
                    displayEmptySpace(2);
                    displayLineBreak();
                    System.out.println("Enter amount of airtime: ");
                    double airtimeAmount = inputCollector.nextDouble();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = inputCollector.nextLine();
                    newCustomer.loadAirtime(airtimeAmount, phoneNumber);
                    break;
                case 5:
                    break;
            }
        }while(customerMenuInput != 5);
    }

}
