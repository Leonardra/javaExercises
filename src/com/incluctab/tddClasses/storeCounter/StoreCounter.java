package com.incluctab.tddClasses.storeCounter;

import java.util.Scanner;

public class StoreCounter {
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int looper;

        do {
            System.out.println("What did he/buy?");
            String itemsPurchased = input.next();

            System.out.println("How much do you sell one?");
            double unitAmount = input.nextDouble();

            System.out.println("How many pieces did he/she buy?");
            int quantity = input.nextInt();

            double totalPrice = unitAmount * quantity;

            Item newItem = new Item(itemsPurchased, unitAmount, quantity, totalPrice);

            cart.addItem(newItem);

            System.out.println("Did he/she buy another?");
            String message = """
                    Enter 1 if Yes
                    Enter 2 if No
                    """;
            System.out.println(message);
            looper = input.nextInt();
        }while(looper != 2);
        cart.addTotalPrice();
        cart.displayCartItems();
        System.out.println("\t###########################################################");
        System.out.println("\tTotal price of item purchased is "+cart.getTotalItemPrice());

    }
}
