package com.incluctab.tddClasses.chapterFive;

import java.util.Scanner;

public class TuitionProjector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialTuition;
        double tuitionIncrement;
        double annualTuitionFee;
        double totalTuitionFee = 0.0;
        double tenYears = 0.0;
        double fourYears = 0.0;
        int count = 1;

        System.out.println("Enter the initial tuition fee: ");
        initialTuition = input.nextInt();

        while(count <= 14){
            tuitionIncrement = (5 * initialTuition) / 100;
            annualTuitionFee = initialTuition + tuitionIncrement;
            initialTuition = annualTuitionFee;
            System.out.printf("The tuition for the year %d is: %f%n",count, annualTuitionFee);

            totalTuitionFee = totalTuitionFee + annualTuitionFee;

            if(count == 10){
                tenYears = totalTuitionFee;
            }
            if(count > 10){
                fourYears = fourYears + annualTuitionFee;
            }
            count++;
        }

        System.out.println("The total tuition is "+totalTuitionFee);
        System.out.println("The total tuition for 10 years is "+tenYears);
        System.out.println("The total tuition from year 11 to 14 is "+fourYears);


    }
}
