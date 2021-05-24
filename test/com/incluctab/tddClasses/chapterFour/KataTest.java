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

    @Test
    public void testThatCopiesBetween4and1IsOneThousandFiveHundredNaira(){
        Kata newKata = new Kata();
        newKata.numberOfCopies(4);
        assertEquals(1500, newKata.numberOfCopies(4));
    }

    @Test
    public void testThatCopiesBetween5And9IsOneThousandFourHundredNaira(){
        Kata newKata = new Kata();
        assertEquals(1400, newKata.numberOfCopies(6));
    }

    @Test
    public void testThatCopiesBetween10And29IsOneThousandTwoHundredNaira(){
        Kata newKata = new Kata();
        assertEquals(1200, newKata.numberOfCopies(29));
    }

    @Test
    public void testThatCopiesBetween30And49IsOneThousandOneHundredNaira(){
        Kata newKata = new Kata();
        assertEquals(1100, newKata.numberOfCopies(36));
    }

    @Test
    public void testThatCopiesBetween50And99IsOneThousandNaira(){
        Kata newKata = new Kata();
        assertEquals(1000, newKata.numberOfCopies(67));
    }

    @Test
    public void testThatCopiesBetween100And199IsNineHundredNaira(){
        Kata newKata = new Kata();
        assertEquals(900, newKata.numberOfCopies(197));
    }

    @Test
    public void testThatCopiesBetween200AndAboveIsEightHundredNaira(){
        Kata newKata = new Kata();
        assertEquals(800, newKata.numberOfCopies(2000));
    }

    @Test
    public void testThatNumbersOfAFactorsAreCounted(){
        Kata newKata = new Kata();
        assertEquals(4, newKata.countNumberOfFactors(10));

    }



}


