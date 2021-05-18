package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner myAirConditioner;
    @BeforeEach
    public void startEveryMethodWithThis(){
        myAirConditioner = new AirConditioner("Samsung");
    }
    @Test
    public void testThatAirConditionerCanSwitchOn(){
        myAirConditioner.setOn(false);
        assertFalse(myAirConditioner.isOn());
        myAirConditioner.setOn(true);
        assertTrue(myAirConditioner.isOn());
    }

    @Test
    public void testThatAirConditionerCanDecreaseTemperature(){
        myAirConditioner.setOn(true);
        myAirConditioner.setTemperature(30);
        myAirConditioner.decreaseTemperature();
        assertEquals(29, myAirConditioner.getTemperature());

    }
    @Test
    public void testThatTemperatureCannotBeDecreasedBelowOne(){
        myAirConditioner.setOn(true);
        myAirConditioner.setTemperature(20);
        myAirConditioner.decreaseTemperature();
        assertEquals(19, myAirConditioner.getTemperature());
    }
    @Test
    public void testThatAirConditionCanIncreaseTemperature(){
        myAirConditioner.setOn(true);
        myAirConditioner.setTemperature(19);
        myAirConditioner.increaseTemperature();
        assertEquals(20, myAirConditioner.getTemperature());

    }
    @Test
    public void testThatAirConditionerCannotIncreaseAboveThirty(){
        myAirConditioner.setOn(true);
        myAirConditioner.setTemperature(30);
        myAirConditioner.increaseTemperature();
        assertEquals(30, myAirConditioner.getTemperature());

    }
    @Test
    public void testThatAirConditionWillNotDecreaseWhenOff(){
        myAirConditioner.setOn(false);
        myAirConditioner.setTemperature(30);
        myAirConditioner.decreaseTemperature();
        assertEquals(30, myAirConditioner.getTemperature());
    }
    @Test
    public void testThatAirConditionWillNotIncreaseWhenOff(){
        myAirConditioner.setOn(false);
        myAirConditioner.setTemperature(29);
        myAirConditioner.increaseTemperature();
        assertEquals(29, myAirConditioner.getTemperature());
    }
    @Test
    public void testThatAirConditionHasDefaultTemperatureWhenTurnedOn(){
        myAirConditioner.setOn(true);
        assertEquals(16, myAirConditioner.getTemperature());
    }
}
