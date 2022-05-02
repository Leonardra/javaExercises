package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter user input");
        int userInput =input.nextInt();

        int highestNumber = userInput;
        int secondHighestNumber = userInput;
        int lowestNumber = userInput;



        while(counter < 10){
            System.out.println("Enter user input");
            userInput = input.nextInt();

            if(userInput > highestNumber){
                highestNumber = userInput;
            }

            if(userInput > secondHighestNumber && userInput < highestNumber){
                secondHighestNumber = userInput;
            }

            if(userInput < lowestNumber){
                lowestNumber = userInput;
            }

            counter ++;
        }
        System.out.println("Lowest Number is: " +lowestNumber);
        System.out.println("Highest Number is: "+highestNumber);
        System.out.println(secondHighestNumber);
    }
}
