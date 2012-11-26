/*
 * This will be the player implementations.
 *
 */

package tictactoe;

public class Player{
	private String name;
	private char marker;
	
	public Player(String name1, char marker1){
		this.name = name1;
		this.marker = marker1;
	}

	public void setPlayerName(String player) {
		this.name = player;
	}

	public void setPlayerMaker(char marker1){
		this.marker = marker1;
	}

	public String getPlayerName(){
		return name;
	}

	public char getPlayerMarker(){
		return marker;
	}

	public boolean isWinner(Board board) {	
        char[] gameBoard = board.getBoardArray();

		char marker = getPlayerMarker();
		
		for (int i=0; i<7; i+=3)
		{
			int j=i/3; 
			if ((gameBoard[i] == marker && gameBoard[i+1] == marker && gameBoard[i+2] == marker) ||		//Tékkum á röðunum..
				(gameBoard[j] == marker && gameBoard[j+3] == marker && gameBoard[j+6] == marker))		//..og dálkunum..
				return true;
				
		}

		if ((gameBoard[0] == marker && gameBoard[4] == marker && gameBoard[8] == marker) ||		//..og hornalínunum.
			(gameBoard[2] == marker && gameBoard[4] == marker && gameBoard[6] == marker))
			return true;
			

		return false;
	}
	
}

