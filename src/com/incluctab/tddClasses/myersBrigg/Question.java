package com.incluctab.tddClasses.myersBrigg;

public class Question {

    private final String[] choices;

    public Question(String firstChoice, String secondChoice) {
        choices = new String [2];
        choices [0] = firstChoice;
        choices [1] = secondChoice;
    }

    public String[] getChoices() {
        return choices;
    }
}
