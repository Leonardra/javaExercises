package com.incluctab.tddClasses.bankApplication;

public class Staff {

    private String userName;
    private int pin;

    public void setUserName(String staffUserName) {
        userName = staffUserName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPin(int staffPin) {
        pin = staffPin;
    }

    public boolean confirmPin(int staffPin) {
        return pin == staffPin;
    }
}
