package com.example.SystemDesign.TicTacToeGame;

import com.example.SystemDesign.TicTacToeGame.Board.Board;
import com.example.SystemDesign.TicTacToeGame.Symbol.Symbol;
import com.example.SystemDesign.TicTacToeGame.Symbol.SymbolO;
import com.example.SystemDesign.TicTacToeGame.Symbol.SymbolType;
import com.example.SystemDesign.TicTacToeGame.Symbol.SymbolX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    public Deque<Player> players;
    public Board board;
    Scanner scanner;

    public Game(){
        Symbol symbolX = new SymbolX(SymbolType.X);
        Symbol symbolO = new SymbolO(SymbolType.O);
        Player player1 = new Player("Player1", symbolX);
        Player player2 = new Player("Player2", symbolO);
        board = new Board(3);
        players = new ArrayDeque<>();
        players.add(player1);
        players.add(player2);
        scanner = new Scanner(System.in);
    }

    public void startGame(){
        while(board.elements > 0){
            Player player = players.pollFirst();
            board.printBoard();
            while(true){
                System.out.println("Input your symbol coordinate "+player.getName());
                int[] points = readInput();
                if(board.checkPoint(points)){
                    board.fillBox(player.getSymbol(), points);
                    if(board.checkWinner(points, player.getSymbol())){
                        board.printBoard();
                        System.out.println("Winner is :- "+player.getName());
                        System.exit(0);
                    }
                    break;
                }
                System.out.println("Your had entered incorrect location. Please try again");
            }

            players.addLast(player);

        }
        board.printBoard();
        System.out.println("Winner is :- Tie");
    }
    public int[] readInput(){
        String[] s = scanner.nextLine().split(",");
        return new int[]{Integer.parseInt(s[0]), Integer.parseInt(s[1])};
    }
}
