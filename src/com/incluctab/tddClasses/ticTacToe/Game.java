package com.incluctab.tddClasses.ticTacToe;

import java.util.Random;

public class Game {
    public PlayerChoice currentPlayerChoice;
    private PlayerChoice winner;
    private boolean gameIsOver;
    private boolean gameIsTied;
    public boolean playingWithCPU;
    public PlayerChoice cpu;


    public Game(){
        currentPlayerChoice = PlayerChoice.PLAYER_ONE;
        playingWithCPU = false;
    }

    public void play(GameFloor newBoard, int position) {
        PlayerPosition playerPosition = new PlayerPosition();
        if(isGameBoardFilled(newBoard, position)){
            playerPosition.setPosition(position);
            if(currentPlayerChoice.equals(PlayerChoice.PLAYER_ONE)){
                newBoard.getFloor()[playerPosition.getRowPosition()][playerPosition.getColumnPosition()] = Symbol.X.get();
            }
            if(currentPlayerChoice.equals(PlayerChoice.PLAYER_TWO)){
                newBoard.getFloor()[playerPosition.getRowPosition()][playerPosition.getColumnPosition()] = Symbol.O.get();
            }
            switchPlayer();
        }else{
            System.out.println("Play Again");
        }

    }

    private void switchPlayer(){
        if(currentPlayerChoice.equals(PlayerChoice.PLAYER_ONE)){
            currentPlayerChoice = PlayerChoice.PLAYER_TWO;
        }else{
            currentPlayerChoice = PlayerChoice.PLAYER_ONE;
        }
    }

    public PlayerChoice getPlayer() {
        return currentPlayerChoice;
    }

    private boolean isGameBoardFilled(GameFloor newBoard, int position){
        PlayerPosition playerPosition = new PlayerPosition();
        playerPosition.setPosition(position);
        return newBoard.getFloor()[playerPosition.getRowPosition()][playerPosition.getColumnPosition()] == ' ';
    }

    public boolean isGameWon(GameFloor floorBoard, PlayerChoice playerChoice) {
        boolean firstCell = floorBoard.getFloor()[0][0] == playerChoice.getSymbol().get();
        boolean secondCell = floorBoard.getFloor()[0][2] == playerChoice.getSymbol().get();
        boolean thirdCell = floorBoard.getFloor()[0][4] == playerChoice.getSymbol().get();
        boolean fourthCell = floorBoard.getFloor()[2][0] == playerChoice.getSymbol().get();
        boolean fifthCell = floorBoard.getFloor()[2][2] == playerChoice.getSymbol().get();
        boolean sixthCell = floorBoard.getFloor()[2][4] == playerChoice.getSymbol().get();
        boolean seventhCell = floorBoard.getFloor()[4][0] == playerChoice.getSymbol().get();
        boolean eighthCell  = floorBoard.getFloor()[4][2] == playerChoice.getSymbol().get();
        boolean ninthCell = floorBoard.getFloor()[4][4] == playerChoice.getSymbol().get();

        boolean result;

        if(firstCell && secondCell && thirdCell){
           result = true;
        }else{
            if(fourthCell && fifthCell && sixthCell){
                result = true;

            }else if(seventhCell && eighthCell  && ninthCell){
                result = true;
            }else if(firstCell && fourthCell && seventhCell){
                result = true;
            }else if(secondCell && fifthCell && eighthCell ){
                result = true;
            }else if(thirdCell && sixthCell && ninthCell){
                result = true;
            }else if(firstCell && fifthCell && ninthCell){
                result = true;
            }else if(thirdCell && fifthCell && seventhCell){
                result = true;
            }else{
                result = false;
            }

            if(result){
                winner= playerChoice;
                gameIsOver = true;
            }else{
                gameIsTied = true;
            }
        }
            return result;
    }

    public void isGameTied(GameFloor floorBoard, PlayerChoice playerChoice){
        boolean firstCell = floorBoard.getFloor()[0][0] == playerChoice.getSymbol().get();
        boolean secondCell = floorBoard.getFloor()[0][2] == playerChoice.getSymbol().get();
        boolean thirdCell = floorBoard.getFloor()[0][4] == playerChoice.getSymbol().get();
        boolean fourthCell = floorBoard.getFloor()[2][0] == playerChoice.getSymbol().get();
        boolean fifthCell = floorBoard.getFloor()[2][2] == playerChoice.getSymbol().get();
        boolean sixthCell = floorBoard.getFloor()[2][4] == playerChoice.getSymbol().get();
        boolean seventhCell = floorBoard.getFloor()[4][0] == playerChoice.getSymbol().get();
        boolean eighthCell  = floorBoard.getFloor()[4][2] == playerChoice.getSymbol().get();
        boolean ninthCell = floorBoard.getFloor()[4][4] == playerChoice.getSymbol().get();


        boolean firstWinningCondition = firstCell && secondCell && thirdCell;
        boolean secondWinningCondition = fourthCell && fifthCell && sixthCell;
        boolean thirdWinningCondition = seventhCell && eighthCell  && ninthCell;
        boolean fourthWinningCondition = firstCell && fourthCell && seventhCell;
        boolean fifthWinningCondition = secondCell && fifthCell && eighthCell;
        boolean sixthWinningCondition = thirdCell && sixthCell && ninthCell;
        boolean seventhWinningCondition = firstCell && fifthCell && ninthCell;
        boolean eighthWinningCondition = thirdCell && fifthCell && seventhCell;

        if(!firstWinningCondition && !secondWinningCondition && !thirdWinningCondition && !fourthWinningCondition
        && !fifthWinningCondition && !sixthWinningCondition && !seventhWinningCondition && !eighthWinningCondition){
            gameIsTied = true;
        }
    }

    public void setPlayingWithCPU(){
        playingWithCPU = true;
    }

    public void setCpu(PlayerChoice player){
        cpu = player;
    }

    public boolean isGameOver(){
        return gameIsOver;
    }

    public boolean isGameTied(){
        return gameIsTied;
    }

    public int selectRandomly(){
        Random rand = new Random();
        return rand.nextInt(9)+1;
    }

}
