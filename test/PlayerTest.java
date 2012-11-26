import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import tictactoe.*;

public class PlayerTest {

	@Test
	public void TestPlayerName() throws Exception {
		// Arrange
		Player player1 = new Player("lalli", 'X');

		// Assert
		assertEquals("lalli", player1.getPlayerName());
	}
	@Test
	public void TestPlayerMarker() throws Exception {
		// Arrange
		Player player1 = new Player("lalli", 'X');

		// Assert
		assertEquals('X', player1.getPlayerMarker());
	}
	@Test
	public void TestIsWinner() throws Exception {
		Board board = new Board();
		Player player = new Player("",'X');
		char x = player.getPlayerMarker();
		
		int j=0;
		for (int i=0; i<7; i+=3){
		board.updateBoard(i, x);
		board.updateBoard(i+1, x);
		board.updateBoard(i+2, x);
		
		assertEquals(true, player.isWinner(board));
		board.cleanBoard();
		
		j=i/3;
		board.updateBoard(j, x);
		board.updateBoard(j+3, x);
		board.updateBoard(j+6, x);
		assertEquals(true, player.isWinner(board));
		board.cleanBoard();
		}
		
		board.updateBoard(0, x);
		board.updateBoard(4, x);
		board.updateBoard(8, x);
		assertEquals(true, player.isWinner(board));
		board.cleanBoard();
		
		board.updateBoard(2, x);
		board.updateBoard(4, x);
		board.updateBoard(6, x);
		assertEquals(true, player.isWinner(board));
		board.cleanBoard();
		
		for (int i=1; i<9; i+=2)
			board.updateBoard(i, x);
		
		assertEquals(false, player.isWinner(board));
		
		
	}
}
