package com.incluctab.tddClasses.chapterSeventeen;

import java.util.stream.IntStream;

public class evenn {
    public static void main(String[] args) {
//        int total = 0;
//        for (int i = 2; i <= 20; i+=2) {
//            total += i;
//        }
        System.out.print("Sum of the even number from 2 to 10 is: "
                +IntStream.rangeClosed(1,10) //Creates the data source
                .filter(x -> x%2==0)
                .map(x -> x * 3)//performs a processing step that maps each element to x, in order to be multiplied
                .sum()
        );


    }
}
