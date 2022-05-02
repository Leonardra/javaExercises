package com.incluctab.tddClasses.chapterSeventeen;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.printf("Sum of 1 through ten is: %d%n",
                IntStream.rangeClosed(1,10)
                         .sum());
    IntStream numbers = IntStream.rangeClosed(1,10);
        System.out.println(numbers);
    }


}
