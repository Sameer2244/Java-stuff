package com.mygame.players;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Computer implements Gameplay{

	static ThreadLocalRandom rand=ThreadLocalRandom.current();
	static int m;
	static boolean c;
	@Override
	public void turn(Scanner sc) {
		c=false;
		m=rand.nextInt(1,10);
		while(!c) {
			switch(m) {
			case 1:
				Valid.checkForAi(2,0);
				break;
			case 2:
				Valid.checkForAi(2,1);
				break;
			case 3:
				Valid.checkForAi(2,2);
				break;
			case 4:
				Valid.checkForAi(1,0);
				break;
			case 5:
				Valid.checkForAi(1,1);
				break;
			case 6:
				Valid.checkForAi(1,2);
				break;
			case 7:
				Valid.checkForAi(0,0);
				break;
			case 8:
				Valid.checkForAi(0,1);
				break;
			case 9:
				Valid.checkForAi(0,2);
				break;
			}
	}
	}
}
