package com.incluctab.tddClasses.chapterFour;

/*
Ask the user for a number
if the number is between 90 and above, display A
if the number is between 80 and 89, display B
if the number is between 70 and 79, display C
if the number is between 60 and 69, display D
if the number is between 59 and below, display F
 */


import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number and check grade: ");
        int userInput = input.nextInt();

        if(userInput >= 90){
            System.out.println("A");
        }
        if((userInput >= 80) && (userInput <= 89)){
            System.out.println("B");
        }
        if((userInput >= 70) && (userInput <= 79)){
            System.out.println("C");
        }
        if((userInput >= 60) && (userInput <= 69)){
            System.out.println("D");
        }
        if(userInput <= 59){
            System.out.println("F");
        }
    }
}
