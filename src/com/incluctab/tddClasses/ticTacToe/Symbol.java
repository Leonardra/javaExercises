package com.incluctab.tddClasses.ticTacToe;

public enum Symbol {
    X ('X'), O('O');


    private final char symbol;

    Symbol(char sym) {
        this.symbol = sym;
    }

    public char get() {
        return symbol;
    }
}