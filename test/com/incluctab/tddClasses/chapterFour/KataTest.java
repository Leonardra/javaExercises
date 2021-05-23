package com.incluctab.tddClasses.chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class KataTest {
    @Test
    public void testThatScoresBetween90AndAboveShouldBeGradeA() {
        Kata newKata = new Kata();
        assertEquals("A", newKata.grade(95));
    }

    @Test
    public void testThatScoresBetween80And89ShouldBeGradeB() {
        Kata newKata = new Kata();
        assertEquals("B", newKata.grade(89));
    }
    @Test
    public void testThatScoresBetween70And79ShouldBeGradeC(){
        Kata newKata = new Kata();
        assertEquals("C", newKata.grade(76));
    }
    @Test
    public void testThatScoresBetween60And69ShouldBeGradeD(){
        Kata newKata = new Kata();
        assertEquals("D", newKata.grade(65));
    }

    @Test
    public void testThatScoresBetween59andBelowShouldBeGradeF(){
        Kata newKata = new Kata();
        assertEquals("F", newKata.grade(43));
    }
}


