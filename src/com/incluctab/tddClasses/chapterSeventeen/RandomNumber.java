package com.incluctab.tddClasses.chapterSeventeen;

import java.security.SecureRandom;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println(generatePrimeNumbers());
    }

    private static int generateRandomEvenNumbers() {
        SecureRandom s = new SecureRandom();
        int numbers = 500000 + s.nextInt(1000000);
        if(numbers% 2 == 0)
            return numbers;
        else return generateRandomEvenNumbers();
    }

    private static int generatePrimeNumbers() {
        SecureRandom s = new SecureRandom();
        int numbers= 500000 + s.nextInt(1000000);
        int prime = 0;
        for (int i = 2; i <= Math.sqrt(numbers); i++){
            if(i % numbers != 0){
                prime = i;
            }
        }
        return prime;
    }


}
