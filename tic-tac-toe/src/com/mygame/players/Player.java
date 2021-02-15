package com.mygame.players;

import java.util.Scanner;

import com.mygame.main.Main;

public class Player implements Gameplay{

	static boolean t;
	static int n;
	public void turn(Scanner sc) {
		t=false;
		try {
		n=sc.nextInt();
		while(!t) {
			switch(n) {
			case 1:
				Valid.check(2,0);
				break;
			case 2:
				Valid.check(2,1);
				break;
			case 3:
				Valid.check(2,2);
				break;
			case 4:
				Valid.check(1,0);
				break;
			case 5:
				Valid.check(1,1);
				break;
			case 6:
				Valid.check(1,2);
				break;
			case 7:
				Valid.check(0,0);
				break;
			case 8:
				Valid.check(0,1);
				break;
			case 9:
				Valid.check(0,2);
				break;
			default:
				System.out.println("invalid turn");
				n=sc.nextInt();
				break;
				}
			}
		}catch(Exception e) {
			System.out.println("invalid input");
			Main.endgame=true;
		}
}
	}
	