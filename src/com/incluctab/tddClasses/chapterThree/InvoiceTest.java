package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    private Invoice newInvoice;

    @BeforeEach
    public void startEveryMethodWithThis(){
        newInvoice = new Invoice("AD123","blue bag", 192,50.00, 0.00);
    }

    @Test
    public void testThatPartNumberCanBeSet(){
        newInvoice.setPartNumber("AD123");
        assertEquals("AD123", newInvoice.getPartNumber());
    }

    @Test
    public void testThatPartDescriptionCanBeSet(){
        newInvoice.setPartDescription("red bag");
        assertEquals("red bag", newInvoice.getPartDescription());
    }

    @Test
    public void testThatItemQuantityCanBeSet(){
        newInvoice.setItemQuantity(15);
        assertEquals(15, newInvoice.getItemQuantity());
    }

    @Test
    public void testThatPricePerItemCanBeSet(){
        newInvoice.setPricePerItem(10.00);
        assertEquals(10.00, newInvoice.getPricePerItem());
    }

    @Test
    public void testThatInvoiceCanGetInvoiceAmount(){
        newInvoice.setInvoiceAmount();
        assertEquals(9600.0, newInvoice.getInvoiceAmount());
    }

    @Test
    public void testThatIfQuantityIsNotPositiveItShouldReturnZero(){
        newInvoice.setItemQuantity(0);
        assertEquals(0, newInvoice.getItemQuantity());
    }

    @Test
    public void testThatIfPriceIsNotPositiveItShouldReturnZero(){
        newInvoice.setPricePerItem(0.00);
        assertEquals(50.00, newInvoice.getPricePerItem());
    }
}
