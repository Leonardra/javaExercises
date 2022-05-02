package com.incluctab.tddClasses.ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    void testThatGameHasPlayerUponCreation(){
        Game ticTacToe = new Game();
        assertNotNull(ticTacToe.getPlayer());
    }

    @Test
    void testThatPlayerCanPlayOnGameSpace(){
        //given
        Game ticTacToe = new Game();
        GameFloor newGameBoard = new GameFloor();
        //when
        ticTacToe.play(newGameBoard, 2);
        //assert that
        assertEquals('X', newGameBoard.getFloor()[0][2]);
    }
    @Test
    void testThatPlayerTwoCanPlayImmediatelyAfterPlayerOne(){
        //given
        Game ticTacToe = new Game();
        GameFloor newGameBoard = new GameFloor();
        ticTacToe.play(newGameBoard, 2);
        assertEquals('X', newGameBoard.getFloor()[0][2]);
        //when
        ticTacToe.play(newGameBoard, 3);
        //assert that
        assertEquals('O', newGameBoard.getFloor()[0][4]);
    }

    @Test
    void thatNextPlayerCannotPlayInTheSameSpotAsPreviousPlayer(){
        //given
        Game ticTacToe = new Game();
        GameFloor newGameBoard = new GameFloor();
        ticTacToe.play(newGameBoard, 2);
        //when
        ticTacToe.play(newGameBoard,2);
        //assert that
        assertEquals('X', newGameBoard.getFloor()[0][2]);
    }

}
