package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sentinelValue = -1;
        int scoreCounter = 0;
        int studentScore = 0;
        double sum = 0;

        while(sentinelValue != studentScore){
            System.out.println("Enter student score or press -1 to exit:");
            studentScore = input.nextInt();
            if(sentinelValue != studentScore){
                sum = studentScore + sum;
                scoreCounter ++;
            }

        }
        double average = sum/scoreCounter;

        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+average);
    }
}
