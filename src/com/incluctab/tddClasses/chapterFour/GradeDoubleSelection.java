package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class GradeDoubleSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number and check grade: ");
        int userInput = input.nextInt();

        if (userInput >= 90) {
            System.out.println("A");
        } else {
            if (userInput >= 80) {
                System.out.println("B");
            } else {
                if (userInput >= 70) {
                    System.out.println("C");
                } else {
                    if (userInput >= 60) {
                        System.out.println("D");
                    } else {
                        System.out.println("F");
                    }
                }
            }
        }
    }
}
