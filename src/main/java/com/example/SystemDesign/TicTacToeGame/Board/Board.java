package com.example.SystemDesign.TicTacToeGame.Board;

import com.example.SystemDesign.TicTacToeGame.Symbol.Symbol;
import com.example.SystemDesign.TicTacToeGame.Symbol.SymbolType;

public class Board {
    public int size;
    public Symbol[][] board;
    public int elements;
    public Board(int size){
        this.size = size;
        this.board = new Symbol[size][size];
        elements = size * size;
    }
    public boolean checkPoint(int[] arr){
        if(board[arr[0]][arr[1]] == null){
            return true;
        }
        return false;
    }
    public void fillBox(Symbol symbol, int[] points){
        board[points[0]][points[1]] = symbol;
        elements--;
    }
    public boolean checkWinner(int[] points, Symbol symbol){
        int rowCnt = 0;
        int colCnt = 0;
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int tempSize = size - 1;
        for(int i = 0; i < size; i++){
            if(board[i][points[1]] == symbol){
                rowCnt++;
            }
            if(board[points[0]][i] == symbol){
                colCnt++;
            }
            if(board[i][i] == symbol){
                leftDiagonal++;
            }
            if(board[i][tempSize--] == symbol){
                rightDiagonal++;
            }
        }
        return rowCnt == size || colCnt == size || leftDiagonal == size || rightDiagonal == size;
    }
    public void printBoard(){
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(board[i][j] == null){
                    System.out.print(" ");
                }else{
                    System.out.print(board[i][j].symbolType);
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
