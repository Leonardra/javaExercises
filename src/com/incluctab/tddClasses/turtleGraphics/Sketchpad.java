package com.incluctab.tddClasses.turtleGraphics;

public class Sketchpad {

    private int[][] floor;

    public Sketchpad(int numberOfRows, int numberOfColumn) {
        floor = new int[numberOfRows][numberOfColumn];
    }

    public int[][] getFloor() {
        return floor;
    }

    public void displaySketchPad(){
        for (int[] row : floor) {
            for (int block : row) {
                if (block == 1)
                System.out.print("# ");
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

}
