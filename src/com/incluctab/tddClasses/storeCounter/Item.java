package com.incluctab.tddClasses.storeCounter;

public class Item {
    private String itemPurchased;
    private double amount;
    private int quantity;
    private double totalPrice;


    public Item(String itemPurchased, double amount, int quantity, double totalPrice) {
        this.itemPurchased = itemPurchased;
        this.amount = amount;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Item() {

    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public String toString(){
        String receipt = "\t"+ quantity + "\t\t\t"+ itemPurchased + "\t\t\t\t"+ amount +"\t\t\t\t"+ totalPrice;
        return receipt;
    }
}
