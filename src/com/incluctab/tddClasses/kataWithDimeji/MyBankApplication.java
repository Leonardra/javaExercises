
package com.incluctab.tddClasses.kataWithDimeji;

import java.util.Scanner;

public class MyBankApplication {

    private static Scanner newInput = new Scanner(System.in);

    public static void main(String[] args) {
        MyBank myBankApp = new MyBank();
        MyBankCustomers customerOne = new MyBankCustomers();
        MyBankCustomers customerTwo = new MyBankCustomers();

        System.out.println("Enter first name: ");
        String firstName = newInput.next();
        customerOne.setFirstName(firstName);

        System.out.println("Enter last name: ");
        String lastName = newInput.next();
        customerOne.setLastName(lastName);

        System.out.println("Enter address: ");
        String address = newInput.next();
        customerOne.setAddress(address);

        System.out.println("Enter preferred pin: ");
        int pin = newInput.nextInt();
        customerOne.createPin(pin);

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
            customerMenuInput = newInput.nextInt();

            switch (customerMenuInput) {
                case 1:
                    System.out.println("DEPOSIT");
                    System.out.println("Enter amount to Deposit");
                    double amountToDeposit = newInput.nextDouble();
                    customerOne.deposit(amountToDeposit);
                    break;
                case 2:
                    System.out.println("WITHDRAW");
                    System.out.println("Enter amount to Withdraw");
                    double amountToWithdraw = newInput.nextDouble();
                    System.out.println("Enter pin");
                    int customerPin = newInput.nextInt();
                    customerOne.withdraw(amountToWithdraw, customerPin);
                    break;
                case 3:
                    System.out.println("TRANSFER");
                    System.out.println("Enter your account number");
                    int accountNumber = newInput.nextInt();
                    System.out.println("Enter amount to Transfer");
                    double amountToTransfer = newInput.nextDouble();
                    System.out.println("Enter pin");
                    customerPin = newInput.nextInt();
                    System.out.println("Enter beneficiary account number");
                    int beneficiaryAccountNumber = newInput.nextInt();
                    myBankApp.transfer(accountNumber, beneficiaryAccountNumber, amountToTransfer, customerPin);
                    break;
                case 4:
                    break;
            }


        }while(customerMenuInput != 4);
    }
}
