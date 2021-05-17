package com.incluctab.tddClasses;

public class LogicalExercises {
    public static void main(String[] args) {

        System.out.println((true) && (3 > 4));

        int x = 1;
        System.out.println(!(x > 0) && (x > 0));

        System.out.println((x > 0) || (x < 0));

        System.out.println((x != 0) || (x == 0));

        System.out.println((x >= 0) || (x < 0));

        System.out.println((x != 1) == !(x == 1));
    }
}
