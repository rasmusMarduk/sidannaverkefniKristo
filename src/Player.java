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
		//char[] gameBoard = new char[9];
		//gameBoard = Board();
		//char[] gameBoard = new char[9];
		
        char[] gameBoard = board.getBoardArray();

		
		//gameBoard = Board.getBoardArray();
		char marker = getPlayerMarker();
		
		for (int i=0; i<3; i+=3)
		{int j=i/3; 
			if ((gameBoard[i] == marker && gameBoard[i+1] == marker && gameBoard[i+2] == marker) ||
		(gameBoard[j] == marker && gameBoard[j+3] == marker && gameBoard[j+6] == marker))
		return true;}	

		if ((gameBoard[0] == marker && gameBoard[4] == marker && gameBoard[8] == marker) ||
		(gameBoard[2] == marker && gameBoard[4] == marker && gameBoard[6] == marker))
		return true;

		return false;
		}
}

