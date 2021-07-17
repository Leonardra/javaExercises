package com.incluctab.tddClasses.myersBrigg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Questionnaire questionnaire = new Questionnaire();
        System.out.println("Welcome to Myer Briggs!");


        for (int i = 0; i < questionnaire.getQuestion().size(); i++) {
            System.out.println("Question " + (i+1));
            System.out.println("Choice A:"+questionnaire.getQuestion().get(i).getChoices()[0]);
            System.out.println("Choice B:"+questionnaire.getQuestion().get(i).getChoices()[1]);
            System.out.print("Enter A or B to choose your preference:");

            char userOption = input.next().toLowerCase().charAt(0);
            questionnaire.getResponse().add(new Responses(userOption));
        emptySpaces(50);
        }


        System.out.printf("Your Personality Type is %s", questionnaire.getPersonalityType());
    }

    public static void emptySpaces(int numberOfSpaces){
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.println(" ");
        }
    }
}
