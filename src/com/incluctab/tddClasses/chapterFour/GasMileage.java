package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class GasMileage {

    private static double totalMilesPerGallon;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int milesDriven = 0;

        do {
            System.out.println("Enter miles driven or -1 to exit");
            milesDriven = input.nextInt();

            if(milesDriven == -1){
                break;
            }

            System.out.println("Enter gallons used or -1 to exit");
            int gallonsUsed = input.nextInt();

            calculateMilesPerGallon(milesDriven, gallonsUsed);
        }while(milesDriven != -1);

        System.out.println("Total miles per gallon is "+totalMilesPerGallon);

    }
    public static void calculateMilesPerGallon(int milesDriven, int usedGallon){
        double milePerGallon = milesDriven / usedGallon;
        System.out.println("Miles Per Gallon for this trip is " +milePerGallon);

        totalMilesPerGallon += milePerGallon;
    }
}
