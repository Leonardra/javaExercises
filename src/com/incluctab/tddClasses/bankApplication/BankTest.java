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
        Customer newCustomer = new Customer();
        Bank.createAccountWith(newCustomer);
        assertEquals(1, Bank.getCustomerList().size());
    }

    @Test
    void thatBankCanDeleteCustomer(){
        //given
        Customer newCustomerOne = new Customer();
        Bank.createAccountWith(newCustomerOne);
        Customer newCustomerTwo = new Customer();
        Bank.createAccountWith(newCustomerTwo);
        //when
        Bank.deleteCustomer(2);
        //assert that
        assertEquals(1, Bank.getCustomerList().size() );
    }
}
