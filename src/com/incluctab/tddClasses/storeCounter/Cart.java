package com.incluctab.tddClasses.storeCounter;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items = new ArrayList<>();
    private double totalItemPrice;

    public void addItem(Item item){
        items.add(item);
    }

    public void addTotalPrice(){
        for (Item item: items) {
           double itemPrice = item.getTotalPrice();
           totalItemPrice+=itemPrice;
        }
    }

    public double getTotalItemPrice(){
        return totalItemPrice;
    }

    public void displayCartItems(){
        System.out.println("\tQty\t\t\tItems\t\t\tPrice/Unit\t\t\tTotalPrice");
        System.out.println("\t###########################################################");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
