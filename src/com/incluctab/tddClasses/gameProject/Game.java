package com.incluctab.tddClasses.gameProject;

public class Game {
    private Player currentPlayer;
    private Player winner;
    private boolean gameIsOver;


    public Game(){
        currentPlayer = Player.PLAYER_ONE;
    }

    public void play(GameFloor newBoard, int position) {
        PlayerPosition playerPosition = new PlayerPosition();
        if(isGameBoardFilled(newBoard, position)){
            playerPosition.setPosition(position);
            if(currentPlayer.equals(Player.PLAYER_ONE)){
                newBoard.getFloor()[playerPosition.getRowPosition()][playerPosition.getColumnPosition()] = Symbol.X.get();
            }
            if(currentPlayer.equals(Player.PLAYER_TWO)){
                newBoard.getFloor()[playerPosition.getRowPosition()][playerPosition.getColumnPosition()] = Symbol.O.get();
            }
            switchPlayer();
        }else{
            System.out.println("Play Again");
        }

    }

    private void switchPlayer(){
        if(currentPlayer.equals(Player.PLAYER_ONE)){
            currentPlayer = Player.PLAYER_TWO;
        }else{
            currentPlayer = Player.PLAYER_ONE;
        }
    }

    public Player getPlayer() {
        return currentPlayer;
    }

    private boolean isGameBoardFilled(GameFloor newBoard, int position){
        PlayerPosition playerPosition = new PlayerPosition();
        playerPosition.setPosition(position);
        return newBoard.getFloor()[playerPosition.getRowPosition()][playerPosition.getColumnPosition()] == ' ';
    }

    public boolean isGameWon(GameFloor floorBoard, Player player) {
        boolean firstCell = floorBoard.getFloor()[0][0] == player.getSymbol().get();
        boolean secondCell = floorBoard.getFloor()[0][2] == player.getSymbol().get();
        boolean thirdCell = floorBoard.getFloor()[0][4] == player.getSymbol().get();
        boolean fourthCell = floorBoard.getFloor()[2][0] == player.getSymbol().get();
        boolean fifthCell = floorBoard.getFloor()[2][2] == player.getSymbol().get();
        boolean sixthCell = floorBoard.getFloor()[2][4] == player.getSymbol().get();
        boolean seventhCell = floorBoard.getFloor()[4][0] == player.getSymbol().get();
        boolean eighthCell  = floorBoard.getFloor()[4][2] == player.getSymbol().get();
        boolean ninthCell = floorBoard.getFloor()[4][4] == player.getSymbol().get();

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
                winner= player;
                gameIsOver = true;
            }
        }
            return result;
    }

    public boolean isGameOver(){
        return gameIsOver;
    }

}
