package com.incluctab.tddClasses.chapterSeventeen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.DoubleBinaryOperator;

public class DiettelExercise {
    public static void main(String[] args) {


        //A: Write a lambda expression that receives two double parameters a and b and returns their
        //product. Use the lambda form that explicitly lists the type of each parameter

        DoubleBinaryOperator doubleBinaryOperator = (double a, double b) -> {
            return a * b;
        };

//        System.out.println();

        //B
//        (a, b) -> {return a * b;}

        //C
//        (a, b) ->  a * b

        //D
//        ()-> System.out.println("Welcome to lambdas!")

        //E
//        ArrayList::new

        //F


    }
}
