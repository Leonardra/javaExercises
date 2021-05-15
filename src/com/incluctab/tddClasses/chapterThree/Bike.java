package com.incluctab.tddClasses.chapterThree;

public class Bike {

    private boolean isOn;
    private int speedInKmPerHour;
    private int currentGearNumber;

    public void setOn(boolean bikeIgnition) {
        isOn = bikeIgnition;
        if(this.isOn){
            currentGearNumber = 1;
        }
        else{
            currentGearNumber = 0;
        }

    }

    public Object bikeIsOn(){
        return isOn;
    }

    public void setSpeedInKmPerHour(int currentSpeed) {
        if (isOn) {
            speedInKmPerHour = currentSpeed;
        }
    }

    public int getSpeedInKmPerHour() {
        return speedInKmPerHour;
    }

    public void accelerate(){
        if(speedInKmPerHour >= 1 && speedInKmPerHour < 20){
            currentGearNumber = 1;
        }
        if(speedInKmPerHour >= 20 && speedInKmPerHour < 40){
            currentGearNumber = 2;
        }
        if(speedInKmPerHour >= 40 && speedInKmPerHour < 60){
            currentGearNumber = 3;
        }
        if(speedInKmPerHour >= 60 && speedInKmPerHour < 80){
            currentGearNumber = 4;
        }

        speedInKmPerHour = speedInKmPerHour + currentGearNumber;
    }

    public int getCurrentGearNumber() {
        return currentGearNumber;
    }

    public void setCurrentGearNumber(int currentGearNumber) {
        this.currentGearNumber = currentGearNumber;
    }

    public void decelerate() {
        if(speedInKmPerHour >= 1 && speedInKmPerHour < 20){
            currentGearNumber = 1;
        }
        if(speedInKmPerHour >= 20 && speedInKmPerHour < 40){
            currentGearNumber = 2;
        }
        if(speedInKmPerHour >= 40 && speedInKmPerHour < 60){
            currentGearNumber = 3;
        }
        if(speedInKmPerHour >= 60 && speedInKmPerHour < 80){
            currentGearNumber = 4;
        }

        speedInKmPerHour = speedInKmPerHour - currentGearNumber;
    }
}
