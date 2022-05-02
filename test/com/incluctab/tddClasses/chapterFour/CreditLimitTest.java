package com.incluctab.tddClasses.chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitTest {
    @Test
    public void testThatCustomerCanHaveAccountNumber(){
        //given
        CreditLimit newCustomer = new CreditLimit();
        //when
        newCustomer.setAccountNumber(234590);
        //assert that
        assertEquals(234590, newCustomer.getAccountNumber());
    }

    @Test
    public void testThatCustomerHaveBalance() {
        CreditLimit newCustomer = new CreditLimit();
        //when
        newCustomer.balance(10000);
        //assert that
        assertEquals(10000, newCustomer.getBalance());
    }

    @Test
    void testThatCustomerHaveTotalMonthlyItemCharged(){
        CreditLimit newCustomer = new CreditLimit();
        //when
        newCustomer.setItemChargedPerMonth(34);
        //assert that
        assertEquals(34, newCustomer.getItemChargedPerMonth());
    }

    @Test
    void testThatCustomerCanSetCreditPerMonth(){
        CreditLimit newCustomer = new CreditLimit();
        newCustomer.setAllCredit(10);
        assertEquals(10, newCustomer.getAllCredit());
    }

    @Test
    void testThatCustomerCanSetAllowedCredits(){
        CreditLimit newCustomer = new CreditLimit();
        newCustomer.setAllowedCredit(5);
        assertEquals(5, newCustomer.getAllowedCustomer());
    }

//    @Test
//    void testThatCreditLimitCanCalculateNewBalance(){
//        CreditLimit newCustomer = new CreditLimit();
//        newCustomer.balance(3000);
//        int beginningBalance = newCustomer.getBalance();
//        newCustomer.setItemChargedPerMonth(12);
//        int itemChargedPerMonth = newCustomer.getItemChargedPerMonth();
//        newCustomer.setAllCredit(20);
//        int credit = newCustomer.getAllCredit();
//        assertEquals(2992, newCustomer.calculateNewBalance(beginningBalance, itemChargedPerMonth, credit));
//    }

    @Test
    void thatCreditCardLimitCanShowIfCustomerExceedCreditLimit(){
        CreditLimit newCustomer = new CreditLimit();
        newCustomer.balance(3000);
        newCustomer.setItemChargedPerMonth(12);
        newCustomer.setAllCredit(20);
        newCustomer.setAllowedCredit(2000);
        assertTrue(newCustomer.isCreditLimitExceeded());
    }
}





