package com.mygame.main;

import java.util.Scanner;

import com.mygame.board.GameBoard;
import com.mygame.players.Computer;
import com.mygame.players.Gameplay;
import com.mygame.players.Valid;
import com.mygame.players.Player;
import com.mygame.result.Result;

public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static boolean endgame;
    public static void main(String[] args) {
    	GameBoard board =new GameBoard();
    	Player player=new Player();
    	Computer ai=new Computer();
        endgame=false;
        System.out.println("And the game is on!!");
        board.drawBoard();
        System.out.println();
        for(int i=0;i<9;i++){

        	if(Result.result()) {
                System.out.println("you win! :)");

                System.out.println("Thanks for Playing.");
        		break;
        	}
        	if(Result.resultforAi()) {
        		System.out.println("you lose :'(");

                System.out.println("It's your bad day,Thanks for Playing.");
        		break;
        	}
        	if(i%2==0) {
        		System.out.println("your turn");
        		player.turn(sc);
        	}else {
        		System.out.println("computers turn");
        		ai.turn(sc);
        	}
        	if(endgame) {
        		System.out.println("entered bad data,please restart the application.");
        		break;
        	}
            board.drawBoard();
            System.out.println();
        }
    }

	
}


