package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Check your BMI here");

        System.out.print("Weight in Kg: ");
        double weightInKilograms = input.nextDouble();

        System.out.print("Height in inches: ");
        double heightInInches = input.nextDouble();

        double bmi = weightInKilograms/(heightInInches * heightInInches);

        if(bmi < 18.5){
            System.out.println("Underweight");
        } else {
            if(bmi <= 24.9){
                System.out.println("Normal");
            } else {
                if(bmi <= 29.9){
                    System.out.println("Overweight");
                } else{
                    if(bmi > 30){
                        System.out.println("Obese");
                    }
                }
            }
        }
    }
}
