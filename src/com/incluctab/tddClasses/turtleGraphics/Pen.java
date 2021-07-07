package com.incluctab.tddClasses.turtleGraphics;

public class Pen {

    private PenPosition penPosition;

    public Pen(){
        penPosition = PenPosition.UP;
    }

    public PenPosition getPosition() {
        return penPosition;
    }

    public void setPosition(PenPosition penPosition) {
        this.penPosition = penPosition;
    }
}
