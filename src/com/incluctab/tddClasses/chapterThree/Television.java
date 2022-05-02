package com.incluctab.tddClasses.chapterThree;

public class Television {
    private boolean isOn;
    private int volume;
    private int channel;
    private int temporaryChannel;
    private int brightness;
    private boolean isMute;


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
        if(isOn && !isMute) {
            volume = volume - 1;
            if(volume < 0){
                this.setMute(true);
            }
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
        if(isOn){
            if(channel < 100){

                channel = channel + 1;
            } else {
                channel = channel - 99;
            }
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

    public void setMute(boolean mute) {
        this.isMute = mute;
    }

    public boolean getMute() {
        return isMute;
    }
}
