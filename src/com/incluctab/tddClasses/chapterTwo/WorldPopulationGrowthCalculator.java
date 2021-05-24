package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter current population: ");
        double population = input.nextDouble();

        System.out.println("Enter annual growth rate: ");
        double growthRate = input.nextDouble();
        growthRate = growthRate / 100;

        double firstYear = population + (population * growthRate);
        System.out.printf("First Year: %f%n", firstYear);

        double secondYear = firstYear + (firstYear * growthRate);
        System.out.printf("Second Year: %f%n", secondYear);

        double thirdYear = secondYear + (secondYear * growthRate);
        System.out.printf("Third Year: %f%n", thirdYear);

        double fourthYear = thirdYear + (thirdYear * growthRate);
        System.out.printf("Fourth Year: %f%n", fourthYear);


    }
}
