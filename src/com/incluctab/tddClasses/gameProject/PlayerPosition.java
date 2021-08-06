package com.incluctab.tddClasses.gameProject;

import java.util.InputMismatchException;

public class PlayerPosition {
    private int columnPosition;
    private int rowPosition;

    public int getColumnPosition() {
        return columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setPosition(int position) {
        switch (position) {
            case 1 -> {
                rowPosition = 0;
                columnPosition = 0;
            }
            case 2 -> {
                rowPosition = 0;
                columnPosition = 2;
            }
            case 3 -> {
                rowPosition = 0;
                columnPosition = 4;
            }
            case 4 -> {
                rowPosition = 2;
                columnPosition = 0;
            }
            case 5 -> {
                rowPosition = 2;
                columnPosition = 2;
            }
            case 6 -> {
                rowPosition = 2;
                columnPosition = 4;
            }
            case 7 -> {
                rowPosition = 4;
                columnPosition = 0;
            }
            case 8 -> {
                rowPosition = 4;
                columnPosition = 2;
            }
            case 9 -> {
                columnPosition = 4;
                rowPosition = 4;
            }
            default -> throw new InputMismatchException();
        }
    }
}
