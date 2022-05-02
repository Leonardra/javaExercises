package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if(age >=65){
            System.out.println("Age is greater than or equal to 65");
        }else{
            System.out.println("Age is less than 65"); //Error is in the quotation. Itt was placed after the parentheses
        }

        int x = 1;
        while(x <= 10){
            int total = 0; //total should be declared an initialised within the loop scope
            total += x;
            ++x;
        }

        while (x <= 100) { //There was no curly braces to define the loop scope
            int total = 0;
            total += x;
            ++x;
        }

        int y = 10;
        while (y > 0) {     //The closing braces was missing and the variable was not declared outside of the scope. The counter should decrement.
            System.out.println(y);
            ++y;
        }
    }
}
