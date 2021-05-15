package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {


    @Test
    public void testThatBikeDoesNotSetSpeedWhenOff(){
        //when
        Bike newBike = new Bike();
        //given
        newBike.setOn(false);
        assertFalse((Boolean) newBike.bikeIsOn(false));
        newBike.setSpeedInKmPerHour(0);
        //check that
        assertEquals(0, newBike.getSpeedInKmPerHour());
    }


}
