package com.incluctab.tddClasses.chapterThree;

import java.util.Scanner;

public class HeartRateApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Firstname: ");
        String firstName = input.next();

        System.out.println("Enter Lastname: ");
        String lastName = input.next();

        System.out.println("Enter birth day: ");
        int birthDay = input.nextInt();

        System.out.println("Enter birth month: ");
        int birthMonth = input.nextInt();

        System.out.println("Enter year of birth: ");
        int birthYear = input.nextInt();

        Date birthDate = new Date(birthDay, birthMonth, birthYear);

        HeartRate newPatient = new HeartRate(firstName, lastName, birthDate);

        System.out.println("Age is "+newPatient.calculateAge(birthYear));
        System.out.println("Maximum Heart Rate is "+newPatient.calculateMaximumHeartRate(birthYear));
        System.out.println(newPatient.calculateTargetHeartRate(birthYear));

    }
}
