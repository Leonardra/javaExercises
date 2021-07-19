package com.incluctab.tddClasses.eStore;

public class CreditCardInfo {
    private int cardCVV;
    private int cardExpirationYear;
    private int cardExpirationMonth;
    private long creditCardNumber;
    private String nameOnCard;
    private CardType cardType;

    public CreditCardInfo(int cardCVV, int cardExpirationYear, int cardExpirationMonth, long creditCardNumber,
                          String nameOnCard, CardType cardType) {
        this.cardCVV = cardCVV;
        this.cardExpirationYear = cardExpirationYear;
        this.cardExpirationMonth = cardExpirationMonth;
        this.creditCardNumber = creditCardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }
}
