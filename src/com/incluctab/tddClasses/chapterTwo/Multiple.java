package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstInput = input.nextInt();

        System.out.println("Input second number: ");
        int secondInput = input.nextInt();

        if(firstInput % secondInput == 0){
            System.out.printf("%d is a multiple of %d", firstInput, secondInput);
        } else {
            System.out.printf("%d is not a multiple of %d", firstInput, secondInput);
        }
    }
}
