package com.incluctab.tddClasses.chapterFourteen;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Word: ");
        String firstWord = input.next();

        System.out.println("Enter second word: ");
        String secondWord = input.next();

        compareStrings(firstWord, secondWord);
    }

    private static void compareStrings(String firstWord, String secondWord) {
        if(firstWord.compareTo(secondWord) == 0){
            System.out.println("First word is equal to second word");
        }else if(firstWord.compareTo(secondWord) < 0){
            System.out.println("First word is less than second word");
        }else {
            System.out.println("First word is greater than second word");
        }
    }
}
