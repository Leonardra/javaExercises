package com.incluctab.tddClasses.chapterFive;

import java.util.Scanner;

public class ScoreApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of student: ");
        int numberOfStudent = input.nextInt();
        int count= 1;
        String studentName;
        int studentScore = 0;
        int highestScore = studentScore;
        String brightStudent = "Null";

        while(count <= numberOfStudent){
            System.out.println("Enter Student Name: ");
            studentName = input.next();
            System.out.println("Enter Student Score: ");
            studentScore = input.nextInt();

            if(studentScore > highestScore){
                brightStudent = studentName;
                highestScore = studentScore;
            }
            count++;
        }

        System.out.println("Student with the highest score is " +brightStudent);
    }
}
