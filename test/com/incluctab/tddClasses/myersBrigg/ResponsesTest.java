package com.incluctab.tddClasses.myersBrigg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponsesTest {
    Responses answers;
    @BeforeEach
    void setUp() {
        answers = new Responses('a');
    }

    @Test
    void thatResponseHasAnswers(){
        int[] answer = answers.getResponse();
        assertNotNull(answer);
        assertEquals(2, answer.length);
    }

    @Test
    void thatAnswerCanBeInitialised(){
        int[] answer = answers.getResponse();
        assertEquals(1, answer[0]);
        assertEquals(0, answer[1]);

    }
}