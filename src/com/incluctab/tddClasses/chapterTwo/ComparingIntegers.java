package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int numberOne =input.nextInt();


        System.out.print("Enter Second Number: ");
        int numberTwo =input.nextInt();

        if (numberOne == numberTwo){
            System.out.println("These numbers are equal");
        }

        if (numberOne != numberTwo) {
            System.out.println("These numbers are not equal");
        }

        if (numberOne < numberTwo) {
            System.out.printf("%d is lesser than %d%n", numberOne, numberTwo);
        }

        if (numberOne > numberTwo) {
            System.out.printf("%d is greater than %d%n", numberOne, numberTwo);
        }

        if (numberOne <= numberTwo) {
            System.out.printf("%d is lesser than or equal to %d%n", numberOne, numberTwo);
        }

        if (numberOne >= numberTwo) {
            System.out.printf("%d is greater than or equal to %d%n", numberOne, numberTwo);
        }
    }

}
