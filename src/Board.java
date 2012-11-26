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
		this.boardArray[place] = marker;	//Breytti �essu aftur � void �r boolean �v� 
	}										//�a� hentar betur a� hafa villut�kk � main fallinu.
	
	public void cleanBoard(){
		for (int i=0; i<9; i++){
			this.boardArray[i] = (char)(i+49);
		}
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
	
	public boolean isFilled(int i) //T�kkar hvort s� b�i� a� merkja � reit i � bor�inu
	{
		if (boardArray[i] == 'O' || boardArray[i] == 'X')
			return true;
		
		return false;
	}
	
	public boolean isFull()
	{
		if (isFilled(0) && isFilled(1) && isFilled(2) && isFilled(3) && isFilled(4) &&
			isFilled(5) && isFilled(6) && isFilled(7) && isFilled(8) )
			return true;
		
		return false;
		
	}
			
	
	
	public boolean isDraw(Player player, Board board) {
				
		for (int i=0; i<9; i++)
			if (isFull() && !player.isWinner(board)){
				System.out.println("It's a draw!");
				return true;
			}
		
		return false;
	}
	
}
 
