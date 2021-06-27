package com.incluctab.tddClasses.bankApplication;

import java.util.Scanner;

public class BankApp {

    private static final Scanner inputCollector = new Scanner(System.in);
    private static Customer newCustomer = new Customer();
    private static Customer newCustomer2 = new Customer();


    public static void main(String[] args) throws InterruptedException {
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

    public static void collectMainMenuInput() throws InterruptedException {
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

    public static void displayCustomerEntryPoint() throws InterruptedException {
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
                case 1 ->{
                    registerCustomer();
                    displayCustomerMenu();
                }
                case 2 -> {
                    loginCustomer();
                    displayCustomerMenu();
                }
            }
        }while(collectCustomerInput != 3);
    }

    public static void registerCustomer(){

        System.out.println("Enter first name: ");
        String firstName = inputCollector.next();
        newCustomer.setFirstName(firstName);

        System.out.println("Enter last name: ");
        String lastName = inputCollector.next();
        newCustomer.setLastName(lastName);

        System.out.println("Enter phone number: ");
        String phoneNumber = inputCollector.next();
        newCustomer.setPhoneNumber(phoneNumber);

        System.out.println("Create your personal pin: ");
        int customerPin = inputCollector.nextInt();
        newCustomer.setPin(customerPin);

        Bank.createAccountWith(newCustomer);
    }

    public static void loginCustomer(){
        System.out.println("Enter account no: ");
        int collectAccountNumber = inputCollector.nextInt();

        System.out.println("Enter your pin: ");
        int collectPin = inputCollector.nextInt();

        Bank.isLogIn(collectAccountNumber, collectPin);


    }

    public static void displayCustomerMenu() throws InterruptedException {
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
                    Thread.sleep(20);
                    break;
                case 2:
                    System.out.println("WITHDRAW");
                    displayEmptySpace(2);
                    displayLineBreak();
                    System.out.println("Enter amount to withdraw");
                    double amountToWithdraw = inputCollector.nextDouble();
                    newCustomer.withdraw(amountToWithdraw);
                    Thread.sleep(20);
                    break;
                case 3:
                    System.out.println("TRANSFER");
                    displayEmptySpace(2);
                    displayLineBreak();
                    System.out.println("Enter your account number: ");
                    int accountNumber = inputCollector.nextInt();
                    Thread.sleep(20);
                    System.out.println("Enter beneficiary account: ");
                    int beneficiaryAccount = inputCollector.nextInt();
                    Thread.sleep(20);
                    System.out.println("Enter amount to transfer: ");
                    double amountToTransfer = inputCollector.nextDouble();
                    Bank.transfer(accountNumber, beneficiaryAccount,amountToTransfer);
                    Thread.sleep(20);
                    break;
                case 4:
                    System.out.println("LOAD AIRTIME");
                    displayEmptySpace(2);
                    displayLineBreak();
                    System.out.println("Enter amount of airtime: ");
                    double airtimeAmount = inputCollector.nextDouble();
                    Thread.sleep(20);
                    System.out.println("Enter phone number: ");
                    String phoneNumber = inputCollector.nextLine();
                    newCustomer.loadAirtime(airtimeAmount, phoneNumber);
                    Thread.sleep(20);
                    break;
                case 5:
                    break;
            }
        }while(customerMenuInput != 5);
    }

}
