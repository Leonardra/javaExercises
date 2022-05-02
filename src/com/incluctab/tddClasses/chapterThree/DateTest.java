package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


public class DateTest {

    @Test
    public void testThatDayCanBeUpdated(){
        Date newDate = new Date();
        newDate.setDay(23);
        assertEquals(23, newDate.getDay());
    }

    @Test
    public void testThatDayCannotBeANegativeNumber(){
        Date newDate = new Date();
        newDate.setDay(23);
        assertEquals(23, newDate.getDay());
    }

    @Test
    public void testThatDayDoesNotExceedThirtyDays(){
        Date newDate = new Date();
        newDate.setDay(31);
        assertEquals(31, newDate.getDay());
    }

    @Test
    public void testThatMonthCanBeUpdated(){
        Date newDate = new Date();
        newDate.setMonth(12);
        assertEquals(12, newDate.getMonth());
    }

    @Test
    public void testThatMonthCannotExceedTwelveMonth(){
        Date newDate = new Date();
        newDate.setMonth(12);
        assertEquals(12, newDate.getMonth());
    }

    @Test
    public void testThatMonthDoesNotTakeInNegativeMonth(){
        Date newDate = new Date();
        newDate.setMonth(2);
        assertEquals(2, newDate.getMonth());
    }

    @Test
    public void testThatYearCanBeUpdated(){
        Date newDate = new Date();
        newDate.setYear(2021);
        assertEquals(2021, newDate.getYear());
    }

    @Test
    public void testThatYearShouldBeFourDigits(){
        Date newDate = new Date();
        newDate.setYear(2030);
        assertEquals(2030, newDate.getYear());

    }

    @Test
    public void testThatDateCanBeDisplayed(){
        Date newDate = new Date(12,2,2030);
        assertEquals("12/2/2030", newDate.displayDate());
    }


}
