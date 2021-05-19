package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any number and check if you passed: ");
        int userInput = input.nextInt();
        if(userInput >= 60){
            System.out.println("Passed");
        }
        if(userInput < 60){
            System.out.println("Failed");
        }
    }
}
