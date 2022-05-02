package com.incluctab.tddClasses.ticTacToe;

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

            String welcomeMessage = """
                    "Welcome to the best Tic-Tac-Toe game in the universe"
                    Do you want to play against computer?
                    
                    1: Yes
                    2: No
                    """;

            System.out.println(welcomeMessage);
            int firstMenuInput = input.nextInt();

         if(firstMenuInput == 1){
             newGame.setPlayingWithCPU();

             String playerChoice = """
                    1: Become Player One
                    2: Become Player Two
                    """;

             System.out.println(playerChoice);
             int playerChoiceInput = input.nextInt();
             //based on player choice, set cpu

             switch(playerChoiceInput){
                 case 1:
                     //set to playerChoice one
                     newGame.setCpu(PlayerChoice.PLAYER_ONE);
                 case 2:
                     //set to playerChoice two
                     newGame.setCpu(PlayerChoice.PLAYER_TWO);
             }
         }
            do {

                try {
                    System.out.println("Enter any number to play");
                    displayMenu();
                    if(newGame.playingWithCPU && newGame.currentPlayerChoice == newGame.cpu) {
                        userInput = newGame.selectRandomly();
                    }
                    else {
                        userInput = collectInput();
                    }
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
            if(userChoice == 2){
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
        if(newGame.isGameWon(floorBoard, PlayerChoice.PLAYER_ONE)) {
            scoreBoard[0] = scoreBoard[0] + 1;
        }
        if(newGame.isGameWon(floorBoard, PlayerChoice.PLAYER_TWO)){
            scoreBoard[1] = scoreBoard[1] + 1;
        }
    }

    public static void tiePoint(GameFloor floorBoard, Game newGame) {
        if(newGame.isGameWon(floorBoard, PlayerChoice.PLAYER_ONE) && newGame.isGameTied()) {
            scoreBoard[0] = 0;
        }
        if(newGame.isGameWon(floorBoard, PlayerChoice.PLAYER_TWO) && newGame.isGameTied()){
            scoreBoard[1] = 0;
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
