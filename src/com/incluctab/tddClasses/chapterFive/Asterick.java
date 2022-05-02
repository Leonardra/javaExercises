package com.incluctab.tddClasses.chapterFive;

public class Asterick {
    public static void main(String[] args) {
        displayFirstTriangle(15);
        displaySecondTriangle(15);
        displayThirdTriangle(15);
        displayFourthTriangle(15);
    }

    public static void displayFirstTriangle(int count) {
        for (int i = 0 ; i <= count; i++) {
            for (int asterickCount = count; asterickCount >= i; asterickCount--) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void displaySecondTriangle(int count) {
        for (int i = 0; i <= count; i++) {
            for (int asterickCount = 0; asterickCount <= i; asterickCount++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void displayThirdTriangle(int count) {
        for (int i = 0; i <= count; i++) {
            for (int spaceCount = 0; spaceCount <= i; spaceCount++) {
                System.out.print(" ");
            }
            for (int asterickCount = count; asterickCount >= i; asterickCount--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void displayFourthTriangle(int count) {

        for (int i = 0; i <= count; i++) {
            for (int spaceCount = count; spaceCount >= i; spaceCount--) {
                System.out.print(" ");
            }
            for (int asterickCount = 0; asterickCount <= i; asterickCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
