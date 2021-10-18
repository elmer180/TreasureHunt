package com.company;

public class Main {

    public static void main(String[] args) {
        printBoard();


    }
    static void printBoard(){
            String[][] board = new String[8][8];
            for (int i = 0; i < board.length; i++) {
                board[i][0]= ("|"+i+"|");
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < 8; j++) {
                    board[i][j] = ("[]");
                    System.out.print(board[i][j]);
                }
                System.out.println("");
            }
        }
    }
//"+(Integer.toString(j+1))+","+(Integer.toString(i+1))+"
