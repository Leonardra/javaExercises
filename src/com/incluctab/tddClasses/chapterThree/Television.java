package com.incluctab.tddClasses.chapterThree;

public class Television {
    private boolean isOn;
    private int volume;
    private int channel;
    private int temporaryChannel;
    private int brightness;

    public Television(String brandName) {

    }

    public void setOn(boolean powerButton) {
        if(!powerButton){
            temporaryChannel = channel;
            channel = 0;
        }else{
            channel = temporaryChannel;
        }
        isOn = powerButton;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increaseVolume() {
        int maximumNumber = 10;
        if(isOn && volume < maximumNumber) {
            volume = volume + 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        int minimumNumber = 1;
        if(isOn && volume > minimumNumber) {
            volume = volume - 1;
        }
    }

    public void setChannel(int channelNumber) {
        if(isOn) {
            channel = channelNumber;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void increaseChannelFrequency() {
        if(isOn && channel < 100) {
            channel = channel + 1;
        }
    }

    public void decreaseChannelFrequency() {
        if(isOn && channel > 1) {
            channel = channel - 1;
        }
    }

    public void increaseBrightness() {
        brightness = brightness + 1;
    }

    public int getBrightness() {
        return brightness;
    }

    public void decreaseBrightness() {
        brightness = brightness - 1;
    }
}
