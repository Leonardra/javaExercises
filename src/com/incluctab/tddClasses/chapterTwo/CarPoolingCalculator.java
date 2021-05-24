package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class CarPoolingCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Calculate your daily driving costs");

        System.out.println("Enter total miles per day: ");
        int totalMiles = input.nextInt();

        System.out.println("Enter gasoline cost per day: ");
        int gasolineCostPerGallon = input.nextInt();

        System.out.println("Enter average miles per gallon: ");
        int averageMiles = input.nextInt();

        System.out.println("Enter daily parking fee: ");
        int parkingFee = input.nextInt();

        System.out.println("Enter tolls per day: ");
        int tollsPerDay = input.nextInt();

        int dailyDrivingCost = (totalMiles / averageMiles) * gasolineCostPerGallon +
                parkingFee + tollsPerDay;

        System.out.println("Your daily driving cost is " +dailyDrivingCost);
    }
}
