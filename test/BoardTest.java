package tictactoe;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;


public class BoardTest {

    @Test
    public void TestInitializedBoard() 
    {
        // Arrange:
        Board board = new Board();
		char[] charArray = {'1','2','3','4','5','6','7','8','9'};

        // Assert:
        Assert.assertArrayEquals(charArray, board.getBoardArray());
    }
	@Test
    public void TestUpdateBoard()
    {
        // Arrange:
        Board board = new Board();

        // Assert:
        Assert.assertTrue(board.updateBoard(1, 'X'));
        Assert.assertFalse(board.updateBoard(21, 'X'));
    }
}
