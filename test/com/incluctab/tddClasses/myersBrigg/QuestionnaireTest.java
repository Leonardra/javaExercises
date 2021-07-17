package com.incluctab.tddClasses.myersBrigg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionnaireTest {
    private Questionnaire newQuestionnaire;
    @BeforeEach
    void setUp(){
        newQuestionnaire = new Questionnaire();
    }
    @Test
    void thatQuestionnaireHasListOfQuestions(){
        //when
        List<Question> questionList = newQuestionnaire.getQuestion();
        //assert
        assertNotNull(questionList);
        assertFalse(questionList.isEmpty());
        assertEquals(22, questionList.size());
    }

    @Test
    void thatQuestionnaireCanStoreResponse(){
        //given
        List<Responses> responseList = newQuestionnaire.getResponse();
        assertNotNull(responseList);
        assertTrue(responseList.isEmpty());
    }

    @Test
    void thatResponsesCanBeProcessed(){
        for (int i = 0; i < 20; i++) {
            newQuestionnaire.getResponse().add(new Responses('a'));
        }
        Responses[] response = newQuestionnaire.processResponse();
        assertArrayEquals(new int[]{5,0}, response[0].getResponse());
        assertArrayEquals(new int[]{5,0}, response[1].getResponse());
        assertArrayEquals(new int[]{5,0}, response[2].getResponse());
        assertArrayEquals(new int[]{5,0}, response[3].getResponse());

        newQuestionnaire.getResponse().forEach(
                responses -> System.out.println(Arrays.toString(responses.getResponse()))
        );
    }

    @Test
    void thatQuestionnaireCanGetPersonalityType(){
        for (int i = 0; i < 20; i++) {
            newQuestionnaire.getResponse().add(new Responses('a'));
        }

        String personalityType = newQuestionnaire.getPersonalityType();
        assertEquals("ESTJ", personalityType);
    }

}
