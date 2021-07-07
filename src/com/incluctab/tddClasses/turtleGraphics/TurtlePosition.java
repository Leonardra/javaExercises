package com.incluctab.tddClasses.turtleGraphics;

public class TurtlePosition {

    private int columnPosition;
    private int rowPosition;

    public int getColumnPosition() {
        return columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition+=numberOfSteps;
    }

    public void increaseRowPositionBy(int numberOfSteps) {
        rowPosition+= numberOfSteps;
    }

    public void decreaseColumnPositionBy(int numberOfSteps) {
        columnPosition -= numberOfSteps;
    }

    public void decreaseRowPositionBy(int numberOfSteps) {
        rowPosition -= numberOfSteps;
    }
}
