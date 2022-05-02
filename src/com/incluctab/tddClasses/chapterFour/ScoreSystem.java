package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class ScoreSystem {
    /*
    * ask for the number of people in a class.
    * collect scores of each persons
    * until you have collected the total scores of people in a class, keep calculating the sum and average.
    * When you are done, show the sum.
    * Show the average.
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are in your class: ");
        int studentsWithinClass = input.nextInt();

        int scoresCounter = 1;
        double sum = 0;
        double average = 0;
        int counter = 1;

        while(scoresCounter <= studentsWithinClass){
            System.out.printf("%d: Enter your score: %n", counter++);
            double score = input.nextDouble();
            sum = score + sum;
            average = sum/studentsWithinClass;
            scoresCounter ++;
        }
        System.out.println("Sum: " +sum);
        System.out.println("Average " +average);

    }
}
