package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void testThatTelevisionCanSwitchOn(){
        //given
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(false);
        assertFalse(myTelevision.isOn());
        //when
        myTelevision.setOn(true);
        //check that
        assertTrue(myTelevision.isOn());
    }

    @Test
    public void testThatTelevisionCanIncreaseVolume(){
        //given
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        assertEquals(0, myTelevision.getVolume());
        //when
        myTelevision.increaseVolume();//volume 1
        myTelevision.increaseVolume();//volume 2
        myTelevision.increaseVolume();//volume 3
        myTelevision.increaseVolume();//volume 4
        myTelevision.increaseVolume();//volume 5
        //check that
        assertEquals(5, myTelevision.getVolume());
    }

    @Test
    public void testThatTelevisionCanDecreaseVolume(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        assertEquals(2, myTelevision.getVolume());
        //given
        myTelevision.decreaseVolume();
        //check that
        assertEquals(1, myTelevision.getVolume());
    }

    @Test
    public void testThatVolumeMustNotExceedMaximumNumber(){
        //given
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        assertEquals(0, myTelevision.getVolume());
        //when
        myTelevision.increaseVolume();//volume 1
        myTelevision.increaseVolume();//volume 2
        myTelevision.increaseVolume();//volume 3
        myTelevision.increaseVolume();//volume 4
        myTelevision.increaseVolume();//volume 5
        myTelevision.increaseVolume();//volume 6
        myTelevision.increaseVolume();//volume 7
        myTelevision.increaseVolume();//volume 8
        myTelevision.increaseVolume();//volume 9
        myTelevision.increaseVolume();//volume 10
        //check that
        assertEquals(10, myTelevision.getVolume());
    }

    @Test
    public void testThatVolumeMustNotGoBelowTheMinimumNumber(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        myTelevision.increaseVolume();
        assertEquals(1, myTelevision.getVolume());
        //given
        myTelevision.decreaseVolume();
        //check that
        assertEquals(1, myTelevision.getVolume());
    }

    @Test
    public void testThatTelevisionShouldNotIncreaseVolumeWhenSwitchedOff(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(false);
        //given
        myTelevision.increaseVolume();
        //check that
        assertEquals(0, myTelevision.getVolume());
    }

    @Test
    public void testThatTelevisionShouldNotDecreaseVolumeWhenSwitchedOff(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(false);
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        //given
        myTelevision.decreaseVolume();
        //check that
        assertEquals(0, myTelevision.getVolume());
    }

    @Test
    public void testThatTelevisionCanSetChannel(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        //given
        myTelevision.setChannel(9);
        //check that
        assertEquals(9, myTelevision.getChannel());
    }

    @Test
    public void testThatTelevisionShouldNotSetChannelWhenSwitchedOff(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(false);
        //given
        myTelevision.setChannel(5);
        //check that
        assertEquals(0, myTelevision.getChannel());
    }

    @Test
    public void testThatTelevisionRetainsPreviousChannelWhenSwitchedOn(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        myTelevision.setChannel(5);
        myTelevision.setOn(false);
        assertEquals(0, myTelevision.getChannel());
        //given
        myTelevision.setOn(true);
        //check that
        assertEquals(5, myTelevision.getChannel());
    }

    @Test
    public void testThatTelevisionCanIncreaseChannelFrequency(){
       //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        myTelevision.setChannel(5);
        //given
        myTelevision.increaseChannelFrequency();
        //check that
        assertEquals(6, myTelevision.getChannel());
    }
    @Test
    public void testThatTelevisionCannotIncreaseWhenItIsSwitchedOff(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        myTelevision.setChannel(5);
        //given
        myTelevision.setOn(false);
        myTelevision.increaseChannelFrequency();
        assertEquals(0, myTelevision.getChannel());
    }

    @Test
    public void testThatTelevisionChannelShouldNotIncreaseThan100(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        myTelevision.setChannel(100);
        //given
        myTelevision.increaseChannelFrequency();
        assertEquals(100, myTelevision.getChannel());
    }

    @Test
    public void testThatTelevisionCanDecreaseChannelFrequency(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        myTelevision.setChannel(100);
        //given
        myTelevision.decreaseChannelFrequency();
        //check that
        assertEquals(99, myTelevision.getChannel());
    }

    @Test
    public void testThatTelevisionCannotReduceChannelFrequencyWhenSwitchedOff(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(false);
        //given
        myTelevision.decreaseChannelFrequency();
        //check that
        assertEquals(0, myTelevision.getChannel());
    }

    @Test
    public void testThatTelevisionChannelShouldNotReduceBeyond1(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.setOn(true);
        myTelevision.setChannel(1);
        //given
        myTelevision.decreaseChannelFrequency();
        //check that
        assertEquals(1, myTelevision.getChannel());
    }

    @Test
    public void testThatTelevisionCanIncreaseBrightness(){
        //when
        Television myTelevision = new Television("Samsung");
        //given
        myTelevision.increaseBrightness();
        //check that
        assertEquals(1, myTelevision.getBrightness());
    }

    @Test
    public void testThatTelevisionCanDecreaseBrightness(){
        //when
        Television myTelevision = new Television("Samsung");
        myTelevision.increaseBrightness();
        myTelevision.increaseBrightness();
        //given
        myTelevision.decreaseBrightness();
        assertEquals(1, myTelevision.getBrightness());
    }
}
