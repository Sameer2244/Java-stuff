package com.mygame.result;

import com.mygame.board.GameBoard;

public class Result {
	public static boolean result() {
		if((int)GameBoard.board[0][0]+(int)GameBoard.board[1][1]
				+(int)GameBoard.board[2][2]==264) {
			return true;
		}else if((int)GameBoard.board[2][0]+(int)GameBoard.board[1][1]
				+(int)GameBoard.board[0][2]==264) {
			return true;
		}else if((int)GameBoard.board[0][0]+(int)GameBoard.board[1][0]
				+(int)GameBoard.board[2][0]==264) {
			return true;
		}else if((int)GameBoard.board[0][0]+(int)GameBoard.board[0][1]
				+(int)GameBoard.board[0][2]==264) {
			return true;
		}else if((int)GameBoard.board[0][2]+(int)GameBoard.board[1][2]
				+(int)GameBoard.board[2][2]==264) {
			return true;
		}else if((int)GameBoard.board[2][2]+(int)GameBoard.board[2][1]
				+(int)GameBoard.board[2][0]==264) {
			return true;
		} else if((int)GameBoard.board[0][1]+(int)GameBoard.board[1][1]
				+(int)GameBoard.board[2][1]==264) {
			return true;
		} else if((int)GameBoard.board[1][0]+(int)GameBoard.board[1][1]
				+(int)GameBoard.board[1][2]==264) {
			return true;
		} 
		
		return false;
	}
	public static boolean resultforAi() {
		if((int)GameBoard.board[0][0]+(int)GameBoard.board[1][1]
				+(int)GameBoard.board[2][2]==237) {
			return true;
		}else if((int)GameBoard.board[2][0]+(int)GameBoard.board[1][1]
				+(int)GameBoard.board[0][2]==237) {
			return true;
		}else if((int)GameBoard.board[0][0]+(int)GameBoard.board[1][0]
				+(int)GameBoard.board[2][0]==237) {
			return true;
		}else if((int)GameBoard.board[0][0]+(int)GameBoard.board[0][1]
				+(int)GameBoard.board[0][2]==237) {
			return true;
		}else if((int)GameBoard.board[0][2]+(int)GameBoard.board[1][2]
				+(int)GameBoard.board[2][2]==237) {
			return true;
		}else if((int)GameBoard.board[2][2]+(int)GameBoard.board[2][1]
				+(int)GameBoard.board[2][0]==237) {
			return true;
		} else if((int)GameBoard.board[0][1]+(int)GameBoard.board[1][1]
				+(int)GameBoard.board[2][1]==237) {
			return true;
		} else if((int)GameBoard.board[1][0]+(int)GameBoard.board[1][1]
				+(int)GameBoard.board[1][2]==237) {
			return true;
		} 
		
		return false;
	}
}
