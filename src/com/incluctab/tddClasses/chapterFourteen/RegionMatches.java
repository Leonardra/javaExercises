package com.incluctab.tddClasses.chapterFourteen;

import java.util.Scanner;

public class RegionMatches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Word: ");
        String firstWord = input.next();

        System.out.println("Enter second word: ");
        String secondWord = input.next();

        if(firstWord.regionMatches(true, 2, secondWord, 2, 3)){
            System.out.println("First word matches with second word");
        }else{
            System.out.println("First word does not match with second word");
        }
    }
}
