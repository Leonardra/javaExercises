package com.incluctab.tddClasses.chapterThree;

public class AirConditioner {

    private String productName;
    private boolean isOn;
    private int temperature = 16;

    public AirConditioner (String brandName){
        productName = brandName;
    }

    public void setOn(boolean ignition) {
        isOn = ignition;
    }

    public boolean isOn() {
        return isOn;
    }


    public void decreaseTemperature() {

        if(isOn && temperature > 16){
            temperature = temperature - 1;
        }
    }

    public void setTemperature(int currentTemperature) {
        temperature = currentTemperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {

        if(isOn && temperature < 30) {
            temperature = temperature + 1;
        }
    }
}
