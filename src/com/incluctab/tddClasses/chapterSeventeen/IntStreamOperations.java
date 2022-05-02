package com.incluctab.tddClasses.chapterSeventeen;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {1,3,4,5,6,7,8,8,2,7};

        System.out.print("Original values: ");
        System.out.println(
                IntStream.of(values).mapToObj(String::valueOf)
                         .collect(Collectors.joining(" "))
        );
    }
}
