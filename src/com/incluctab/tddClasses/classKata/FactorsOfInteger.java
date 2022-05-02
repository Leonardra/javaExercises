package com.incluctab.tddClasses.classKata;

import java.util.Scanner;

public class FactorsOfInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
         int userInput = input.nextInt();
        int factorOfNumber = 0;
        int count = 1;

         while(count <= userInput) {
             factorOfNumber = userInput % count;
             if(factorOfNumber > 10){
                 System.out.println(factorOfNumber);
             }
             count++;
         }
    }
}
