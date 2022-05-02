package com.incluctab.tddClasses.chapterFourteen;

import java.util.Scanner;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Word: ");
        String word = input.next();

        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
    }
}
