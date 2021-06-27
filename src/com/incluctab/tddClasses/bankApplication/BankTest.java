package com.incluctab.tddClasses.bankApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {

    @Test
    void thatBankHaveAName(){
        assertEquals("Aurora Bank", Bank.assignBankName());
    }

    @Test
    void thatBankCanCreateAccountForCustomers(){
        Bank newBank = new Bank();
        Customer newCustomer = new Customer();
        Bank.createAccountWith(newCustomer);
        assertEquals(1, newBank.getCustomerList().size() );
    }
}
