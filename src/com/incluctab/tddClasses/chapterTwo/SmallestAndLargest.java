package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstInput = input.nextInt();

        System.out.println("Enter second number: ");
        int secondInput = input.nextInt();

        System.out.println("Enter third digit: ");
        int thirdInput = input.nextInt();

        int sum = firstInput + secondInput + thirdInput;
        int average = (firstInput + secondInput + thirdInput) / 3;
        int product = firstInput * secondInput * thirdInput;

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        System.out.println("Product is " + product);

        if ((firstInput < secondInput) && (firstInput < thirdInput)) {
            System.out.println("Smallest is " + firstInput);
        } else {
            if((secondInput < firstInput) && (secondInput < thirdInput)){
                System.out.println("Smallest is " +secondInput);
            } else {
                if((thirdInput < firstInput) && (thirdInput < secondInput)){
                    System.out.println("Smallest is " +thirdInput);
                }
            }
        }

        if ((firstInput > secondInput) && (firstInput > thirdInput)) {
            System.out.println("Largest is " + firstInput);
        } else {
            if((secondInput > firstInput) && (secondInput > thirdInput)){
                System.out.println("Largest is " +secondInput);
            } else {
                if((thirdInput > firstInput) && (thirdInput > secondInput)){
                    System.out.println("Largest is " +thirdInput);
                }
            }
        }

    }
}





