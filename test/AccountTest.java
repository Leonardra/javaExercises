import com.incluctab.tddClasses.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatAccountCanOpenOnce(){
        Account tobiAccount = new Account();
        tobiAccount.deposit(850.00);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(850.00, tobiBalance);

    }
    @Test
    public void testThatNegativeValueDepositShouldNotUpdateBalance(){
        Account tobiAccount = new Account();
        tobiAccount.deposit(-50);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(0,tobiBalance);

    }

    @Test
    public void testThatNegativeValueWithdrawalShouldNotUpdateBalance(){
        Account tobiAccount =new Account();
        tobiAccount.withdraw(-100);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(0, tobiBalance);
    }
    @Test
    public void testThatWithdrawIsNotMoreThanBalance(){
        Account tobiAccount = new Account();
        tobiAccount.withdraw(200);
        double tobiBalance = tobiAccount.getAccountBalance();
        assertEquals(0,tobiBalance);
    }

}
