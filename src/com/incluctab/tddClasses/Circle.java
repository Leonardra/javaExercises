package com.incluctab.tddClasses;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a radius and get the diameter, circumference and area of a circle: ");
        double diameter = 2 * (Math.PI);
        int radius= input.nextInt();
        double circumference = 2 * (Math.PI) * radius;
        double area = (Math.PI) * radius * radius;

            System.out.println("Diameter: " + diameter);
            System.out.println("Area: " +area);
            System.out.println("Circumference: " + circumference);
    }
}
