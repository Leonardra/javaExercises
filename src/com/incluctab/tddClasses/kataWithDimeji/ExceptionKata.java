package com.incluctab.tddClasses.kataWithDimeji;

import java.util.Scanner;

public class ExceptionKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInput = 0;
        int secondInput = 0;
        try {
            System.out.println("Enter first number: ");
            firstInput = input.nextInt();
        }catch (IllegalArgumentException Exception){
            System.out.println("Enter valid input");
        }

        try {
            System.out.println("Enter second number: ");
            secondInput = input.nextInt();
        } catch(IllegalArgumentException exception){
            System.out.println("Enter valid input");
        }

        addNumber(firstInput, secondInput);

    }

    public static void addNumber(int firstInput, int secondInput){
        if (firstInput > 10 || firstInput < 0){
            throw new IllegalArgumentException ("Enter valid message");
        }

        if (secondInput > 10 || secondInput < 0){
            throw new IllegalArgumentException ("Enter valid message");
        }

        int sum = firstInput + secondInput;
        System.out.println(sum);
    }
}
