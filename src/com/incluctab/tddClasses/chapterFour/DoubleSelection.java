package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class DoubleSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any number and check if you passed: ");
        int userInput = input.nextInt();
        if(userInput >= 60){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
