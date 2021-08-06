package com.incluctab.tddClasses.gameProject;

public class GameFloor {
    private char[][] floor = {  {' ','|',' ','|',' '},
                                {'-','+','-','+','-'},
                                {' ','|',' ','|',' '},
                                {'-','+','-','+','-'},
                                {' ','|',' ','|',' '}
                                    };


    public char[][] getFloor() {
        return floor;
    }

    public int getLength(){
        return floor.length;
    }

    public void displayBoard(){
        for (char[] row : floor) {
            for (char block : row) {
                System.out.print(block);
            }
            System.out.println();
        }
    }
}
