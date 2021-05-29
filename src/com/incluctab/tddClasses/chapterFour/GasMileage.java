package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int milesPerDrive = 0;
        int gasUsage = 0;
        int sentinelValue = -1;
        int totalMilesPerGallon = 0;

        while(milesPerDrive != sentinelValue || gasUsage != sentinelValue) {

            System.out.println("Enter miles driven: ");
            milesPerDrive = input.nextInt();

            System.out.println("Enter gas usage");
            gasUsage = input.nextInt();

            if(milesPerDrive != sentinelValue && gasUsage != sentinelValue) {
                int milesPerGallon = milesPerDrive / gasUsage;
                System.out.println("Miles Per Gallon: " + milesPerGallon);

                totalMilesPerGallon = milesPerGallon + totalMilesPerGallon;
            }

        }
        System.out.println("Total miles per gallon is "+totalMilesPerGallon);
    }
}
