package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HealthProfileTest {
    @Test
    void thatHealthProfileClassExists(){
        //When
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Adewale", "Male", new Date(06, 07, 1997), 175.4, 88.5);
        //Assert that
        assertNotNull(newHealthProfile);
        assertTrue(newHealthProfile instanceof HealthProfile);
    }

    @Test
    void thatHealthProfileHasName(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Adewale", "Male", new Date(06, 07, 1997), 175.4, 88.5);
        //when
        String patientFirstName = newHealthProfile.getFirstName();
        //assert that
        assertEquals("Oluwatobi", patientFirstName);
    }

    @Test
    void thatFirstNameCanBeSet(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Adewale", "Male", new Date(06, 07, 1997), 175.4, 88.5);
        //when
        newHealthProfile.setFirstName("Oluwatobi");
        //assert that
        assertEquals("Oluwatobi", newHealthProfile.getFirstName());
    }

    @Test
    void thatHealthProfileHasLastName(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi", "Male", new Date(06, 07, 1997), 175.4, 88.5);
        //when
        String returnLastName = newHealthProfile.getLastName();
        //assert that
        assertEquals("Jolayemi", returnLastName);
    }

    @Test
    void thatHealthProfileCanSetLastName(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi", "Male", new Date(06, 07, 1997), 175.4, 88.5);
        //when
        newHealthProfile.setLastName("Ogungbemi");
        //assert that
        assertEquals("Ogungbemi", newHealthProfile.getLastName());
    }

    @Test
    void thatHealthProfileHasGender(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi", "Male", new Date(06, 07, 1997), 175.4, 88.5);
        //when
        String patientGender = newHealthProfile.getGender();
        //assert that
        assertEquals("Male", patientGender);
    }

    @Test
    void thatHealthProfileSetGender(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi", "Male", new Date(06, 07, 1997), 175.4, 88.5);
        //when
        newHealthProfile.setGender("Female");
        //assert that
        assertEquals("Female", newHealthProfile.getGender());
    }

    @Test
    void testThatHealthProfileHasDateOfBirth(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi", "Male",
                                                            new Date (06,07,1997), 175.4, 88.5);
        //when
        Date patientDateOfBirth = newHealthProfile.getDateOfBirth();
        //assert that
        assertEquals("6/7/1997", patientDateOfBirth.displayDate());
        //when
        Date dateOfBirth = new Date(07,12, 1998);
        newHealthProfile.setDateOfBirth(dateOfBirth);
        patientDateOfBirth = newHealthProfile.getDateOfBirth();
        //assert that
        assertEquals("7/12/1998", patientDateOfBirth.displayDate());
    }

    @Test
    void thatHealthProfileHasHeight(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi", "Male",
                                                            new Date(02,04,1998), 175.4, 88.5);
        //given
        Double patientHeight = newHealthProfile.getHeight();
        //assert that
        assertEquals(175.4, patientHeight);
    }

    @Test
    void thatHealthProfileCanSetHeight(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi", "Male",
                new Date(02,04,1998), 175.4, 88.5);
        //when
        newHealthProfile.setHeight(180.0);
        //assert that
        assertEquals(180.0, newHealthProfile.getHeight());
    }

    @Test
    void thatHealthProfileHasWeight(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi","Male",
                new Date(02,11,2016),175.4, 88.5);
        //when
        double patientWeight = newHealthProfile.getWeight();
        //assert that
        assertEquals(88.5, patientWeight);
    }

    @Test
    void thatHealthProfileCanSetWeight(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi","Male",
                new Date(02,11,2016),175.4, 88.5);
        //when
        newHealthProfile.setWeight(99.7);
        //assert that
        assertEquals(99.7, newHealthProfile.getWeight());
    }

    @Test
    void thatHealthProfileCanCalculateAge(){
        //given
        HealthProfile newHealthProfile = new HealthProfile("Oluwatobi", "Jolayemi","Male",
                new Date(02,11,1997),175.4, 88.5);
        //when
        int myDob = newHealthProfile.calculateAge(newHealthProfile.getDateOfBirth().getYear());
        assertEquals(24, myDob);
    }
    @Test
    void thatHealthProfileHasMaximumHeartRate(){

    }





}
