package com.incluctab.tddClasses.turtleGraphics;

import static com.incluctab.tddClasses.turtleGraphics.Direction.*;
import static com.incluctab.tddClasses.turtleGraphics.PenPosition.*;

public class Turtle {

    private Pen pen;
    private Direction currentDirection;
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
        switch (currentDirection) {
            case SOUTH -> myPosition.increaseRowPositionBy(numberOfSteps-1);
            case WEST -> myPosition.decreaseColumnPositionBy(numberOfSteps-1);
            case EAST -> myPosition.increaseColumnPositionBy(numberOfSteps-1);
            case NORTH -> myPosition.decreaseRowPositionBy(numberOfSteps-1);
        }

    }

    public void moveForward(int numberOfSteps, Sketchpad sketchpad) {
        if(pen.getPosition().equals(DOWN)){
                int columnPosition = myPosition.getColumnPosition();
                int rowPosition = myPosition.getRowPosition();
            switch (currentDirection){
                case EAST -> {
                    for (int i = columnPosition; i < columnPosition+numberOfSteps; i++) {
                    sketchpad.getFloor()[rowPosition][i] = 1;
                    }
                }
                case WEST -> {
                    for (int i = columnPosition; i > columnPosition-numberOfSteps; i--) {
                    sketchpad.getFloor()[rowPosition][i] = 1;
                    }
                }
                case SOUTH -> {
                    for (int i = rowPosition; i < rowPosition+numberOfSteps; i++) {
                    sketchpad.getFloor()[i][columnPosition] = 1;
                    }
                }
                case NORTH -> {
                    for (int i = rowPosition; i > rowPosition-numberOfSteps; i--) {
                    sketchpad.getFloor()[i][columnPosition] = 1;
                    }
                }
            }
        }
        moveForward(numberOfSteps);
    }
}
