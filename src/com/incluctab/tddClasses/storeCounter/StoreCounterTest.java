package com.incluctab.tddClasses.storeCounter;

import org.junit.jupiter.api.Test;

public class StoreCounterTest {

    @Test
    void thatCartCanAddItem(){
        Cart newCart = new Cart();
        Item newItem = new Item();
        Item newItem2 = new Item();
        newCart.addItem(newItem);
        newCart.addItem(newItem2);
    }
}
