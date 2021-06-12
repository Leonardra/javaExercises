package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartRateTest {
    @Test
    void thatHeartRatesClassExists(){
        //when
        HeartRate heartRate = new HeartRate();
        //assert that
        assertNotNull(heartRate);
        assertTrue(heartRate instanceof HeartRate);
    }

    @Test
    void thatClassShouldInclude_personsFirstName(){
        //given
        HeartRate heartRate = new HeartRate("Confidence", "Okere", new Date (19,05,1997));
        //when
        String returnFirstName = heartRate.getFirstName();
        //assert that
        assertEquals("Confidence", returnFirstName);
        //when
        heartRate.setFirstName("Grace");
        returnFirstName = heartRate.getFirstName();
        //assert that
        assertEquals("Grace", returnFirstName);
    }

    @Test
    void thatClassShouldInclude_personsLastName(){
        //given
        HeartRate heartRate = new HeartRate("Oluwatobi", "Jolayemi", new Date (19,05,1997));
        //when
        String returnLastName = heartRate.getLastName();
        //assert that
        assertEquals("Jolayemi", returnLastName );
        //when
        heartRate.setLastName("Ezekiel");
        returnLastName = heartRate.getLastName();
        assertEquals("Ezekiel", returnLastName);
    }

    @Test
    void thatClassShould_includePersonsDateOfBirth(){
        //given
        HeartRate heartRate = new HeartRate("Oluwatobi", "Jolayemi", new Date (12, 3, 2000));
        //when
        Date returnDateOfBirth = heartRate.getDateOfBirth();
        //assert that
        assertEquals("12/3/2000", returnDateOfBirth.displayDate());
        //when
        Date dateOfBirth = new Date(12, 4, 2004);
        heartRate.setDateOfBirth(dateOfBirth);
        returnDateOfBirth = heartRate.getDateOfBirth();
        //assert that
        assertEquals("12/4/2004", returnDateOfBirth.displayDate());
    }

    @Test
    void thatClassCanCalculateAge(){
        //given
        HeartRate heartRate = new HeartRate();
        Date newDate = new Date(12, 07, 1999);
        //when
        heartRate.setDateOfBirth(newDate);
        int birthYear = heartRate.getDateOfBirth().getYear();
        //assert that
        assertEquals(22, heartRate.calculateAge(birthYear));
    }

    @Test
    void thatClassCanCalculateMaximumHeartRate(){
        //given
        HeartRate heartRate = new HeartRate();
        Date newDate = new Date(12, 07,1997);
        heartRate.setDateOfBirth(newDate);
        int birthYear = heartRate.getDateOfBirth().getYear();
        //assert that
        assertEquals(196, heartRate.calculateMaximumHeartRate(birthYear));
    }

    @Test
    void thatClassCanCalculateTargetHeartRate(){
        //given
        HeartRate heartRate = new HeartRate();
        Date birthDate = new Date (12, 07, 1997);
        heartRate.setDateOfBirth(birthDate);
        int birthYear = heartRate.getDateOfBirth().getYear();
        //assert that
        assertEquals("Target heart rate is between 98.0 and 156.8.", heartRate.calculateTargetHeartRate(birthYear));
    }


}

