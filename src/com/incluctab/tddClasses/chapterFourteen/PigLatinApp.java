package com.incluctab.tddClasses.chapterFourteen;

import java.util.Scanner;

public class PigLatinApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word: ");
        String sentence = input.nextLine();

        String [] tokens = sentence.split(" ");
        for (String token: tokens) {
            printLatinWord(token);
            System.out.print(" ");
        }
    }

    public static void printLatinWord(String token){
        StringBuilder pigLatin = new StringBuilder(token.substring(1));
        pigLatin.append(token.charAt(0)).append("ay ");
        System.out.print(pigLatin);
    }
}
