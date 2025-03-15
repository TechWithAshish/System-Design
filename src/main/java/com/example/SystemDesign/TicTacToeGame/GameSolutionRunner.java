package com.example.SystemDesign.TicTacToeGame;

import com.example.SystemDesign.SolutionRunner;

public class GameSolutionRunner implements SolutionRunner {
    @Override
    public void run() {
        Game game = new Game();
        System.out.println("Let's play tic tac toe Game!!!");
        game.startGame();
    }
}
