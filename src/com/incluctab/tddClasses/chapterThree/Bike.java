package com.incluctab.tddClasses.chapterThree;

public class Bike {

    private boolean isOn;
    private int speedInKmPerHour;

    public void setOn(boolean bikeIgnition) {
        isOn = bikeIgnition;
    }

    public Object bikeIsOn(boolean bikeIsOn) {
        return isOn;
    }

    public void setSpeedInKmPerHour(int currentSpeed) {
        speedInKmPerHour = currentSpeed;
    }

    public int getSpeedInKmPerHour() {
        return speedInKmPerHour;
    }
}
