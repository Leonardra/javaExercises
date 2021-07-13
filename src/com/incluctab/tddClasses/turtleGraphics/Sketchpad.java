package com.incluctab.tddClasses.turtleGraphics;

public class Sketchpad {

    private int[][] floor;

    public Sketchpad(int numberOfRows, int numberOfColumn) {
        floor = new int[numberOfRows][numberOfColumn];
    }

    public int[][] getFloor() {
        return floor;
    }
}
