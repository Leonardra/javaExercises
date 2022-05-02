package com.incluctab.tddClasses.kataWithDimeji;

public class MyBankCustomers {
    private String firstName;
    private String lastName;
    private String address;
    private MyBankAccount newAccount;

    public MyBankCustomers() {
        newAccount = new MyBankAccount();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        newAccount.setAccountName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MyBankAccount getNewAccount() {
        return newAccount;
    }

    public void setNewAccount(MyBankAccount newAccount) {
        this.newAccount = newAccount;
    }

    public void deposit(double amount){
        double currentBalance = newAccount.getAccountBalance();
        double newAccountBalance = currentBalance + amount;
        newAccount.setAccountBalance(newAccountBalance);
    }

    public void withdraw(double amount, int pin){

        if(pin == newAccount.getPin()) {
            double currentBalance = newAccount.getAccountBalance();
            if(currentBalance >= amount) {
                double newAccountBalance = currentBalance - amount;
                newAccount.setAccountBalance(newAccountBalance);
            }else{
                //throw illegal argument exception
            }
        }else {
            //invalid pin
        }
    }

    public void createPin(int pin){
        if(pin > 999 && pin < 10000) {
            newAccount.setPin(pin);
        }
    }

    public void updatePin(int oldPin, int pin){
        if(oldPin == newAccount.getPin()){
            newAccount.setPin(pin);
        }
    }

    public int getCustomerAccountNumber(){
        return newAccount.getAccountNumber();
    }


    public int getPin(){
        return newAccount.getPin();
    }

}
