package com.incluctab.tddClasses.bankApplication;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {

    @Test
    void customerHasAccount(){
        Customer newCustomer = new Customer();
        BankAccount newAccount = new BankAccount();
        newAccount.setAccountName("Oluwatobi");
        newCustomer.setAccount(newAccount);
        assertEquals("Oluwatobi", newCustomer.getAccount().getAccountName());
    }

    @Test
    void customerCanSetFirstName(){
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("Oluwatobi");
        assertEquals("Oluwatobi", newCustomer.getFirstName());
    }

    @Test
    void customerCanSetLastName() {
        Customer newCustomer = new Customer();
        newCustomer.setLastName("Jolayemi");
        assertEquals("Jolayemi", newCustomer.getLastName());
    }

    @Test
    void customerCanDeposit(){
        Customer newCustomer = new Customer("Oluwatobi", "Jolayemi", "08166863370");
        newCustomer.deposit(20000.0);
        assertEquals(20000, newCustomer.getAccountBalance());
    }

    @Test
    void customerCanWithdraw(){
        Customer newCustomer = new Customer("Oluwatobi", "Jolayemi", "08166863770");
        newCustomer.deposit(30000);
        newCustomer.withdraw(10000.00);
        assertEquals(20000.00, newCustomer.getAccountBalance());
    }

    @Test
    void customerCanLoadAirtime(){
        Customer newCustomer = new Customer("Oluwatobi", "Jolayemi", "08166863770");
        newCustomer.deposit(3000);
        newCustomer.loadAirtime(2000.00, "08166863770");
        assertEquals(1000, newCustomer.getAccountBalance());
    }

    @Test
    void thatCustomerCanSetPin(){
        Customer newCustomer = new Customer();
        newCustomer.setPin(4455);
        assertTrue(newCustomer.confirmPin(4455));
    }

    @Test
    void thatCustomerCanSetPhoneNumber(){
        Customer newCustomer = new Customer("Oluwatobi", "Jolayemi", "08166863770");
        newCustomer.setPhoneNumber("08178966770");
        assertEquals("08178966770", newCustomer.getPhoneNumber());
    }

    @Test
    public void testThatCustomerCanTransfer() {
        Customer newCustomer = new Customer("Oluwatobi", "Jolayemi", "08166863770");
        newCustomer.deposit(10000);
        BankAccount bankoleAccount = new BankAccount();
        newCustomer.transferFunds(bankoleAccount, 4500);
        assertEquals(5500, newCustomer.getAccountBalance());
        assertEquals(4500, bankoleAccount.getAccountBalance());
    }


}
