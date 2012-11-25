/* 
 * This will be the main function for running the game
 *
 */

package tictactoe;

import java.io.*;

public class Main{
	public static void main(String [] args){
		Board gameBoard = new Board();
		//char[] theGameBoard = gameBoard.getBoardArray();
	    Player player1 = new Player("", 'X');
	    Player player2 = new Player("", 'O');
		//boolean isWinner = false;
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String cont="";
	    String markerString ="";
	    char markerPlaceChar;
		int markerPlace;
	    
	    do {
		
	    player1.setPlayerName("");
	    player2.setPlayerName("");
	    	
	    System.out.println("- - - - - TicTacToe - - - - -");
		System.out.println("Welcome to a game of TicTacToe!");
        
        while ( player1.getPlayerName() == "" )
        {
            System.out.println("Please enter a name for Player 1: ");
            try
            {
                player1.setPlayerName( in.readLine() );
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }

        
        while ( player2.getPlayerName() == "" )
        {
            System.out.println("Please enter a name for Player 2: ");
            try
            {
                player2.setPlayerName( in.readLine() );  
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
        	}
        } 
     	
		Player currentPlayer = player1;
		
		int markCount = 0;
		
		
		while( !currentPlayer.isWinner(gameBoard)){
			if (currentPlayer == player1 && markCount != 0)
				currentPlayer = player2;
			else if (markCount != 0)
				currentPlayer = player1;
		
			gameBoard.printBoard();
			
	    	System.out.println("It's " + currentPlayer.getPlayerName() + " turn. Choose a number: ");
            try
            {
            	markerString = in.readLine();  
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
        	}
            
	    	
	    	markerPlaceChar = markerString.charAt(0);
	    	markerPlace = markerPlaceChar - 49;
	    	
	    	//theGameBoard[markerPlace] = currentPlayer.getPlayerMarker();
	    	
	    	gameBoard.updateBoard(markerPlace, currentPlayer.getPlayerMarker());
	    	
	    	if (gameBoard.isDraw(currentPlayer, gameBoard))
	    		break;
	    	else if (currentPlayer.isWinner(gameBoard))
	    		System.out.println(currentPlayer.getPlayerName() + " is the winner!");
	    	
	    	markCount++;
	    	
	    }
		
			}
		gameBoard.printBoard();
		gameBoard.cleanBoard();
		System.out.println("Play another game? (y/n)");
        try
        {
        	cont = in.readLine(); 
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
    	}
    	
		} while (cont.toUpperCase().charAt(0) == 'Y' );
	}
	
	
}
