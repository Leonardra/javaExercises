package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstInput = input.nextInt();

        System.out.println("Enter second number: ");
        int secondInput = input.nextInt();

         int sum = firstInput + secondInput;
         int difference = firstInput - secondInput;
         int product = firstInput * secondInput;
         int quotient = firstInput / secondInput;

        System.out.println("Sum is " +sum);
        System.out.println("Difference is " +difference);
        System.out.println("Product is " +product);
        System.out.println("Quotient is " +quotient);

    }
}
