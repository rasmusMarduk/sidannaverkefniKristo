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
}
