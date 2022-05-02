package com.incluctab.tddClasses.chapterFifteen;

import com.incluctab.tddClasses.chapterFifteen.transactionRecord.Account;
import com.incluctab.tddClasses.chapterFifteen.transactionRecord.TransactionRecord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FileMatchTest {

    @Test
    void thatTransactionRecordCanBeCreated(){
        TransactionRecord transactionRecord = new TransactionRecord(100, 5500.00);
        assertNotNull(transactionRecord);
    }

    @Test
    void thatTransactionRecordCanGetAccountNumber(){
        TransactionRecord transactionRecord = new TransactionRecord(100, 5500.00);
        assertEquals(100, transactionRecord.getAccountNumber());
    }

    @Test
    void thatTransactionCanGetAmount(){
        TransactionRecord transactionRecord = new TransactionRecord(100, 5500.00);
        assertEquals(5500.00, transactionRecord.getAmount());
    }

    @Test
    void thatAccountBalanceCanMatchTransactionAmount(){
        Account newAccount = new Account(100, "Jolayemi", "Oluwatobi", 0.00);
        TransactionRecord transactionRecord = new TransactionRecord(100, 5500.00);
        newAccount.combine(transactionRecord);
        assertEquals(5500.00, newAccount.getBalance());
    }
}
