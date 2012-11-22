/*
 * This will be the board function for the TicTacToe game.
 *
 */

package tictactoe;

import java.io.*;

public class Board{
	private char[] boardArray;

	public Board(){
		for(int i = 0; i < 9; i++){
			boardArray[i] = (char)(i+49);
		}
	}
	
	public void updateBoard(int place, char marker){
		this.boardArray[place-1] = marker;
	}

	public void printBoard(){
		for(int i = 0; i < 9; i++){
			System.out.printf("[" + this.boardArray[i] + "]");
			if ( (i == 2) || (i == 5) || (i == 8) ){
				System.out.printf("\n");
			}
		}
	}
}
 
