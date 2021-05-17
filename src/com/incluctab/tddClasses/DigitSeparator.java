package com.incluctab.tddClasses;

import javax.swing.*;
import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in a five digit number and let the application separate it: ");

        int userInput=input.nextInt();

        if((userInput < 10000) || (userInput >= 100000)){
            System.out.println("Not within selection range");

        }else{
            int firstDigit = (userInput / 10000);
            int secondDigit = ((userInput / 1000) % 10);
            int thirdDigit = ((userInput / 100) % 10);
            int fourthDigit = ((userInput % 10) / 10);
            int fifthDigit = (userInput % 100);

            if(true){
                System.out.printf(" %d   %d   %d   %d   %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
            }

        }




    }
}
