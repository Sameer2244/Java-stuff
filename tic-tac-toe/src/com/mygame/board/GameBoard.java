package com.mygame.board;

public class GameBoard {
	public static char[][] board=new char[3][3];
    public GameBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]='_';
            }
       
        }
    }
    public void drawBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
