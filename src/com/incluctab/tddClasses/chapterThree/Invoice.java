package com.incluctab.tddClasses.chapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double pricePerItem;
    private double invoiceAmount;

    public Invoice(String partNumber, String partDescription,int itemQuantity, double pricePerItem, double invoiceAmount){
         this.partNumber = partNumber;
         this.partDescription = partDescription;
         this.itemQuantity = itemQuantity;
         this.pricePerItem = pricePerItem;
         this.invoiceAmount = invoiceAmount;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setItemQuantity(int itemQuantity) {
        if(itemQuantity <= 0){
            this.itemQuantity = 0;
        } else {
            this.itemQuantity = itemQuantity;
        }
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem <= 0){
            pricePerItem = 0.00;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }


    public void setInvoiceAmount() {
        invoiceAmount = pricePerItem * itemQuantity;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }
}
