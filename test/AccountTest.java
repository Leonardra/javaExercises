import com.incluctab.tddClasses.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {


    @Test
    public void testThatAccountCanOpenOnce() {
        Account tobiAccount = new Account();
        tobiAccount.deposit(850.00);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(850.00, tobiBalance);

    }

    @Test
    public void testThatNegativeValueDepositShouldNotUpdateBalance() {
        Account tobiAccount = new Account();
        tobiAccount.deposit(-50);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(0, tobiBalance);

    }

    @Test
    public void testThatNegativeValueWithdrawalShouldNotUpdateBalance() {
        Account tobiAccount = new Account();
        tobiAccount.withdraw(-100, 1300);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(0, tobiBalance);
    }

    @Test
    public void testThatWithdrawIsNotMoreThanBalance() {
        //given
        Account tobiAccount = new Account();
        //when
        tobiAccount.withdraw(200, 1300);
        double tobiBalance = tobiAccount.getAccountBalance();
        //check that
        assertEquals(0, tobiBalance);
    }

    @Test
    public void testThatUserCanSetPin() {
        //given
        Account tobiAccount = new Account();
        tobiAccount.setPin(4321);
        assertTrue(tobiAccount.confirmPin(4321));

    }


//        @Test
//        public void testThatAccountCannotWithDrawWithoutPin() {
//            Account tobiAccount = new Account();
//            tobiAccount.setPin(1234);
//            tobiAccount.deposit(10000);
//            tobiAccount.withdraw(3400, 1234);
//            assertEquals(6600, tobiAccount.getAccountBalance());
//        }

    @Test
    public void testThatAccountCanTransfer(){
        Account tobiAccount = new Account();
        tobiAccount.setPin(5555);
        tobiAccount.deposit(10000);
        Account bankoleAccount = new Account();
        tobiAccount.transferFunds(bankoleAccount, 4500, 5555);
        assertEquals(5500, tobiAccount.getAccountBalance());
        assertEquals(4500, bankoleAccount.getAccountBalance());
    }

    @Test
    public void testThatAccountCanChangePin(){
        Account tobiAccount = new Account();
        tobiAccount.setPin(4440);
        tobiAccount.confirmPin(4440);
        tobiAccount.changePin(4440, 5555);
        assertTrue(tobiAccount.confirmPin(5555));
    }


    }





