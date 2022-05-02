package com.incluctab.tddClasses.chapterFifteen.transactionRecord;

import lombok.*;

@Data
@AllArgsConstructor
public class Account {
        private int accountNumber;
        private String firstName;
        private String lastName;
        private double balance;


    public void combine(TransactionRecord transactionRecord) {
        this.balance+=transactionRecord.getAmount();
    }
}
