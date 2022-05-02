package com.incluctab.tddClasses.chapterFourteen;

public class CharacterExercise {

    public static void main(String[] args) {
        Character letter = 'A';
        char primitiveLetter = letter;

        System.out.println(Character.digit(letter, 16));
        System.out.println(Character.forDigit(12, 16));
    }
}
