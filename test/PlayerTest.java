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
	
	public void TestPlayerMarker() throws Exception {
			// Arrange
			Player player1 = new Player("lalli", 'X');

			// Assert
			assertEquals('X', player1.getPlayerMarker());
	}
}
