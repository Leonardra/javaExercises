package com.incluctab.tddClasses.chapterSeven;

public class sumOfArray {
    public static void main(String[] args) {
        int counter = 0;
        int scores [] = {24, 34, 50, 45, 60};
        int sum = 0;

        while(counter < scores.length){
            sum += scores[counter];
            counter++;
        }
        System.out.println(sum);
    }
}
