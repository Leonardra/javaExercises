package com.incluctab.tddClasses.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class circleInSixTest {
    @Test
    void testThatMethodCanCalculateAreaOfACircle(){
        assertEquals(1661.9025137490005, CircleInSix.circleArea(23));
    }
}
