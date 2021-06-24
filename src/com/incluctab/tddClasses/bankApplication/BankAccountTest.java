package com.incluctab.tddClasses.bankApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {
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
    public void testThatAccountCanTransfer(){
        BankAccount tobiAccount = new BankAccount();
        tobiAccount.setPin(5555);
        tobiAccount.deposit(10000);
        BankAccount bankoleAccount = new BankAccount();
        tobiAccount.transferFunds(bankoleAccount, 4500);
        assertEquals(5500, tobiAccount.getAccountBalance());
        assertEquals(4500, bankoleAccount.getAccountBalance());
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
