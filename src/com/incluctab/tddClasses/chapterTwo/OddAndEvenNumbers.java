package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number and let's determine if it's odd or even number: ");

        int userInput = input.nextInt();

        if(userInput % 2 == 0){
            System.out.println("Even Number");
        }

        else {
            System.out.println("Odd Number");
        }
    }
}
