package com.incluctab.tddClasses.chapterTwo;

public class SquareCube {
    public static void main(String[] args) {

        System.out.println("number\tsquare\tcube");
        for (int number = 0; number <=10 ; number++) {
            System.out.printf("%d\t\t%d\t\t%d\n", number , (int) Math.pow(number, 2), calculateCube(number));
        }
    }

    public static int calculateSquare(int number){
        return number * number;
    }

    public static int calculateCube(int number){
        return number * number * number;
    }


}
