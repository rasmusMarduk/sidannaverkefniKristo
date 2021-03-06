import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import tictactoe.*;

public class BoardTest {

    @Test
    public void TestInitializedBoard() 
    {
        // Arrange:
        Board board = new Board();
        char[] K = board.getBoardArray();
        String M = "";
        for(int i=0; i<9; i++)
        {
        	M += K[i];
        }
        
        String S = "123456789";
        
		// Assert:
        assertEquals(S, M);
    }

}
