package com.incluctab.tddClasses.chapterSix;

import java.util.Scanner;

public class CircleInSix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius below:");
        int enterRadius = input.nextInt();

        System.out.println("Area of a circle is "+circleArea(enterRadius));
    }

    public static double circleArea(int radius) {
        double areaOfACircle = Math.PI * (radius * radius);
        return areaOfACircle;
    }
}
