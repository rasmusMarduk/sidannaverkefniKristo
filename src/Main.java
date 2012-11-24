/* 
 * This will be the main function for running the game
 *
 */

package tictactoe;

import java.io.*;

public class Main{
	public static void main(String [] args){
		Board gameBoard = new Board();
	    Player player1 = new Player("", 'X');
	    Player player2 = new Player("", 'O');
		boolean isWinner = false;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("- - - - - TicTacToe - - - - -");
		System.out.println("Welcome to a game of TicTacToe!");
        
        while ( !(player1.getPlayerName() == "") )
        {
            System.out.println("Please enter a name for Player 1: ");
            try
            {
                player1.setPlayerName( in.readLine() );
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        } 

        
        while ( !(player2.getPlayerName() == "") )

        {
            System.out.println("Please enter a name for Player 2: ");
            try
            {
                player2.setPlayerName( in.readLine() );
                
            } catch (IOException e) {
                e.printStackTrace();
        	}
        } 
     	
		String currentPlayer = player2.getPlayerName();
		int playCount = 0;
		while( !isWinner || (playCount == 10)){
			if ( currentPlayer == player1.getPlayerName() ){
				currentPlayer = player2.getPlayerName();
			}
			else {
				currentPlayer = player1.getPlayerName();
			}

	    	System.out.println("It's " + currentPlayer + " turn. Choose a number: ");
   	    	// Check rows
	        
	            // 0 1 2 , 3 4 5 , 6 7 8
				
			// Check columns
   	     
				// 0 3 6 , 1 4 7 , 2 5 8
   	     
   	    	// Check diagonals
   	     
		 		// 0 4 7 , 2 4 6
	        isWinner = true;
	    }
	}
	
	public boolean isDraw(Board board) {
		char[] gameBoard = board.getBoardArray();
		//board = gameBoard;
		
		for (int i=0; i<7; i+=3)
		{
			int j=i/3; 
			if (((board.isFilled(i) || board.isFilled(i+1) || board.isFilled(i+2)) &&	//Tékkum á röðunum..
				(gameBoard[i] == gameBoard[i+1] && gameBoard[i] == gameBoard[i+2])) ||
				((board.isFilled(j) || board.isFilled(j+3) || board.isFilled(j+6)) && 	//..og dálkunum..
				(gameBoard[j] == gameBoard[j+3] && gameBoard[j] == gameBoard[j+6])))
				return true;
		}
		
		if (((board.isFilled(0) || board.isFilled(4) || board.isFilled(8)) &&	//..og hornalínunum.
			(gameBoard[0] == gameBoard[4] && gameBoard[0] == gameBoard[8])) ||
			((board.isFilled(2) || board.isFilled(4) || board.isFilled(6)) &&
			(gameBoard[2] == gameBoard[4] && gameBoard[2] == gameBoard[6])))
			return true;
		
		return false;
	}
}
