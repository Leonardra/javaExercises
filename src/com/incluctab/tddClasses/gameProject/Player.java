package com.incluctab.tddClasses.gameProject;

public enum Player {
    PLAYER_ONE(Symbol.X), PLAYER_TWO(Symbol.O);

    private final Symbol symbol;

    Player(Symbol symbol){
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
