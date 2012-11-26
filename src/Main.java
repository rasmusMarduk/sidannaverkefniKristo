/* 
 * This will be the main function for running the game
 *
 */

package Skoli;

import java.io.*;

public class Main{
	public static void main(String [] args){
		Board gameBoard = new Board();
	    Player player1 = new Player("", 'X');
	    Player player2 = new Player("", 'O');
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String cont="";
	    String markerString ="";
	    char markerPlaceChar = 'a';
		int markerPlace, tryCount;
	    
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
			
			tryCount = 0; markerPlace = -1;
					
			while (markerPlace < 0 || !Character.isDigit(markerPlaceChar) ||  
					markerString.length() != 1 || gameBoard.isFilled(markerPlace)){
										//Lesum inn reitaval þangað til við valið er löglegt
										//Það er lögleg ef það er tölustafur á bilinu 1-9 sem ekki hefur
										//nú þegar verið valinn.
				if (tryCount == 0)
					System.out.println("It's " + currentPlayer.getPlayerName() + "'s turn. Choose a number: ");
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
            	
            	if (!Character.isDigit(markerPlaceChar))
            		System.out.println("That's not a number! Try again:");
            	else if (markerString.length() != 1 || markerPlace < 0)
            		System.out.println("That's not a valid place number! Try again:");
            	else if (gameBoard.isFilled(markerPlace))
            		System.out.println("This place is already taken! Try again:");
            	
            							//Ef valið er skrítið, þá segjum við leikmanninum það
            	tryCount++;
			}
	    	
	    	gameBoard.updateBoard(markerPlace, currentPlayer.getPlayerMarker());
	    	
	    	if (gameBoard.isDraw(currentPlayer, gameBoard))
	    		break;
	    	else if (currentPlayer.isWinner(gameBoard))
	    		System.out.println(currentPlayer.getPlayerName() + " is the winner!");
	    	
	    	markCount++;
	    	
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
