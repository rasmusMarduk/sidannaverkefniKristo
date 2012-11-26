package tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void TestInitializedBoard() 
    {
        // Arrange:
        Board board = new Board();
        char[] K=board.getBoardArray();
        String M="";
        for(int i=0; i<9; i++)
        {
        	M+=K[i];
        }
        
        String S = "123456789";
        
		// Assert:
        assertEquals(S, M);
    }
<<<<<<< HEAD
	
=======
>>>>>>> 02648d20361fee35e8dc2a514d28ae2783dcea09
}
