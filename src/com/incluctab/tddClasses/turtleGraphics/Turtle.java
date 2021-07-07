package com.incluctab.tddClasses.turtleGraphics;

import static com.incluctab.tddClasses.turtleGraphics.Direction.*;
import static com.incluctab.tddClasses.turtleGraphics.PenPosition.*;

public class Turtle {

    private Pen pen;
     Direction currentDirection;
    private TurtlePosition myPosition;

    public Turtle() {
        pen = new Pen();
        currentDirection = EAST;
        myPosition = new TurtlePosition();
    }


    public void setPen(Pen newPen) {
        pen = newPen;
    }

    public Pen getPen() {
        return pen;
    }

    public void turnPenDown() {
        pen.setPosition(DOWN);
    }

    public PenPosition getPenPosition() {
        return pen.getPosition();
    }

    public void turnPenUp() {
        pen.setPosition(UP);
    }

    public Direction getDirection() {
        return currentDirection;
    }

    public void turnRight() {

        switch(currentDirection){
            case WEST -> currentDirection = NORTH;
            case EAST -> currentDirection = SOUTH;
            case NORTH -> currentDirection = EAST;
            case SOUTH -> currentDirection = WEST;
        }
    }

    public void turnLeft() {

        switch (currentDirection) {
            case SOUTH -> currentDirection = EAST;
            case WEST -> currentDirection = SOUTH;
            case EAST -> currentDirection = NORTH;
            case NORTH -> currentDirection = WEST;
        }

    }

    public TurtlePosition getTurtlePosition() {
        return myPosition;
    }

    public void moveForward(int numberOfSteps) {
        if(currentDirection == SOUTH)myPosition.increaseRowPositionBy(numberOfSteps);
        if(currentDirection == WEST)myPosition.decreaseColumnPositionBy(numberOfSteps);
        if(currentDirection == EAST)myPosition.increaseColumnPositionBy(numberOfSteps);
        if(currentDirection == NORTH)myPosition.decreaseRowPositionBy(numberOfSteps);
    }
}
