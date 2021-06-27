package com.incluctab.tddClasses.bankApplication;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {

    @Test
    void customerHasAccount(){
        Customer newCustomer = new Customer();
        newCustomer.getAccount().setAccountName("Oluwatobi");
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
        Customer newCustomer = new Customer();
        newCustomer.deposit(20000.0);
        assertEquals(20000, newCustomer.getAccountBalance());
    }

    @Test
    void customerCanWithdraw(){
        Customer newCustomer = new Customer();
        newCustomer.deposit(30000);
        newCustomer.withdraw(10000.00);
        assertEquals(20000.00, newCustomer.getAccountBalance());
    }

    @Test
    void customerCanLoadAirtime(){
        Customer newCustomer = new Customer();
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
        Customer newCustomer = new Customer();
        newCustomer.setPhoneNumber("08178966770");
        assertEquals("08178966770", newCustomer.getPhoneNumber());
    }



}
