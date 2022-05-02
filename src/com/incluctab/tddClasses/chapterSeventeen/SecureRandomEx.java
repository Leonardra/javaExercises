package com.incluctab.tddClasses.chapterSeventeen;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecureRandomEx {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        System.out.printf("");
        random.ints(60_000_000, 1,7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .forEach((face,frequency)-> System.out.print(face+"\n"+ frequency));
    }
}
