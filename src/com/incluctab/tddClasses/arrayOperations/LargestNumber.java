package com.incluctab.tddClasses.arrayOperations;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();

        int largestNumber = 0;
        int secondLargestNumber = 0;

        if(firstNumber > largestNumber){
            largestNumber = firstNumber;
        }
        if(secondNumber > largestNumber){
            largestNumber = secondNumber;
        }
        if(thirdNumber > largestNumber){
            largestNumber = thirdNumber;
        }
        if(fourthNumber > largestNumber){
            largestNumber = fourthNumber;
        }


        System.out.println(largestNumber);
    }
}
