package com.incluctab.tddClasses.chapterSeven;

import java.util.Scanner;

public class studentScoreApp {
    public static void main(String[] args) {

        int student = 0;
        int subject = 0;
        int studentScore;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudent = input.nextInt();

        System.out.println("Enter number of subjects");
        int numberOfSubject = input.nextInt();

        int[][] scores = new int [numberOfStudent][numberOfSubject];

        while(student < numberOfStudent){
            System.out.println("Enter scores for student " +student+ ":");
            studentScore = input.nextInt();
            while(subject < scores[numberOfStudent].length) {
                scores[student][subject] = studentScore;
//                System.out.print(scores[student][subject]);
                System.out.println(" ");
                subject++;
            }
            student++;
        }
    }

}
