package com.mygame.players;

import java.util.Scanner;

import com.mygame.board.GameBoard;
import com.mygame.main.Main;

public class Valid {
	public static void check(int x,int y) {
		if(GameBoard.board[x][y]=='_')
		{
			GameBoard.board[x][y]='X';
			Player.t=true;
		}else {
			System.out.println("This place already taken,try again!");
			Player.n=Main.sc.nextInt();
		}
	}
	public static void checkForAi(int x,int y) {
		if(GameBoard.board[x][y]=='_')
		{
			GameBoard.board[x][y]='O';
			Computer.c=true;
		}else {
			Computer.m=Computer.rand.nextInt(1,10);
		}
	}
}
