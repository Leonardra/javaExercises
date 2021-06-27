package com.incluctab.tddClasses.bankApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {

    @Test
    void thatAccountCanGenerateAccountNumber(){
        BankAccount newAccount = new BankAccount();
        BankAccount newAccount2 = new BankAccount();
        assertEquals(1, newAccount.getAccountNumber());
        assertEquals(2, newAccount2.getAccountNumber());
    }

    @Test
    void thatAccountHasAccountName(){
        BankAccount tobiAccount = new BankAccount();
        tobiAccount.setAccountName("Oluwatobi");
        assertEquals("Oluwatobi", tobiAccount.getAccountName());
    }
    @Test
    public void testThatAccountCanOpenOnce() {
        BankAccount tobiAccount = new BankAccount();
        tobiAccount.deposit(850.00);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(850.00, tobiBalance);
    }

    @Test
    public void testThatNegativeValueDepositShouldNotUpdateBalance() {
        BankAccount tobiAccount = new BankAccount();
        tobiAccount.deposit(-50);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(0, tobiBalance);

    }

    @Test
    public void testThatNegativeValueWithdrawalShouldNotUpdateBalance() {
        BankAccount tobiAccount = new BankAccount();
        tobiAccount.withdraw(-100);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(0, tobiBalance);
    }

    @Test
    public void testThatWithdrawIsNotMoreThanBalance() {
        //given
        BankAccount tobiAccount = new BankAccount();
        //when
        tobiAccount.withdraw(2000);
        double tobiBalance = tobiAccount.getAccountBalance();
        //check that
        assertEquals(0, tobiBalance);
    }

    @Test
    public void testThatUserCanSetPin() {
        //given
        BankAccount tobiAccount = new BankAccount();
        tobiAccount.setPin(4321);
        assertTrue(tobiAccount.confirmPin(4321));

    }

    @Test
    public void testThatAccountCanChangePin(){
        BankAccount tobiAccount = new BankAccount();
        tobiAccount.setPin(4440);
        tobiAccount.confirmPin(4440);
        tobiAccount.changePin(4440, 5555);
        assertTrue(tobiAccount.confirmPin(5555));
    }

    @Test
    void thatAccountCanLoadAirtime(){
        BankAccount tobiAccount = new BankAccount();
        tobiAccount.deposit(10000);
        tobiAccount.loadAirtime(2000.00, "08166863770");
        assertEquals(8000, tobiAccount.getAccountBalance());
    }


}
