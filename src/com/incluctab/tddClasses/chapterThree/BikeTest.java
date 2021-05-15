package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Requirements
1) Bike should be changed speed till its on.
2) Bike can accelerate and decelerate
2) Gears should change automatically:
 - If Speed reaches 20, current gear number changes from 1 to 2
 - If Speed reaches 40, current gear number changes from 2 to 3
 - If speed reaches 60, current gear number changes from 3 to 4
 - If speed reaches 80, bike shows warning sign.
3)Speed should be in the multiples of the current gear number.
4) Bike should have fuel gauge.

 */

public class BikeTest {

    private Bike newBike;

    @BeforeEach
    public void startTheTestWithThis(){
        newBike = new Bike();
    }


    @Test
    public void testThatBikeDoesNotSetSpeedWhenOff(){
        //given
        newBike.setOn(false);
        assertFalse((Boolean) newBike.bikeIsOn());
        newBike.setSpeedInKmPerHour(0);
        //check that
        assertEquals(0, newBike.getSpeedInKmPerHour());
    }

    @Test
    public void testThatBikeCanAccelerate(){
        //given
        newBike.setOn(true);
        assertTrue((Boolean) newBike.bikeIsOn());
        newBike.setSpeedInKmPerHour(15);
        newBike.setCurrentGearNumber(1);
        assertEquals(1, newBike.getCurrentGearNumber());
        //when
        newBike.setSpeedInKmPerHour(20);
        newBike.accelerate();
        //check that
        assertEquals(22, newBike.getSpeedInKmPerHour());
        assertEquals(2, newBike.getCurrentGearNumber());
    }
    @Test
    public void testThatBikeCanDecelerate(){
        //when
        newBike.setOn(true);
        newBike.setSpeedInKmPerHour(22);
        newBike.accelerate();
        assertEquals(2, newBike.getCurrentGearNumber());
        //given
        newBike.setSpeedInKmPerHour(15);
        newBike.decelerate();
        assertEquals(1, newBike.getCurrentGearNumber());
    }

}
