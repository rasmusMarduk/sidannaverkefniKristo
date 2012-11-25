/*
 * This will be the board function for the TicTacToe game.
 *
 */

package tictactoe;

import java.io.*;

public class Board{
	private char[] boardArray;

	public Board(){
		boardArray = new char[9];
		for(int i = 0; i < 9; i++){
			boardArray[i] = (char)(i+49);
		}
	}
	
	public void updateBoard(int place, char marker){
		this.boardArray[place] = marker;
	}

	public void printBoard(){
		for(int i = 0; i < 9; i++){
			System.out.printf("[" + this.boardArray[i] + "]");
			if ( (i == 2) || (i == 5) || (i == 8) ){
				System.out.printf("\n");
			}
		}
	}
	
	public char[] getBoardArray()
	{
		return boardArray;
	}
	
	public boolean isFilled(int i) //Tékkar hvort sé búið að merkja í reit i á borðinu
	{
		if (boardArray[i] == 'O' || boardArray[i] == 'X')
			return true;
		
		return false;
	}
	public boolean isDraw() {
		//char[] gameBoard = getBoardArray();
		//board = gameBoard;
		
		for (int i=0; i<7; i+=3)
		{
			int j=i/3; 
			if (((isFilled(i) || isFilled(i+1) || isFilled(i+2)) &&	//Tékkum á röðunum..
				!(boardArray[i] == boardArray[i+1] && boardArray[i] == boardArray[i+2])) ||
				((isFilled(j) || isFilled(j+3) || isFilled(j+6)) && 	//..og dálkunum..
				!(boardArray[j] == boardArray[j+3] && boardArray[j] == boardArray[j+6])))
			{
				System.out.println("It's a draw!");
				return true;
			}		
		}
		
		if (((isFilled(0) || isFilled(4) || isFilled(8)) &&	//..og hornalínunum.
			!(boardArray[0] == boardArray[4] && boardArray[0] == boardArray[8])) ||
			((isFilled(2) || isFilled(4) || isFilled(6)) &&
			!(boardArray[2] == boardArray[4] && boardArray[2] == boardArray[6])))
		{
			System.out.println("It's a draw!");
			return true;
		}
		return false;
	}
	
}
 
