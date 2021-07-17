package com.incluctab.tddClasses.myersBrigg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    Question question;
    @BeforeEach
    void setUp() {
        question = new Question("Expend energy, enjoy groups","Conserve energy, enjoy one-on-one");
    }

    @Test
    void thatQuestionHasTwoChoices(){
        String[] choices = question.getChoices();
        assertNotNull(choices);
        assertEquals(2, choices.length);
    }
}