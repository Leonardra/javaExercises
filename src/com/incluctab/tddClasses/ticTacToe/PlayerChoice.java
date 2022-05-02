package com.incluctab.tddClasses.ticTacToe;

public enum PlayerChoice {
    PLAYER_ONE(Symbol.X), PLAYER_TWO(Symbol.O);

    private final Symbol symbol;

    PlayerChoice(Symbol symbol){
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
