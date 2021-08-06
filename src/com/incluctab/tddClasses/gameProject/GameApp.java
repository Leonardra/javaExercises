package com.incluctab.tddClasses.gameProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameApp {
    private static final int[] scoreBoard = {0,0};
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        boolean continuePlaying = true;

        while(continuePlaying){
            Game newGame = new Game();
            GameFloor newBoard = new GameFloor();
            int userInput;
            int userChoice;
            do {

                System.out.println("Enter any number to play");
                displayMenu();
                try {
                    userInput = collectInput();
                    newGame.play(newBoard, userInput);
                    printEmptySpaces(50);
                    newBoard.displayBoard();
                    scorePoint(newBoard,newGame);
                }catch (InputMismatchException ime){
                    System.out.println("Enter valid position");
                }


            }while(!newGame.isGameOver());
            System.out.println("Current score: Player One "+ scoreBoard[0]+"| Player Two"+ scoreBoard[1]);
            System.out.println("Do you want to continue with game?");
            String options = """
                    Enter 1 to continue
                    Enter 2 to exit current game
                    """;
            System.out.println(options);
            userChoice = input.nextInt();
            if(userChoice == 1){
                continuePlaying = false;
            }
        }

    }

    public static void printEmptySpaces(int numberOfSpaces){
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.println(" ");
        }
    }

    public static void scorePoint(GameFloor floorBoard, Game newGame) {
        if(newGame.isGameWon(floorBoard, Player.PLAYER_ONE)) {
            scoreBoard[0] = scoreBoard[0] + 1;
        }
        if(newGame.isGameWon(floorBoard, Player.PLAYER_TWO)){
            scoreBoard[1] = scoreBoard[1] + 1;
        }
    }

    public static void displayMenu(){
        String gameDisplayMenu = """
                    1   2   3
                    4   5   6
                    7   8   9
                    """;
        System.out.println(gameDisplayMenu);
    }

    public static int collectInput(){
        return input.nextInt();
    }
}
