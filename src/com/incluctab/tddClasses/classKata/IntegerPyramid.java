package com.incluctab.tddClasses.classKata;

import java.util.Scanner;

public class IntegerPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for(int count = 0; count <= numberOfLines ; count++){

            for(int spaceCount = 2* (numberOfLines -count); spaceCount >= 0; spaceCount --){
                System.out.print(" ");
            }
            for(int numberCount = count+1; numberCount >= numberOfLines; numberCount --){
                System.out.print(numberCount);
                System.out.print(" ");
            }
            for(int numberCount = 2; numberCount <= count; numberCount++){
                System.out.print(numberCount);
                System.out.print(" ");
            }
            System.out.println();


        }
    }

}
