package com.incluctab.tddClasses.bankApplication;

import com.incluctab.tddClasses.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    private Customer newCustomer;

    @BeforeEach
    void setup(){
        newCustomer = new Customer();
    }
    @Test
    void customerHasAccount(){
        BankAccount newAccount = new BankAccount();
        newAccount.setAccountName("Oluwatobi");
        newCustomer.setAccount(newAccount);
        assertEquals("Oluwatobi", newCustomer.getAccount().getAccountName());
    }

    @Test
    void customerCanSetFirstName(){
        newCustomer.setFirstName("Oluwatobi");
        assertEquals("Oluwatobi", newCustomer.getFirstName());
    }

    @Test
    void customerCanSetLastName() {
        newCustomer.setLastName("Jolayemi");
        assertEquals("Jolayemi", newCustomer.getLastName());
    }

    @Test
    void customerCanDeposit(){
        newCustomer.deposit(20000.0);
        assertEquals(20000, newCustomer.getAccountBalance());
    }

    @Test
    void customerCanWithdraw(){
        newCustomer.deposit(30000);
        newCustomer.withdraw(10000.00);
        assertEquals(20000.00, newCustomer.getAccountBalance());
    }

    @Test
    void customerCanLoadAirtime(){
        newCustomer.deposit(3000);
        newCustomer.loadAirtime(2000.00, "08166863770");
        assertEquals(1000, newCustomer.getAccountBalance());
    }

}
