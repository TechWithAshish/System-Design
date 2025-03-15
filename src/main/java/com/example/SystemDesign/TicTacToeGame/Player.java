package com.example.SystemDesign.TicTacToeGame;

import com.example.SystemDesign.TicTacToeGame.Symbol.Symbol;

public class Player {
    public String name;
    public Symbol symbol;
    public Player(String name, Symbol symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
