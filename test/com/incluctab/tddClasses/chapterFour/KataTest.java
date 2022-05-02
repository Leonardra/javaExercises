package com.incluctab.tddClasses.chapterFour;

import com.incluctab.tddClasses.chapterFive.Asterick;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testThatScoresBetween90AndAboveShouldBeGradeA() {
        assertEquals("A", Kata.grade(95));
    }

    @Test
    public void testThatScoresBetween80And89ShouldBeGradeB() {
        assertEquals("B", Kata.grade(89));
    }
    @Test
    public void testThatScoresBetween70And79ShouldBeGradeC(){
        assertEquals("C", Kata.grade(76));
    }
    @Test
    public void testThatScoresBetween60And69ShouldBeGradeD(){
        assertEquals("D", Kata.grade(65));
    }

    @Test
    public void testThatScoresBetween59andBelowShouldBeGradeF(){
        assertEquals("F", Kata.grade(43));
    }

    @Test
    public void testThatCopiesBetween4and1IsOneThousandFiveHundredNaira(){
        assertEquals(1500, Kata.numberOfCopies(4));
    }

    @Test
    public void testThatCopiesBetween5And9IsOneThousandFourHundredNaira(){
        assertEquals(1400, Kata.numberOfCopies(6));
    }

    @Test
    public void testThatCopiesBetween10And29IsOneThousandTwoHundredNaira(){
        assertEquals(1200, Kata.numberOfCopies(29));
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
        assertEquals(4, Kata.countNumberOfFactors(10));
    }

    @Test
    public void testThatNumberCanBeReversed(){
        assertEquals(32189,Kata.reverseNumber(98123));
    }

    @Test
    public void testThatNumberTakesInOnlyFiveDigits(){
        assertEquals(89321, Kata.reverseNumber(12398));
    }

    @Test
    public void testThatMethodCanFindFactorialOfANumber(){
        assertEquals(720, Kata.findFactorialOf(6));
        assertEquals(120, Kata.findFactorialOf(5));
        assertEquals(24, Kata.findFactorialOf(4));
        assertEquals(6, Kata.findFactorialOf(3));
        assertEquals(2,Kata.findFactorialOf(2));
    }

    @Test
    public void testThatTapCanPourWater(){
        assertEquals(20, Kata.waterIsFull(1));
    }

    @Test
    public void testThatBase10CanBeConvertedToBase2(){
        Kata.getBinaryNumber(18);
        assertEquals("10010", Kata.getBinaryNumber(18));
    }

    @Test
    public void testThatBaseNumberConverterWorks(){
        Kata.numberBaseConverter(18,2);
        assertEquals("10010", Kata.numberBaseConverter(18, 2));
    }

    @Test
    void thatMethodCanFindMaximumNumberFromArray(){
        int[] numberSeries = {12, 34, 45, 90, 56, 23, 10};
        assertEquals(90, Kata.findMaximumNumberFrom(numberSeries));

    }

    @Test
    void thatMethodCanFindMinimumNumberFromArray(){
        int[] numberSeries = {12, 34, 45, 56, 78, 10, 90};
        assertEquals(10, Kata.findMinimumNumberFrom(numberSeries));
    }

    @Test
    void thatMethodCanFindAverageFromArray(){
        int[] numberSeries = {12, 34, 45, 56, 78, 10, 90};
        assertEquals(46.43, Kata.findAverageFrom(numberSeries));
    }

    @Test
    void thatMethodCanSumThroughAnArray_andReturnMaximumNumber(){
        int[] numberSeries = {12, 34, 45, 56, 78, 10, 90};
        assertEquals(315, Kata.findMaximumFromSumOf(numberSeries));
    }

    @Test
    void thatMethodCanSumThroughAnArray_andReturnMinimumNumber(){
        int[] numberSeries = {12, 34, 45, 56, 78, 10, 90};
        assertEquals(235, Kata.findMinimumFromSumOf(numberSeries));
        numberSeries = new int [] {1,2,3,4,5};
        assertEquals(10, Kata.findMinimumFromSumOf(numberSeries));
    }

    @Test
    void thatMethodCanReturnTheNextSequence(){
        assertEquals(8, Kata.getNextSequence(2,4,6));
    }




}


